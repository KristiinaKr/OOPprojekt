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

        double lahendus = Math.round(katkineEsimesest*katkineTeisest*katkineKolmandast*100)/100.0;
        String kasutajaLahendus;
        kasutajaLahendus = JOptionPane.showInputDialog(null,
                        "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" +
                        " et ühes neist kastidest on katkise piimakoti saamise tõenäolsus palju suurem,\n" +
                        " kui ülejäänud kahes kastis. Ostja saigi katkise piimakoti.\n" +
                        " Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n Sisesta vastus: ", "Ülesanne",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, lahendus);
        System.exit(0);
        return lahendus;

    }



}

