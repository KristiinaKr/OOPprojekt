package OOPprojekt;

import javax.swing.*;

public class testKlass {

    public static void main(String[] args) {

        String ülesandeValik = JOptionPane.showInputDialog(null,
                "Sisesta, mitmendat ülesannet soovid lahendada (1-4)", "Alustame!", JOptionPane.QUESTION_MESSAGE);

        Kasutajaliides test = new Kasutajaliides(ülesandeValik);

        test.kasutajaLiides(ülesandeValik);

    }
}