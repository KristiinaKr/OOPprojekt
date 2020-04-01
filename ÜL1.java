package OOPprojekt;

import javax.swing.*;

public class ÜL1 extends Muutujad{

    public ÜL1(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja);
    }

    /**
     * Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,
     * et ühes neist kastidest on katkise piimakoti saamise tõenäolsus palju suurem,
     * kui ülejäänud kahes kastis. Ostja saigi katkise piimakoti.
     * Milline on tõenäolsus, et ta sai selle 'halvast' kastist?
     * (Praktikum 3.3, Bayesi valem)
     */



    public double lahendus() {

        double lahendus = Math.round(((getEsimeneMuutuja() * 1 / 3) / (getEsimeneMuutuja() * 1 / 3 + getTeineMuutuja() * 1 / 3 + getKolmasMuutuja() * 1 / 3)) * 100) / 100.0;
        String kasutajalahendus = "0";
        while (Double.parseDouble(kasutajalahendus) != lahendus) {
            kasutajalahendus = JOptionPane.showInputDialog(null,
                    "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" +
                            " et ühes neist kastidest on katkise piimakoti saamise tõenäolsus " + getEsimeneMuutuja() + "\n" +
                            " ning ülejäänud kastides vaid  " + getTeineMuutuja() + " ja " + getKolmasMuutuja() + ". Ostja saigi katkise piimakoti.\n" +
                            " Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n Sisesta vastus: ", "Ülesanne 1",
                    JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendus) {
                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + "Vihje: kasuta Bayes'i valemit!",
                        "Vale vastus",
                        JOptionPane.WARNING_MESSAGE);
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid ülesannet uuesti proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("ei")) break;
            }
        }
        JOptionPane.showMessageDialog(null, "Õige vastus on: " + lahendus);
        System.exit(0);
        return lahendus;
    }
}

