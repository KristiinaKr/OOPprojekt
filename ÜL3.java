package OOPprojekt;

public class ÜL3 {

    /**
    Tekst: "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega
    paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega " + mikuTäpsus
    ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.
     */

    // KUIDAS GETTEREID JA SETTEREID ÄRA KASUTADA?

    private int õunteArv;
    private double jukuTäpsus;
    private double mikuTäpsus;

    public ÜL3(int õunteArv, double jukuTäpsus, double mikuTäpsus) {
        this.õunteArv = õunteArv;
        this.jukuTäpsus = jukuTäpsus;
        this.mikuTäpsus = mikuTäpsus;
    }

    public int getÕunteArv() {
        return õunteArv;
    }

    public void setÕunteArv(int õunteArv) {
        this.õunteArv = õunteArv;
    }

    public double getJukuTäpsus() {
        return jukuTäpsus;
    }

    public void setJukuTäpsus(double jukuTäpsus) {
        this.jukuTäpsus = jukuTäpsus;
    }

    public double getMikuTäpsus() {
        return mikuTäpsus;
    }

    public void setMikuTäpsus(double mikuTäpsus) {
        this.mikuTäpsus = mikuTäpsus;
    }

    public double lahendus() {
        double tõenäolsus;
        tõenäolsus = 5*8;

        return tõenäolsus;
    }
}
