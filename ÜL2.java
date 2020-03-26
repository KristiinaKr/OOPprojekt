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
        double lahendus = 0.543;
        String kasutajalahendus = "0";
        while (Double.parseDouble(kasutajalahendus) != lahendus) {
            kasutajalahendus = JOptionPane.showInputDialog(null,
                    "Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leia\n" +
                            "tõenäosus, et see jagub vähemalt ühega arvudest " + jagubEsimesega +
                            ", " + jagubTeisega + " ja " + jagubKolmandaga + ".",
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
