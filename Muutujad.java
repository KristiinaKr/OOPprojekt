package OOPprojekt;

public class Muutujad {

    private double esimeneMuutuja;
    private double teineMuutuja;
    private double kolmasMuutuja;

    public Muutujad(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja) {
        this.esimeneMuutuja = esimeneMuutuja;
        this.teineMuutuja = teineMuutuja;
        this.kolmasMuutuja = kolmasMuutuja;
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
}
