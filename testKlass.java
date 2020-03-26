package OOPprojekt;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class testKlass {

    public static void main(String[] args) {

        double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
        double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
        double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

        //ÜL1 ülesanne1 = new ÜL1 (katkineEsimesest, katkineTeisest, katkineKolmandast);

        // Nende muutujatega testimiseks on õige vastus 0.5
        ÜL1 ülesanne1 = new ÜL1(0.6, 0.3, 0.3);
        //ülesanne1.lahendus();


        ÜL2 ülesanne2 = new ÜL2((int) Math.round(Math.random() * 10) + 1,
                (int) Math.round(Math.random() * 10) + 1, (int) Math.round(Math.random() * 10) + 1);

        //ülesanne2.lahendus2();
        System.out.println(ülesanne2.lahendus2());



        String ülesandeValik = JOptionPane.showInputDialog(null,
                "Sisesta, mitmendat ülesannet soovid lahendada (1-2)", "Alustame!", JOptionPane.QUESTION_MESSAGE);

        if (Integer.parseInt(ülesandeValik) == 1) ülesanne1.lahendus();
        if (Integer.parseInt(ülesandeValik) == 2) ülesanne2.lahendus2();
    }
}