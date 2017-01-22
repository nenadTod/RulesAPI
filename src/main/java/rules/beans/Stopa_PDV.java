package rules.beans;

import java.util.Date;

/**
 * Created by Vuletic on 22.1.2017.
 */
public class Stopa_PDV {

    public Double Id_PDV;
    public Double Id_Stopa_PDV;
    public Double Stopa_PDV;
    public Date Datum_pocetka_vazenja_Stopa_PDV;

    public Stopa_PDV() {
    }

    public Stopa_PDV(Double id_PDV, Double id_Stopa_PDV, Double stopa_PDV, Date datum_pocetka_vazenja_Stopa_PDV) {
        Id_PDV = id_PDV;
        Id_Stopa_PDV = id_Stopa_PDV;
        Stopa_PDV = stopa_PDV;
        Datum_pocetka_vazenja_Stopa_PDV = datum_pocetka_vazenja_Stopa_PDV;
    }

    public Double getId_PDV() {
        return Id_PDV;
    }

    public void setId_PDV(Double id_PDV) {
        Id_PDV = id_PDV;
    }

    public Double getId_Stopa_PDV() {
        return Id_Stopa_PDV;
    }

    public void setId_Stopa_PDV(Double id_Stopa_PDV) {
        Id_Stopa_PDV = id_Stopa_PDV;
    }

    public Double getStopa_PDV() {
        return Stopa_PDV;
    }

    public void setStopa_PDV(Double stopa_PDV) {
        Stopa_PDV = stopa_PDV;
    }

    public Date getDatum_pocetka_vazenja_Stopa_PDV() {
        return Datum_pocetka_vazenja_Stopa_PDV;
    }

    public void setDatum_pocetka_vazenja_Stopa_PDV(Date datum_pocetka_vazenja_Stopa_PDV) {
        Datum_pocetka_vazenja_Stopa_PDV = datum_pocetka_vazenja_Stopa_PDV;
    }

}
