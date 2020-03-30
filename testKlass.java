package OOPprojekt;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class testKlass {

    public static void main(String[] args) {

        double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
        double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
        double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

        ÜL1 ülesanne1 = new ÜL1 (katkineEsimesest, katkineTeisest, katkineKolmandast);

        // Nende muutujatega testimiseks on õige vastus 0.5
        //ÜL1 ülesanne1 = new ÜL1(0.6, 0.3, 0.3);
        //ülesanne1.lahendus();


        // ÜL2 ülesanne2 = new ÜL2((int) Math.round(Math.random() * 10) + 1,
        //   (int) Math.round(Math.random() * 10) + 1, (int) Math.round(Math.random() * 10) + 1);

        //Etteantud muutujatega testimiseks, õige vastus on 0.054
        ÜL2 ülesanne2 = new ÜL2(3, 5, 7);

        //ülesanne2.lahendus2();
        //System.out.println(ülesanne2.lahendus2());



        int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
        double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
        double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;


        ÜL3 ülesanne3 = new ÜL3(õunteArv,jukuTäpsus,mikuTäpsus);



        String ülesandeValik = JOptionPane.showInputDialog(null,
                "Sisesta, mitmendat ülesannet soovid lahendada (1-3)", "Alustame!", JOptionPane.QUESTION_MESSAGE);

        if (Integer.parseInt(ülesandeValik) == 1) ülesanne1.lahendus();
        if (Integer.parseInt(ülesandeValik) == 2) ülesanne2.lahendus2();
        if(Integer.parseInt(ülesandeValik) == 3) ülesanne3.lahendus();
    }
}