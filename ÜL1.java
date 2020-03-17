package OOPprojekt;

import javax.swing.*;

public class ÜL1 {

    /**
     * Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,
     * et ühes neist kastidest on katkise piimakoti saamise tõenäolsus palju suurem,
     * kui ülejäänud kahes kastis. Ostja saigi katkise piimakoti.
     * Milline on tõenäolsus, et ta sai selle 'halvast' kastist?
     * (Praktikum 3.3, Bayesi valem)
     */
    private double katkineEsimesest;
    private double katkineTeisest;
    private double katkineKolmandast;

    public ÜL1(double katkineEsimesest, double katkineTeisest, double katkineKolmandast) {
        this.katkineEsimesest = katkineEsimesest;
        this.katkineTeisest = katkineTeisest;
        this.katkineKolmandast = katkineKolmandast;
    }

    public double getKatkineEsimesest() {
        return katkineEsimesest;
    }

    public void setKatkineEsimesest(double katkineEsimesest) {
        this.katkineEsimesest = katkineEsimesest;
    }

    public double getKatkineTeisest() {
        return katkineTeisest;
    }

    public void setKatkineTeisest(double katkineTeisest) {
        this.katkineTeisest = katkineTeisest;
    }

    public double getKatkineKolmandast() {
        return katkineKolmandast;
    }

    public void setKatkineKolmandast(double katkineKolmandast) {
        this.katkineKolmandast = katkineKolmandast;
    }


    public double lahendus() {

        double lahendus = Math.round(((katkineEsimesest * 1 / 3) / (katkineEsimesest * 1 / 3 + katkineTeisest * 1 / 3 + katkineKolmandast * 1 / 3)) * 100) / 100.0;
        String kasutajalahendus = "0";
        while (Double.parseDouble(kasutajalahendus) != lahendus) {
            kasutajalahendus = JOptionPane.showInputDialog(null,
                    "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" +
                            " et ühes neist kastidest on katkise piimakoti saamise tõenäolsus " + katkineEsimesest + "\n" +
                            " ning ülejäänud kastides vaid  " + katkineTeisest + " ja " + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" +
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

