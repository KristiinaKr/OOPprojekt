package OOPprojekt;
import java.util.*;


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
        int nCr;
        double tõenäolsusedJuku;
        double tõenäolsusedMiku;
        double võrdseArvuTõenäolsus = 0;

        for (int i = 0; i <= õunteArv; i++) {

            //kombinatsioonide leidmise valem
            nCr = fact(õunteArv) / (fact(i) * fact(õunteArv-i));

            //Bernoulli valemid mõlema viskaja jaoks
            tõenäolsusedJuku = Math.round(nCr * Math.pow(jukuTäpsus, i) * Math.pow(1-jukuTäpsus, õunteArv-i)*10000)/10000.0;
            tõenäolsusedMiku = Math.round(nCr * Math.pow(mikuTäpsus, i) * Math.pow(1-mikuTäpsus, õunteArv-i)*10000)/10000.0;

            võrdseArvuTõenäolsus += tõenäolsusedJuku * tõenäolsusedMiku;
        }
        System.out.println(Math.round(võrdseArvuTõenäolsus*1000)/1000.0);

        return Math.round(võrdseArvuTõenäolsus*1000)/1000.0;
    }

    //abimeetod faktoriaali arvutamiseks
    static int fact(int n)
    {
        int i, f = 1;
        for(i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f;
    }
}
