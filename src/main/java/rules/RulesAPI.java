package rules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rules.beans.CK_Rizik;
import rules.beans.CalculatorData;
import rules.beans.Rizik;
import rules.repositories.CK_Rizik_Repository;
import rules.repositories.Rizik_Repository;

import java.util.ArrayList;
import java.util.List;
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

        /*InsuredGroup model = new InsuredGroup();
        InsuredPerson p1 = new InsuredPerson();
        p1.setAgeCoefficient(1);
        p1.setSportCoefficient(1.8);
        model.addPerson(p1);

        for(int i = 1; i < num; i++){
            InsuredPerson p2 = new InsuredPerson();
            model.addPerson(p2);
        }

        kSession.insert(model);

        for (InsuredPerson person: model.getInsuredPeople()){
            kSession.insert(person);
        }*/

        CK_Rizik sport = rr.findByRizik(data.getSelectedSport());
        CK_Rizik amount = rr.findByRizik(data.getSelectedInsuranceAmount());
        CK_Rizik location = rr.findByRizik(data.getSelectedLocation());
        CK_Rizik dayPrice = rr.findByRizik(11);

        long diff = data.getDateTo().getTime() - data.getDateFrom().getTime();
        int daysDiff = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        //kSession.fireAllRules();








        return 123.0;
    }
}