package rules.controllers;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rules.beans.CK_Rizik;
import rules.beans.CalculatorData;
import rules.model.*;
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

        CK_Rizik amount = rr.findByRizik(data.getSelectedInsuranceAmount());
        CK_Rizik location = rr.findByRizik(data.getSelectedLocation());
        CK_Rizik dayPrice = rr.findByRizik(11);
        CK_Rizik youngs = rr.findByRizik(4);
        CK_Rizik adults = rr.findByRizik(5);
        CK_Rizik olds = rr.findByRizik(6);

        CK_Rizik firePrice = rr.findByRizik(35);
        CK_Rizik floodPrice = rr.findByRizik(33);
        CK_Rizik burglaryPrice = rr.findByRizik(34);


        long diff = data.getDateTo().getTime() - data.getDateFrom().getTime();
        int daysDiff = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);


        CoefficientsAndPrices cp = new CoefficientsAndPrices();
        cp.setYoungsCoefficient(youngs.getKoeficijent_CK_Rizik());
        cp.setAdultsCoefficient(adults.getKoeficijent_CK_Rizik());
        cp.setOldsCoefficient(olds.getKoeficijent_CK_Rizik());
        cp.setRegionCoefficient(location.getKoeficijent_CK_Rizik());
        cp.setPricePerDay(dayPrice.getCena_CK_Rizik());
        cp.setInsuredAmountPrice(amount.getCena_CK_Rizik());

        cp.setFirePricePerDay(firePrice.getCena_CK_Rizik());
        cp.setFloodPricePerDay(floodPrice.getCena_CK_Rizik());
        cp.setBurglaryPricePerDay(burglaryPrice.getCena_CK_Rizik());

        RulesModel model = new RulesModel();

        model.setDays(daysDiff);
        model.setSport(data.getSport());
        model.setRealEstateInsured(data.getRealEstateInsured());
        model.setCarInsured(data.getCarInsured());

        for (int i = 0; i < data.getAgeNumberYoung(); i++){
            model.addPerson(new InsuredPerson(4));
        }
        for (int i = 0; i < data.getAgeNumberAdult(); i++){
            model.addPerson(new InsuredPerson(5));
        }
        for (int i = 0; i < data.getAgeNumberOld(); i++){
            model.addPerson(new InsuredPerson(6));
        }

        if(data.getSport()){
            CK_Rizik sport = rr.findByRizik(data.getSelectedSport());
            cp.setSportCoefficient(sport.getKoeficijent_CK_Rizik());
        }

        if(data.getCarInsured()){

            if(data.getTowing()) {
                CK_Rizik tow = rr.findByRizik(data.getSelectedTowingDistance());
                cp.setTowPrice(tow.getCena_CK_Rizik());
            }

            if(data.getRepair()) {
                CK_Rizik repair = rr.findByRizik(data.getSelectedReparationPrice());
                cp.setRepairPrice(repair.getCena_CK_Rizik());
            }

            if(data.getHotel()) {
                CK_Rizik hotel = rr.findByRizik(data.getSelectedHotelDays());
                cp.setHotelPrice(hotel.getCena_CK_Rizik());
            }

            if(data.getAlternateTransport()) {
                CK_Rizik alternative = rr.findByRizik(data.getSelectedAlternateTransportationDistance());
                cp.setAlternativePrice(alternative.getCena_CK_Rizik());
            }


            model.setInsuredCar(new InsuredCar(data));
        }

        if(data.getRealEstateInsured()){

            CK_Rizik realEstateAge =  rr.findByRizik(data.getSelectedRealEstateAge());
            CK_Rizik realEstateValue =  rr.findByRizik(data.getSelectedRealEstateValue());
            cp.setRealEstateAgeCoefficient(realEstateAge.getKoeficijent_CK_Rizik());
            cp.setRealEstateValuePrice(realEstateValue.getCena_CK_Rizik());

            model.setInsuredRealEstate(new InsuredRealEstate(data.getResidenceSize(), data.getResidenceFromFlood(),
                    data.getResidenceFromFire(), data.getResidenceFromTheft()));
        }



        kSession.insert(model);
        kSession.insert(cp);
        kSession.fireAllRules();

        return model.getTotalPrice() - model.getTotalDiscount();
    }
}