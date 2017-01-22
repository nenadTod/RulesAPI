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

/**
 * Created by Vuletic on 13.1.2017.
 */
@RestController
public class PolicyController {
    @Autowired
    CK_Rizik_Repository rr;

    @CrossOrigin
    @RequestMapping(value = "/policy", method = RequestMethod.POST)
    public RulesModel rules(@RequestBody RulesModel data) {

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

        data.setDays(daysDiff);

        if(data.getSport()){
            CK_Rizik sport = rr.findByRizik(data.getSelectedSport());
            cp.setSportCoefficient(sport.getKoeficijent_CK_Rizik());
        }

        if(data.getCarInsured()){

            if(data.getInsuredCar().isTowing()) {
                CK_Rizik tow = rr.findByRizik(data.getInsuredCar().getSelectedTowingDistance());
                cp.setTowPrice(tow.getCena_CK_Rizik());
            }

            if(data.getInsuredCar().isRepairment()) {
                CK_Rizik repair = rr.findByRizik(data.getInsuredCar().getSelectedReparationPrice());
                cp.setRepairPrice(repair.getCena_CK_Rizik());
            }

            if(data.getInsuredCar().isHotel()) {
                CK_Rizik hotel = rr.findByRizik(data.getInsuredCar().getSelectedHotelDays());
                cp.setHotelPrice(hotel.getCena_CK_Rizik());
            }

            if(data.getInsuredCar().isAlternativeRide()) {
                CK_Rizik alternative = rr.findByRizik(data.getInsuredCar().getSelectedAlternateTransportationDistance());
                cp.setAlternativePrice(alternative.getCena_CK_Rizik());
            }

        }

        if(data.getRealEstateInsured()){

            CK_Rizik realEstateAge =  rr.findByRizik(data.getInsuredRealEstate().getSelectedRealEstateAge());
            CK_Rizik realEstateValue =  rr.findByRizik(data.getInsuredRealEstate().getSelectedRealEstateValue());
            cp.setRealEstateAgeCoefficient(realEstateAge.getKoeficijent_CK_Rizik());
            cp.setRealEstateValuePrice(realEstateValue.getCena_CK_Rizik());

        }

        kSession.insert(data);
        kSession.insert(cp);
        kSession.fireAllRules();

        return data;
    }

}
