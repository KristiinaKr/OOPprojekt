package OOPprojekt;

public class ÜL4 extends Ülesanne{
    // tegelen sellega hiljeem xd.
    private int neljasMuutja;

    public ÜL4(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, int neljasMuutja, String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
        this.neljasMuutja = neljasMuutja;
    }

    /**
     * Laual on kaks urni, milles ühes on + int esimenemuutuja + valget ja
     * + int teinemuutuja + musta kuuli ning teises on + int kolmasmuutuja +
     * valget ja + neljasmuutuja + musta kuuli. Kummastki urnist valitakse kaks
     * kuuli ning X on saadud valgete kuulide koguarv. Leida X keskväärtus.
     */

    @Override
    public double lahendus() {
        double PX11 = 2 * (int) getEsimeneMuutuja() / (getEsimeneMuutuja() + getTeineMuutuja()) *
                (int) getTeineMuutuja() / (getEsimeneMuutuja() + getTeineMuutuja() - 1);

        double PX12 = 2 * (int) getEsimeneMuutuja() / (getEsimeneMuutuja() + getTeineMuutuja()) *
                ((int) getEsimeneMuutuja() - 1) / (getEsimeneMuutuja() + getTeineMuutuja() - 1);

        double EX1 = PX11 + PX12;

        double PX21 = 2 * (int) getKolmasMuutuja() / (getKolmasMuutuja() + neljasMuutja) *
                neljasMuutja / (getKolmasMuutuja() + neljasMuutja - 1);

        double PX22 = 2 * (int) getKolmasMuutuja() / (getKolmasMuutuja() + neljasMuutja) *
                ((int) getKolmasMuutuja() - 1) / (getKolmasMuutuja() + neljasMuutja - 1);

        double EX2 = PX21 + PX22;

        double vastus = EX1 + EX2;
        return Math.round(vastus * 1000) / 1000.0;
    }
}
