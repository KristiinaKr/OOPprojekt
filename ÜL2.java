package OOPprojekt;
import javax.swing.JOptionPane;

public class ÜL2 {

    /**
     * Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leida
     * tõenäosus, et see jagub vähemalt ühega kolmest arvust.
     * (Praktikum 2.6, tinglik tõenäosus)
     */

    private int jagubEsimesega;
    private int jagubTeisega;
    private int jagubKolmandaga;

    public ÜL2(int jagubEsimesega, int jagubTeisega, int jagubKolmandaga) {
        this.jagubEsimesega = jagubEsimesega;
        this.jagubTeisega = jagubTeisega;
        this.jagubKolmandaga = jagubKolmandaga;
    }

    public int getJagubEsimesega() {
        return jagubEsimesega;
    }

    public void setJagubEsimesega(int jagubEsimesega) {
        this.jagubEsimesega = jagubEsimesega;
    }

    public int getJagubTeisega() {
        return jagubTeisega;
    }

    public void setJagubTeisega(int jagubTeisega) {
        this.jagubTeisega = jagubTeisega;
    }

    public int getJagubKolmandaga() {
        return jagubKolmandaga;
    }

    public void setJagubKolmandaga(int jagubKolmandaga) {
        this.jagubKolmandaga = jagubKolmandaga;
    }

    public double lahendus2() {
        int esimene = 1000/jagubEsimesega;
        int teine = 1000/jagubTeisega;
        int kolmas = 1000/jagubKolmandaga;

      //  double esimeneTeine =

        return esimene;
    }
}
