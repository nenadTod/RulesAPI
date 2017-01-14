package rules.beans;

import java.util.Date;
import java.util.function.BooleanSupplier;

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

    private Boolean residenceFromFlood;
    private Boolean residenceFromFire;
    private Boolean residenceFromTheft;
    private Double residenceSize;
    private Integer selectedRealEstateAge;
    private Integer selectedRealEstateValue;

    private Integer selectedAlternateTransportationDistance;
    private Integer selectedHotelDays;
    private Integer selectedTowingDistance;
    private Integer selectedReparationPrice;

    public CalculatorData() {
        residenceFromFire = false;
        residenceFromFlood = false;
        residenceFromTheft = false;
    }

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

    public Boolean getResidenceFromFlood() {
        return residenceFromFlood;
    }

    public void setResidenceFromFlood(Boolean residenceFromFlood) {
        this.residenceFromFlood = residenceFromFlood;
    }

    public Boolean getResidenceFromFire() {
        return residenceFromFire;
    }

    public void setResidenceFromFire(Boolean residenceFromFire) {
        this.residenceFromFire = residenceFromFire;
    }

    public Boolean getResidenceFromTheft() {
        return residenceFromTheft;
    }

    public void setResidenceFromTheft(Boolean residenceFromTheft) {
        this.residenceFromTheft = residenceFromTheft;
    }

    public Double getResidenceSize() {
        return residenceSize;
    }

    public void setResidenceSize(Double residenceSize) {
        this.residenceSize = residenceSize;
    }

    public Integer getSelectedRealEstateAge() {
        return selectedRealEstateAge;
    }

    public void setSelectedRealEstateAge(Integer selectedRealEstateAge) {
        this.selectedRealEstateAge = selectedRealEstateAge;
    }

    public Integer getSelectedRealEstateValue() {
        return selectedRealEstateValue;
    }

    public void setSelectedRealEstateValue(Integer selectedRealEstateValue) {
        this.selectedRealEstateValue = selectedRealEstateValue;
    }

    public Integer getSelectedAlternateTransportationDistance() {
        return selectedAlternateTransportationDistance;
    }

    public void setSelectedAlternateTransportationDistance(Integer selectedAlternateTransportationDistance) {
        this.selectedAlternateTransportationDistance = selectedAlternateTransportationDistance;
    }

    public Integer getSelectedHotelDays() {
        return selectedHotelDays;
    }

    public void setSelectedHotelDays(Integer selectedHotelDays) {
        this.selectedHotelDays = selectedHotelDays;
    }

    public Integer getSelectedTowingDistance() {
        return selectedTowingDistance;
    }

    public void setSelectedTowingDistance(Integer selectedTowingDistance) {
        this.selectedTowingDistance = selectedTowingDistance;
    }

    public Integer getSelectedReparationPrice() {
        return selectedReparationPrice;
    }

    public void setSelectedReparationPrice(Integer selectedReparationPrice) {
        this.selectedReparationPrice = selectedReparationPrice;
    }
}
