package OOPprojekt;

public abstract class Ülesanne {

    private double esimeneMuutuja;
    private double teineMuutuja;
    private double kolmasMuutuja;
    private String pealkiri;
    private String ülesandePüstitus;
    private String vihje;

    public Ülesanne(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, String pealkiri, String ülesandePüstitus, String vihje) {
        this.esimeneMuutuja = esimeneMuutuja;
        this.teineMuutuja = teineMuutuja;
        this.kolmasMuutuja = kolmasMuutuja;
        this.pealkiri = pealkiri;
        this.ülesandePüstitus = ülesandePüstitus;
        this.vihje = vihje;

    }

    public double getEsimeneMuutuja() {
        return esimeneMuutuja;
    }

    public void setEsimeneMuutuja(double esimeneMuutuja) {
        this.esimeneMuutuja = esimeneMuutuja;
    }

    public double getTeineMuutuja() {
        return teineMuutuja;
    }

    public void setTeineMuutuja(double teineMuutuja) {
        this.teineMuutuja = teineMuutuja;
    }

    public double getKolmasMuutuja() {
        return kolmasMuutuja;
    }

    public void setKolmasMuutuja(double kolmasMuutuja) {
        this.kolmasMuutuja = kolmasMuutuja;
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public void setPealkiri(String pealkiri) {
        this.pealkiri = pealkiri;
    }

    public String getÜlesandePüstitus() {
        return ülesandePüstitus;
    }

    public void setÜlesandePüstitus(String ülesandePüstitus) {
        this.ülesandePüstitus = ülesandePüstitus;
    }

    public String getVihje() {
        return vihje;
    }

    public void setVihje(String vihje) {
        this.vihje = vihje;
    }

    public abstract double lahendus ();
}
