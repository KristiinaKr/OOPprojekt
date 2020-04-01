package OOPprojekt;
import java.util.*;


public class ÜL3 extends Muutujad {

    // Õunte arv, Juku täpsus, Miku täpsus
    public ÜL3(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja);
    }

    /**
    Tekst: "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega
    paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega " + mikuTäpsus
    ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.
     */

    // KUIDAS GETTEREID JA SETTEREID ÄRA KASUTADA?


    public double lahendus() {
        int nCr;
        double tõenäolsusedJuku;
        double tõenäolsusedMiku;
        double võrdseArvuTõenäolsus = 0;

        for (int i = 0; i <= getEsimeneMuutuja(); i++) {

            //kombinatsioonide leidmise valem
            nCr = fact((int) getEsimeneMuutuja()) / (fact(i) * fact((int) (getEsimeneMuutuja()-i)));

            //Bernoulli valemid mõlema viskaja jaoks
            tõenäolsusedJuku = Math.round(nCr * Math.pow(getTeineMuutuja(), i) * Math.pow(1-getTeineMuutuja(), getEsimeneMuutuja()-i)*10000)/10000.0;
            tõenäolsusedMiku = Math.round(nCr * Math.pow(getKolmasMuutuja(), i) * Math.pow(1-getKolmasMuutuja(), getEsimeneMuutuja()-i)*10000)/10000.0;

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
