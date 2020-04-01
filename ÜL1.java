package OOPprojekt;

public class ÜL1 extends Ülesanne {

    public ÜL1(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, String pealkiri, String ülesandePüstitus, String vihje) {

        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
    }
    /**
     * Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,
     * et ühes neist kastidest on katkise piimakoti saamise tõenäolsus palju suurem,
     * kui ülejäänud kahes kastis. Ostja saigi katkise piimakoti.
     * Milline on tõenäolsus, et ta sai selle 'halvast' kastist?
     * (Praktikum 3.3, Bayesi valem)
     */

    @Override
    public double lahendus() {

        double lahendus = Math.round(((getEsimeneMuutuja() * 1 / 3)
                / (getEsimeneMuutuja() * 1 / 3 + getTeineMuutuja() * 1 / 3
                + getKolmasMuutuja() * 1 / 3)) * 100) / 100.0;

        return lahendus;
    }
}

