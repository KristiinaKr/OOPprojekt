package OOPprojekt;

public class ÜL4 extends Ülesanne{
    private String pealkiri4 = "Ülesanne 4";
    private String vihje4 = "Keskväärtuse leidmiseks \nei pea tingimata jaotust leidma!\n";
    private int esimeneValge = (int) (Math.random() * 7) + 2;
    private int esimeneMust = (int) (Math.random() * 7) + 2;
    private int teineValge = (int) (Math.random() * 7) + 2;
    private int teineMust = (int) (Math.random() * 7) + 2;

    private String ülesandePüstitus4 = "Laual on kaks urni, milles ühes on " + esimeneValge + " valget ja " +
            esimeneMust + " musta kuuli ning \nteises on " + teineValge + " valget ja " + teineMust +
            " musta kuuli. Kummastki urnist valitakse kaks \nkuuli ning X " +
            "on saadud valgete kuulide koguarv. Leida X keskväärtus.\n";

    private int neljasMuutja;

    public ÜL4(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, int neljasMuutja, String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
        setEsimeneMuutuja(esimeneValge);
        setTeineMuutuja(esimeneMust);
        setKolmasMuutuja(teineValge);
        this.teineMust = neljasMuutja;
        setPealkiri(pealkiri4);
        setÜlesandePüstitus(ülesandePüstitus4);
        setVihje(vihje4);

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
