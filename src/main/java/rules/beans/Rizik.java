package rules.beans;

/**
 * Created by Todorovic on 25-Dec-16.
 */
public class Rizik {

    private double id_Rizik;
    private double id_Vrsta_rizika;
    private String naziv_Rizik;


    public Rizik(){

    }

    public Rizik(double id_Rizik, double id_Vrsta_rizika, String naziv_rizik){
        this.id_Rizik = id_Rizik;
        this.id_Vrsta_rizika = id_Vrsta_rizika;
        this.naziv_Rizik = naziv_rizik;
    }

    public double getId_Rizik() {
        return id_Rizik;
    }

    public void setId_Rizik(double id_Rizik) {
        this.id_Rizik = id_Rizik;
    }

    public double getId_Vrsta_rizika() {
        return id_Vrsta_rizika;
    }

    public void setId_Vrsta_rizika(double id_Vrsta_rizika) {
        this.id_Vrsta_rizika = id_Vrsta_rizika;
    }

    public String getNaziv_rizik() {
        return naziv_Rizik;
    }

    public void setNaziv_Rizik(String naziv_rizik) {
        this.naziv_Rizik = naziv_rizik;
    }
}
