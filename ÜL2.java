package OOPprojekt;


import javax.swing.JOptionPane;

public class ÜL2 extends Ülesanne {

    public ÜL2(double esimeneMuutuja, double teineMuutuja, double kolmasMuutuja, String pealkiri, String ülesandePüstitus, String vihje) {
        super(esimeneMuutuja, teineMuutuja, kolmasMuutuja, pealkiri, ülesandePüstitus, vihje);
    }

    /**
     * Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leida
     * tõenäosus, et see jagub vähemalt ühega kolmest arvust.
     * (Praktikum 2.6, tinglik tõenäosus)
     */


    public double lahendus() {
        int esimene = (int) (1000 / getEsimeneMuutuja());
        int teine = (int) (1000 / getTeineMuutuja());
        int kolmas = (int) (1000 / getKolmasMuutuja());
        int esimeneTeine = (int) (1000 / getEsimeneMuutuja() / getTeineMuutuja());
        int esimeneKolmas = (int) (1000 / getEsimeneMuutuja() / getKolmasMuutuja());
        int teineKolmas = (int) (1000 / getTeineMuutuja() / getKolmasMuutuja());
        int esimeneTeineKolmas = (int) (1000 / getEsimeneMuutuja() / getTeineMuutuja() / getKolmasMuutuja());

        double valem = esimene / 1000.0 + teine / 1000.0 + kolmas / 1000.0
                - esimeneTeine / 1000.0 - esimeneKolmas / 1000.0 - teineKolmas / 1000.0 + esimeneTeineKolmas / 1000.0;
        double lahendus = Math.round(valem * 1000.0) / 1000.0;
        String kasutajalahendus = "0";
        while (Double.parseDouble(kasutajalahendus) != lahendus) {
            kasutajalahendus = JOptionPane.showInputDialog(null,
                    "Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). Leia\n" +
                            "tõenäosus, et see jagub vähemalt ühega arvudest " + (int) getEsimeneMuutuja() +
                            ", " + (int) getTeineMuutuja() + " ja " + (int) getKolmasMuutuja() + ".",
                    JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendus) {
                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + "Vihje: Tinglik tõenäosus!",
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

