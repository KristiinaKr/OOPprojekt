package OOPprojekt;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class testKlass {

    public static void main(String[] args) {

        String pealkiri1 = "Ülesanne1";
        String vihje1 = "Vihje: Kasuta Bayes'i valemit!";
        double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
        double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
        double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

        String ülesandePüstitus1 = "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" +  " et ühes neist kastidest on " +
                "katkise piimakoti saamise tõenäolsus " + katkineEsimesest+ "\n" + " ning ülejäänud kastides vaid  " + katkineTeisest + " ja "
                + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" + " Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n";

        ÜL1 ülesanne1 = new ÜL1(katkineEsimesest, katkineTeisest, katkineKolmandast, pealkiri1, ülesandePüstitus1, vihje1);



        //ÜL2 ülesanne2 = new ÜL2(katkineEsimesest, katkineTeisest, katkineKolmandast);

        // Kas sul ongi samad muutujad kui 1.ül?


        String pealkiri3 = "Ülesanne3";
        String vihje3 = "Kasuta Bernoulli valemit eraldi mõlema poisi kõigi tabamuste võimaluste korral.";
        int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
        double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
        double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;

        String ülesandePüstitus3 = "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega " +
                "paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega " + mikuTäpsus +
                ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.";

        ÜL3 ülesanne3 = new ÜL3(õunteArv, jukuTäpsus, mikuTäpsus, pealkiri3, ülesandePüstitus3, vihje3);




        String ülesandeValik = JOptionPane.showInputDialog(null,
                "Sisesta, mitmendat ülesannet soovid lahendada (1-3)", "Alustame!", JOptionPane.QUESTION_MESSAGE);

        Ülesanne lahendatavÜlesanne = null;

        if (Integer.parseInt(ülesandeValik) == 1) lahendatavÜlesanne = ülesanne1;
        //else if (Integer.parseInt(ülesandeValik) == 2) lahendatavÜlesanne = ülesanne2;
        else if (Integer.parseInt(ülesandeValik) == 3) lahendatavÜlesanne = ülesanne3;

        String kasutajalahendus = "0";
        while (Double.parseDouble(kasutajalahendus) != lahendatavÜlesanne.lahendus()) {

            kasutajalahendus = JOptionPane.showInputDialog(null, lahendatavÜlesanne.getÜlesandePüstitus()
                            + "Sisesta vastus: ", lahendatavÜlesanne.getPealkiri(), JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendatavÜlesanne.lahendus()) {

                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + lahendatavÜlesanne.getVihje(),
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