package rules.controllers;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rules.beans.CK_Rizik;
import rules.beans.CalculatorData;
import rules.model.CoefficientsAndPrices;
import rules.model.InsuredPerson;
import rules.model.RulesModel;
import rules.repositories.CK_Rizik_Repository;

import java.util.concurrent.TimeUnit;

@RestController
public class CalculatorController {

    @Autowired
    CK_Rizik_Repository rr;

    @CrossOrigin
    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public Double rules(@RequestBody CalculatorData data) {

        KieServices ks = KieServices.Factory.get();

        KieContainer kContainer = ks.getKieClasspathContainer();

        //KieBase kb = kContainer.getKieBase("rules");

        KieSession kSession = kContainer.newKieSession("ksession-rules");

        CK_Rizik sport = rr.findByRizik(data.getSelectedSport());
        CK_Rizik amount = rr.findByRizik(data.getSelectedInsuranceAmount());
        CK_Rizik location = rr.findByRizik(data.getSelectedLocation());
        CK_Rizik dayPrice = rr.findByRizik(11);
        CK_Rizik youngs = rr.findByRizik(4);
        CK_Rizik adults = rr.findByRizik(5);
        CK_Rizik olds = rr.findByRizik(6);

        long diff = data.getDateTo().getTime() - data.getDateFrom().getTime();
        int daysDiff = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);


        CoefficientsAndPrices cp = new CoefficientsAndPrices();
        cp.setYoungsCoefficient(youngs.getKoeficijent_CK_Rizik());
        cp.setAdultsCoefficient(adults.getKoeficijent_CK_Rizik());
        cp.setOldsCoefficient(olds.getKoeficijent_CK_Rizik());
        cp.setSportCoefficient(sport.getKoeficijent_CK_Rizik());
        cp.setRegionCoefficient(location.getKoeficijent_CK_Rizik());
        cp.setPricePerDay(dayPrice.getCena_CK_Rizik());
        cp.setInsuredAmountPrice(amount.getCena_CK_Rizik());

        RulesModel model = new RulesModel();

        model.setDays(daysDiff);

        for (int i = 0; i < data.getAgeNumberYoung(); i++){
            model.addPerson(new InsuredPerson(0));
        }
        for (int i = 0; i < data.getAgeNumberAdult(); i++){
            model.addPerson(new InsuredPerson(1));
        }
        for (int i = 0; i < data.getAgeNumberOld(); i++){
            model.addPerson(new InsuredPerson(2));
        }

        kSession.insert(model);
        kSession.insert(cp);
        kSession.fireAllRules();

        return model.getTotalPrice() - model.getTotalDiscount();
    }
}