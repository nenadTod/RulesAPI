package rules.beans;

import java.util.Date;

/**
 * Created by Vuletic on 30.12.2016.
 */
public class CalculatorData {

        private Integer selectedLocation;
        private Date dateFrom;
        private Integer selectedInsuranceAmount;
        private Date dateTo;
        private Integer ageNumberYoung;
        private Integer ageNumberAdult;
        private Integer ageNumberOld;
        private Integer selectedSport;

    public Integer getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(Integer selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Integer getSelectedInsuranceAmount() {
        return selectedInsuranceAmount;
    }

    public void setSelectedInsuranceAmount(Integer selectedInsuranceAmount) {
        this.selectedInsuranceAmount = selectedInsuranceAmount;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getAgeNumberYoung() {
        return ageNumberYoung;
    }

    public void setAgeNumberYoung(Integer ageNumberYoung) {
        this.ageNumberYoung = ageNumberYoung;
    }

    public Integer getAgeNumberAdult() {
        return ageNumberAdult;
    }

    public void setAgeNumberAdult(Integer ageNumberAdult) {
        this.ageNumberAdult = ageNumberAdult;
    }

    public Integer getAgeNumberOld() {
        return ageNumberOld;
    }

    public void setAgeNumberOld(Integer ageNumberOld) {
        this.ageNumberOld = ageNumberOld;
    }

    public Integer getSelectedSport() {
        return selectedSport;
    }

    public void setSelectedSport(Integer selectedSport) {
        this.selectedSport = selectedSport;
    }
}
