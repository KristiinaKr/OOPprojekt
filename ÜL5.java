package OOPprojekt;

import java.math.BigInteger;
import java.math.*;
import java.util.concurrent.ThreadLocalRandom;

public class ÜL5 extends Ülesanne {
    String pealkiri5 = "Ülesanne 5 ";
    String vihje5 = "Kui katsete arv on > 100, võib olla mõistlik lahendada Binoomjaotuse asemel Poissoni jaotusega!";
    int sülearvutiteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(10, 95) * 100);
    double rikkiMinemiseTõenäolsus = Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.9) * 10) / 10.0;
    int vähemaltMituRikkist = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.6) * 10);
    String ülesandePüstitus5 = "Tehas saatis lattu " + sülearvutiteArv + " töökorras sülearvutit. \n" +
            "Tõenäolsus, et teel lattu läheb sülearvuti katki, on " + rikkiMinemiseTõenäolsus + ". \n" +
            "Leia tõenäolsus, et  lattu jõuab vähemalt " + vähemaltMituRikkist + " rikkist sülearvutit \n (ümarda 3 komakohta). \n";

    public ÜL5(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja,
               String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
        setEsimeneMuutuja(sülearvutiteArv);
        setTeineMuutuja(rikkiMinemiseTõenäolsus);
        setKolmasMuutuja(vähemaltMituRikkist);
        setPealkiri(pealkiri5);
        setÜlesandePüstitus(ülesandePüstitus5);
        setVihje(vihje5);
    }

    @Override
    public double lahendus() {
        // X ~ B(sülearvutiteArv, rikkiMinemiseTõenäolsus)
        // P(X=0), P(X=1), ... P(X = vähemaltMituRikkist)
        BigInteger nCr;
        double jõuabKatkine;
        double tõenäolsusteSumma=0;
        double lahendus = 0;
        for (int i = 0; i < getKolmasMuutuja(); i++) {

            //kombinatsioonide leidmise valem
            nCr = fact((int) getEsimeneMuutuja()).divide(fact(i).multiply( fact((int) getEsimeneMuutuja() - i)));
            System.out.println(nCr);

            int nCrTäisarv = nCr.intValue();

            //Iga võimlaiku arvu katkiste arvutite lattu jõudmise tõenäolsus
            jõuabKatkine = Math.round(nCrTäisarv * Math.pow(getTeineMuutuja(), i)
                    * Math.pow(1 - getTeineMuutuja(), getEsimeneMuutuja() - i) * 10000) / 10000.0;

            tõenäolsusteSumma += jõuabKatkine;
        }
        lahendus = 1 - (Math.round(tõenäolsusteSumma*1000)/1000.0);

        return Math.round(lahendus*1000)/1000.0;
    }

    //abimeetod faktoriaali arvutamiseks (leidsin BigIntegeri abil iteratiivse valemi internetist:
    // https://stackoverflow.com/questions/8992437/stackoverflowerror-computing-factorial-of-a-biginteger
    public static BigInteger fact(int n) {
        BigInteger suurArv = BigInteger.valueOf(n);
        BigInteger result = BigInteger.ONE;

        while (!suurArv.equals(BigInteger.ZERO)) {

            result = result.multiply(suurArv);
            suurArv = suurArv.subtract(BigInteger.ONE);
        }

        return result;
    }
}
