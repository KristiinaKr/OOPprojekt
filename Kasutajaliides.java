package OOPprojekt;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Kasutajaliides {

    public static void kasutajaliides() {
        //kaustade ümbertõstmise test.21
    }

    private String ülesandepüstitus;

    public Kasutajaliides(String ülesandepüstitus) {
        this.ülesandepüstitus = ülesandepüstitus;
    }

    public void kasutajaLiides(String ülesandeValik) {

        Ülesanne lahendatavÜlesanne = null;

        if (ülesandeValik.equals("2")) {
            String pealkiri2 = "Ülesanne 2";
            String vihje2 = "Vihje: Tinglik tõenäosus!";
            int esimeneArv = (int) (Math.random()* 1) + 2;
            int teineArv = (int) (Math.random()* 2) + 4;
            int kolmasArv = (int) (Math.random()* 3) + 6;

            String ülesandepüstitus2 = "Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leia\n" +
                    "tõenäosus, et see jagub vähemalt ühega arvudest " + esimeneArv +
                    ", " + teineArv + " ja " + kolmasArv + ".\n";

            lahendatavÜlesanne = new ÜL2(esimeneArv, teineArv, kolmasArv, pealkiri2, ülesandepüstitus2, vihje2);
        } else if (ülesandeValik.equals("1")) {
            String pealkiri1 = "Ülesanne 1";
            String vihje1 = "Vihje: Kasuta Bayes'i valemit!";
            double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
            double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
            double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

            String ülesandePüstitus1 = "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" + "et ühes neist kastidest on " +
                    "katkise piimakoti saamise tõenäolsus " + katkineEsimesest + "\n" + "ning ülejäänud kastides vaid  " + katkineTeisest + " ja "
                    + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" + "Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n";

            lahendatavÜlesanne = new ÜL1(katkineEsimesest, katkineTeisest, katkineKolmandast, pealkiri1, ülesandePüstitus1, vihje1);


        } else if (ülesandeValik.equals("3")) {
            String pealkiri3 = "Ülesanne 3";
            String vihje3 = "Kasuta Bernoulli valemit eraldi mõlema poisi kõigi tabamuste võimaluste korral.";
            int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
            double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
            double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;

            String ülesandePüstitus3 = "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist viskavad nad õunasüdametega\n" +
                    "paberikorvi täpsust. Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab tõenäolsusega \n" + mikuTäpsus +
                    ". Leia tõenäolsus, et nad saavad võrdse arvu tabamusi.\n";

            lahendatavÜlesanne = new ÜL3(õunteArv, jukuTäpsus, mikuTäpsus, pealkiri3, ülesandePüstitus3, vihje3);

        } else if (ülesandeValik.equals("4")){
            String pealkiri4 = "Ülesanne 4";
            String vihje4 = "Keskväärtuse leidmiseks ei pea tingimata jaotust leidma!";
            int esimeneValge = (int) (Math.random()* 7) + 2;
            int esimeneMust = (int) (Math.random()* 7) + 2;
            int teineValge = (int) (Math.random()* 7) + 2;
            int teineMust = (int) (Math.random()* 7) + 2;

            String ülesndePüstitus4 = "Laual on kaks urni, milles ühes on " + esimeneValge + " valget ja " +
                   esimeneMust + " musta kuuli ning \nteises on "+ teineValge + " valget ja " + teineMust +
                    " musta kuuli. Kummastki urnist valitakse kaks \nkuuli ning X " +
                    "on saadud valgete kuulide koguarv. Leida X keskväärtus.\n";

            lahendatavÜlesanne = new ÜL4(esimeneValge, esimeneMust, teineValge, teineMust, pealkiri4, ülesndePüstitus4, vihje4);
        } else if (ülesandeValik.equals("5")) {
            String pealkiri5 = "Ülesanne 5 ";
            String vihje5 = "Kui katsete arv on > 100, võib olla mõistlik lahendada Binoomjaotuse asemel Poissoni jaotusega!";


            int sülearvutiteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(10, 95) * 100);
            double rikkiMinemiseTõenäolsus = Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.9) * 10)/10.0;
            int vähemaltMituRikkist = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.6) * 10);



            String ülesandePüstitus5 = "Tehas saatis lattu " + sülearvutiteArv + " töökorras sülearvutit. \n" +
                    "Tõenäolsus, et teel lattu läheb sülearvuti katki, on " + rikkiMinemiseTõenäolsus + ". \n" +
                    "Leia tõenäolsus, et  lattu jõuab vähemalt " + vähemaltMituRikkist + " rikkist sülearvutit (ümarda 3 komakohta). \n";

            lahendatavÜlesanne = new ÜL5(sülearvutiteArv, rikkiMinemiseTõenäolsus, vähemaltMituRikkist, pealkiri5,ülesandePüstitus5, vihje5);

        }

        String kasutajalahendus = "0";
        assert lahendatavÜlesanne != null;
        while (Double.parseDouble(kasutajalahendus) != lahendatavÜlesanne.lahendus()) {

            kasutajalahendus = JOptionPane.showInputDialog(null, lahendatavÜlesanne.getÜlesandePüstitus()
                    + "Sisesta vastus: ", lahendatavÜlesanne.getPealkiri(), JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendatavÜlesanne.lahendus()) {
                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid mõnda teist ülesannet proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("jah")) {
                    ülesandeValik = JOptionPane.showInputDialog(null,
                            "Sisesta, mitmendat ülesannet soovid lahendada (1-5)", "Uus ülesanne", JOptionPane.QUESTION_MESSAGE);
                    kasutajaLiides(ülesandeValik);
                }
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + lahendatavÜlesanne.getVihje(),
                        "Vale vastus",
                        JOptionPane.WARNING_MESSAGE);
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid ülesannet uuesti proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("ei")) {
                    JOptionPane.showMessageDialog(null, "Õige vastus on: " + lahendatavÜlesanne.lahendus());
                    valik = JOptionPane.showInputDialog(null,
                            "Kas soovid mõnda teist ülesannet proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                    if (valik.equals("jah")) {
                        ülesandeValik = JOptionPane.showInputDialog(null,
                                "Sisesta, mitmendat ülesannet soovid lahendada (1-5)", "Uus ülesanne", JOptionPane.QUESTION_MESSAGE);
                        kasutajaLiides(ülesandeValik);
                    }
                    break;
                }
            }
        }
        System.exit(0);
    }
}
