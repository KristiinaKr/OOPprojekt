package OOPprojekt;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Kasutajaliides {

    private String ülesandepüstitus;

    public Kasutajaliides(String ülesandepüstitus) {
        this.ülesandepüstitus = ülesandepüstitus;
    }

    public void kasutajaLiides(String ülesandeValik) {
        Ülesanne lahendatavÜlesanne = null;
        if (ülesandeValik.equals("2")) {
            int esimeneArv = 3;
            int teineArv = 5;
            int kolmasArv = 7;

            String ülesandepüstitus2 = "Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leia\n" +
                    "tõenäosus, et see jagub vähemalt ühega arvudest " + esimeneArv +
                    ", " + teineArv + " ja " + kolmasArv + ".";

            String vihje2 = "Vihje: Tinglik tõenäosus!";

            lahendatavÜlesanne = new ÜL2(esimeneArv, teineArv, kolmasArv, "Ülesanne2", ülesandepüstitus2, vihje2);
        } else if (ülesandeValik.equals("1")) {
            String pealkiri1 = "Ülesanne1";
            String vihje1 = "Vihje: Kasuta Bayes'i valemit!";
            double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
            double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
            double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

            String ülesandePüstitus1 = "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" +  " et ühes neist kastidest on " +
                    "katkise piimakoti saamise tõenäolsus " + katkineEsimesest+ "\n" + " ning ülejäänud kastides vaid  " + katkineTeisest + " ja "
                    + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" + " Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n";

            lahendatavÜlesanne = new ÜL1(katkineEsimesest, katkineTeisest, katkineKolmandast, pealkiri1, ülesandePüstitus1, vihje1);

        } else if (ülesandeValik.equals("3")) {
            String pealkiri3 = "Ülesanne3";
            String vihje3 = "Kasuta Bernoulli valemit eraldi mõlema poisi kõigi tabamuste võimaluste korral.";
            int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
            double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
            double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;

            String ülesandePüstitus3 = "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega\n " +
                    "paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega \n" + mikuTäpsus +
                    ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.\n";

            lahendatavÜlesanne = new ÜL3(õunteArv, jukuTäpsus, mikuTäpsus, pealkiri3, ülesandePüstitus3, vihje3);

        }

        String kasutajalahendus = "0";
        assert lahendatavÜlesanne != null;
        while (Double.parseDouble(kasutajalahendus) != lahendatavÜlesanne.lahendus()) {

            kasutajalahendus = JOptionPane.showInputDialog(null, lahendatavÜlesanne.getÜlesandePüstitus()
                    + "Sisesta vastus: ", lahendatavÜlesanne.getPealkiri(), JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendatavÜlesanne.lahendus()) {
                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + "Vihje: Tinglik tõenäosus!",
                        "Vale vastus",
                        JOptionPane.WARNING_MESSAGE);
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid ülesannet uuesti proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("ei")) break;
            }
        }
        JOptionPane.showMessageDialog(null, "Õige vastus on: " + lahendatavÜlesanne.lahendus());
        System.exit(0);
    }
}
