package rules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rules.beans.Rizik;
import rules.repositories.Rizik_Repository;

import java.util.ArrayList;
import java.util.List;


@RestController
public class RulesAPI {

    @Autowired
    Rizik_Repository rr;

    @RequestMapping("/rules")
    public String rules(@RequestParam(value="number", defaultValue="2") String number) {

        int num = Integer.parseInt(number);

        KieServices ks = KieServices.Factory.get();

        KieContainer kContainer = ks.getKieClasspathContainer();

        //KieBase kb = kContainer.getKieBase("rules");

        KieSession kSession = kContainer.newKieSession("ksession-rules");

        InsuredGroup model = new InsuredGroup();
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
        }

        kSession.fireAllRules();

        System.out.println("-----------------------------");
        int i = 0;
        double totalPrice = 0;
        for (InsuredPerson person: model.getInsuredPeople()){
            System.out.println("Person " + ++i + " price: " + person.getTotalPrice());
            totalPrice += person.getTotalPrice();
        }

        System.out.println("Total price: " + totalPrice);
        System.out.println("Total price with discount: " + model.getTotalPrice());

        System.out.println("-----------------------------");


        List<Rizik> lr = rr.findAll();
        System.out.print(lr);

        return number;
    }
}