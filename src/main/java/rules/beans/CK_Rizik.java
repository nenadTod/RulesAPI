package rules.beans;

/**
 * Created by Vuletic on 2.1.2017.
 */
public class CK_Rizik {

    public Double Id_CK_Rizik;
    public Double Id_Rizik;
    public Double Koeficijent_CK_Rizik;
    public Double Cena_CK_Rizik;

    public CK_Rizik() {
    }

    public CK_Rizik(Double id_CK_Rizik, Double id_Rizik, Double koeficijent_CK_Rizik, Double cena_CK_Rizik) {
        Id_CK_Rizik = id_CK_Rizik;
        Id_Rizik = id_Rizik;
        Koeficijent_CK_Rizik = koeficijent_CK_Rizik;
        Cena_CK_Rizik = cena_CK_Rizik;
    }

    public Double getId_CK_Rizik() {
        return Id_CK_Rizik;
    }

    public void setId_CK_Rizik(Double id_CK_Rizik) {
        Id_CK_Rizik = id_CK_Rizik;
    }

    public Double getId_Rizik() {
        return Id_Rizik;
    }

    public void setId_Rizik(Double id_Rizik) {
        Id_Rizik = id_Rizik;
    }

    public Double getKoeficijent_CK_Rizik() {
        return Koeficijent_CK_Rizik;
    }

    public void setKoeficijent_CK_Rizik(Double koeficijent_CK_Rizik) {
        Koeficijent_CK_Rizik = koeficijent_CK_Rizik;
    }

    public Double getCena_CK_Rizik() {
        return Cena_CK_Rizik;
    }

    public void setCena_CK_Rizik(Double cena_CK_Rizik) {
        Cena_CK_Rizik = cena_CK_Rizik;
    }
}
