package rules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rules.beans.CK_Rizik;
import rules.beans.CalculationModel;
import rules.beans.CalculatorData;
import rules.repositories.CK_Rizik_Repository;

import java.util.concurrent.TimeUnit;


@RestController
public class RulesAPI {

    @Autowired
    CK_Rizik_Repository rr;

    @CrossOrigin
    @RequestMapping(value = "/rules", method = RequestMethod.POST)
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

        /*Policy policy = new Policy();

        for(int i = 0; i < data.getAgeNumberYoung(); i++){
            policy.addPerson(new InsuredPerson());
        }*/

        CalculationModel model = new CalculationModel();
        model.setYoungCoefficient(youngs.getKoeficijent_CK_Rizik());
        model.setAdultCoefficient(adults.getKoeficijent_CK_Rizik());
        model.setOldCoefficient(olds.getKoeficijent_CK_Rizik());
        model.setSportCoefficient(sport.getKoeficijent_CK_Rizik());
        model.setAdults(data.getAgeNumberAdult());
        model.setYoungs(data.getAgeNumberYoung());
        model.setOlds(data.getAgeNumberOld());
        model.setDailyPrice(dayPrice.getCena_CK_Rizik());
        model.setDuration(daysDiff);
        model.setRegionCoefficient(location.getKoeficijent_CK_Rizik());
        model.setInsuredAmountPrice(amount.getCena_CK_Rizik());

        kSession.insert(model);

        kSession.fireAllRules();
        System.out.println(model.getTotalPrice());
        return model.getTotalPrice();
    }
}