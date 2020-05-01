package OOPprojekt;



import java.util.concurrent.ThreadLocalRandom;

public class ÜL1 extends Ülesanne {
    private String pealkiri1 = "Ülesanne 1";
    private String vihje1 = "Vihje: Kasuta Bayes'i valemit!";
    private double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
    private double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
    private double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

    private String ülesandePüstitus1 = "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" + "et ühes neist kastidest on " +
            "katkise piimakoti saamise tõenäolsus " + katkineEsimesest + "\n" + "ning ülejäänud kastides vaid  " + katkineTeisest + " ja "
            + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" + "Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n";

    public ÜL1(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
        setEsimeneMuutuja(katkineEsimesest);
        setTeineMuutuja(katkineTeisest);
        setKolmasMuutuja(katkineKolmandast);
        setPealkiri(pealkiri1);
        setVihje(vihje1);
        setÜlesandePüstitus(ülesandePüstitus1);

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

