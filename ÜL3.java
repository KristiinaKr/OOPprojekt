package OOPprojekt;


import java.util.concurrent.ThreadLocalRandom;

public class ÜL3 extends Ülesanne {

    String pealkiri3 = "Ülesanne 3";
    String vihje3 = "Kasuta Bernoulli valemit eraldi mõlema poisi kõigi tabamuste võimaluste korral.";
    int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
    double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
    double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;

    String ülesandePüstitus3 = "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist \n viskavad nad õunasüdametega " +
            "paberikorvi täpsust. \n Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab  \n tõenäolsusega " + mikuTäpsus +
            ". Leia tõenäolsus, et nad saavad \n võrdse arvu tabamusi.\n";


    // Õunte arv, Juku täpsus, Miku täpsus
    public ÜL3(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
        setEsimeneMuutuja(õunteArv);
        setTeineMuutuja(jukuTäpsus);
        setKolmasMuutuja(mikuTäpsus);
        setPealkiri(pealkiri3);
        setÜlesandePüstitus(ülesandePüstitus3);
        setVihje(vihje3);
    }

    /**
     * Tekst: "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega
     * paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega " + mikuTäpsus
     * ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.
     */

    public double lahendus() {
        int nCr;
        double tõenäolsusedJuku;
        double tõenäolsusedMiku;
        double võrdseArvuTõenäolsus = 0;

        for (int i = 0; i <= getEsimeneMuutuja(); i++) {

            //kombinatsioonide leidmise valem
            nCr = fact((int) getEsimeneMuutuja()) / (fact(i) * fact((int) (getEsimeneMuutuja() - i)));

            //Bernoulli valemid mõlema viskaja jaoks
            tõenäolsusedJuku = Math.round(nCr * Math.pow(getTeineMuutuja(), i)
                    * Math.pow(1 - getTeineMuutuja(), getEsimeneMuutuja() - i) * 10000) / 10000.0;

            tõenäolsusedMiku = Math.round(nCr * Math.pow(getKolmasMuutuja(), i)
                    * Math.pow(1 - getKolmasMuutuja(), getEsimeneMuutuja() - i) * 10000) / 10000.0;

            võrdseArvuTõenäolsus += tõenäolsusedJuku * tõenäolsusedMiku;
        }
        System.out.println(Math.round(võrdseArvuTõenäolsus * 1000) / 1000.0);

        return Math.round(võrdseArvuTõenäolsus * 1000) / 1000.0;
    }


    //abimeetod faktoriaali arvutamiseks
    static int fact(int n) {
        int i, f = 1;
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}




