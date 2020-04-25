package OOPprojekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.concurrent.ThreadLocalRandom;


public class Kasutajaliides extends Application {

    //private String ülesandepüstitus;
    Ülesanne lahendatavÜlesanne = null;

    private String ülesandeValik;

    /*KONSTRUKTOR vana
    public Kasutajaliides(String ülesandepüstitus) {
        this.ülesandepüstitus = ülesandepüstitus;
    } */

    public Kasutajaliides(String ülesandeValik) {
        this.ülesandeValik = ülesandeValik;
    }

    public String getLahendatavÜlesanne() {
        return ülesandeValik;
    }

    public void start(Stage ülesanne) throws Exception {

        BorderPane piiriPaan = new BorderPane();
        piiriPaan.setPadding(new Insets(30, 20, 15, 20));
        piiriPaan.setStyle("-fx-background-color: #FBE4F1;");

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setSpacing(10);


        TextField sisestus2 = new TextField("Sisesta vastus");
        sisestus2.setMaxWidth(105);

        Button nupp2 = new Button("Kinnita");
        vbox.getChildren().addAll(sisestus2, nupp2);
        piiriPaan.setBottom(vbox);


        switch (ülesandeValik) {
            case "1": {
                String pealkiri1 = "Ülesanne 1";
                String vihje1 = "Vihje: Kasuta Bayes'i valemit!";
                double katkineEsimesest = Math.round(ThreadLocalRandom.current().nextDouble(0.6, 0.9) * 10) / 10.0;
                double katkineTeisest = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;
                double katkineKolmandast = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.5) * 10) / 10.0;

                String ülesandePüstitus1 = "Toidupoes sai valida piimakoti kolmest sarnasest kastist. On teada,\n" + "et ühes neist kastidest on " +
                        "katkise piimakoti saamise tõenäolsus " + katkineEsimesest + "\n" + "ning ülejäänud kastides vaid  " + katkineTeisest + " ja "
                        + katkineKolmandast + ". Ostja saigi katkise piimakoti.\n" + "Milline on tõenäolsus, et ta sai selle 'halvast' kastist? \n";

                lahendatavÜlesanne = new ÜL1(katkineEsimesest, katkineTeisest, katkineKolmandast, pealkiri1, ülesandePüstitus1, vihje1);

                Text tekst = new Text(ülesandePüstitus1);
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "2": {
                String pealkiri2 = "Ülesanne 2";
                String vihje2 = "Vihje: Tinglik tõenäosus!";
                int esimeneArv = (int) (Math.random() * 1) + 2;
                int teineArv = (int) (Math.random() * 2) + 4;
                int kolmasArv = (int) (Math.random() * 3) + 6;

                String ülesandePüstitus2 = "Juhuslikult valitakse arv ühest tuhandeni(kaasa arvatud). \n " +
                        "Leia tõenäosus, et see jagub vähemalt ühega \n arvudest " + esimeneArv +
                        ", " + teineArv + " ja " + kolmasArv + ".\n";

                lahendatavÜlesanne = new ÜL2(esimeneArv, teineArv, kolmasArv, pealkiri2, ülesandePüstitus2, vihje2);

                Text tekst = new Text(ülesandePüstitus2);
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "3": {
                String pealkiri3 = "Ülesanne 3";
                String vihje3 = "Kasuta Bernoulli valemit eraldi mõlema poisi kõigi tabamuste võimaluste korral.";
                int õunteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.6) * 10);
                double jukuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;
                double mikuTäpsus = Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.9) * 10) / 10.0;

                String ülesandePüstitus3 = "Jukul ja Mikul on mõlemal " + õunteArv + " õuna. Peale õunte söömist \n viskavad nad õunasüdametega " +
                        "paberikorvi täpsust. \n Juku tabab tõenäolsusega " + jukuTäpsus + " ning Miku tabab  \n tõenäolsusega " + mikuTäpsus +
                        ". Leia tõenäolsus, et nad saavad \n võrdse arvu tabamusi.\n";

                lahendatavÜlesanne = new ÜL3(õunteArv, jukuTäpsus, mikuTäpsus, pealkiri3, ülesandePüstitus3, vihje3);

                Text tekst = new Text(ülesandePüstitus3);
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "4": {
                String pealkiri4 = "Ülesanne 4";
                String vihje4 = "Keskväärtuse leidmiseks ei pea tingimata jaotust leidma!";
                int esimeneValge = (int) (Math.random() * 7) + 2;
                int esimeneMust = (int) (Math.random() * 7) + 2;
                int teineValge = (int) (Math.random() * 7) + 2;
                int teineMust = (int) (Math.random() * 7) + 2;

                String ülesndePüstitus4 = "Laual on kaks urni, milles ühes on " + esimeneValge + " valget ja " +
                        esimeneMust + " musta kuuli ning \nteises on " + teineValge + " valget ja " + teineMust +
                        " musta kuuli. Kummastki urnist valitakse kaks \nkuuli ning X " +
                        "on saadud valgete kuulide koguarv. Leida X keskväärtus.\n";

                lahendatavÜlesanne = new ÜL4(esimeneValge, esimeneMust, teineValge, teineMust, pealkiri4, ülesndePüstitus4, vihje4);

                Text tekst = new Text(ülesndePüstitus4);
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "5": {
                String pealkiri5 = "Ülesanne 5 ";
                String vihje5 = "Kui katsete arv on > 100, võib olla mõistlik lahendada Binoomjaotuse asemel Poissoni jaotusega!";


                int sülearvutiteArv = (int) Math.round(ThreadLocalRandom.current().nextDouble(10, 95) * 100);
                double rikkiMinemiseTõenäolsus = Math.round(ThreadLocalRandom.current().nextDouble(0.2, 0.9) * 10) / 10.0;
                int vähemaltMituRikkist = (int) Math.round(ThreadLocalRandom.current().nextDouble(0.1, 0.6) * 10);


                String ülesandePüstitus5 = "Tehas saatis lattu " + sülearvutiteArv + " töökorras sülearvutit. \n" +
                        "Tõenäolsus, et teel lattu läheb sülearvuti katki, on " + rikkiMinemiseTõenäolsus + ". \n" +
                        "Leia tõenäolsus, et  lattu jõuab vähemalt " + vähemaltMituRikkist + " rikkist sülearvutit \n (ümarda 3 komakohta). \n";

                lahendatavÜlesanne = new ÜL5(sülearvutiteArv, rikkiMinemiseTõenäolsus, vähemaltMituRikkist, pealkiri5, ülesandePüstitus5, vihje5);

                Text tekst = new Text(ülesandePüstitus5);
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }
        }



        nupp2.setOnMouseClicked(event -> {

            ülesanne.close();
            //Siin praegu see variant, kui sisestati õige vastus, aint kuna ma ei arvuta igal testimisel
            //õiget vastust välja siis panin järg reale != mitte ==
                if (Double.parseDouble(sisestus2.getText()) != lahendatavÜlesanne.lahendus()) {
                    Stage õige = new Stage();
                    BorderPane bp = new BorderPane();
                    bp.setPadding(new Insets(10, 20, 10, 20));
                    bp.setStyle("-fx-background-color: #FBE4F1;");


                    Text tekst2 = new Text("Tubli! Õige vastus! \n " +
                            "Kas soovid veel ülesandeid lahendada?");
                    tekst2.setTextAlignment(TextAlignment.CENTER);
                    tekst2.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));


                    Button jah = new Button("Jah");
                    Button ei = new Button(" Ei ");
                    HBox hBox = new HBox();
                    hBox.setAlignment(Pos.BOTTOM_CENTER);
                    hBox.setSpacing(25);
                    hBox.setPadding(new Insets(10,10,20,10));
                    hBox.getChildren().addAll(jah, ei);

                    bp.setCenter(tekst2);
                    bp.setBottom(hBox);


                    jah.setOnMouseClicked(event2 -> {
                        testKlass testklass = new testKlass();
                        Stage pealava = new Stage();
                        try {
                            testklass.start(pealava);
                            õige.close();
                        } catch (Exception e) {
                            System.out.println("Midagi juhtus");
                        }
                    });

                    ei.setOnMouseClicked(event3 -> {
                        õige.close();
                        ülesanne.close();
                    });

                    Scene stseen2 = new Scene(bp, 300, 160);
                    õige.setScene(stseen2);
                    õige.show();

                    /*Stage vale = new Stage();
                    Text tekst2 = new Text("Vale vastus");
                    vbox2.getChildren().add(tekst2);
                    Scene stseen2 = new Scene(vbox2);
                    vale.setScene(stseen2);
                    vale.show();
                    ülesanne.close();
                     */
                }
        });

        Scene stseen1 = new Scene(piiriPaan, 550, 200);
        ülesanne.setTitle("Siin on sinu ülesanne");
        ülesanne.setScene(stseen1);
        ülesanne.show();
    }

    public static void main(String[] args) {
        launch(args);

    }




    /*
       // String kasutajalahendus = "0";
        assert lahendatavÜlesanne != null;
        while (Double.parseDouble(kasutajalahendus) != lahendatavÜlesanne.lahendus()) {

            kasutajalahendus = JOptionPane.showInputDialog(null, lahendatavÜlesanne.getÜlesandePüstitus()
                    + "Sisesta vastus: ", lahendatavÜlesanne.getPealkiri(), JOptionPane.QUESTION_MESSAGE);

            if (Double.parseDouble(kasutajalahendus) == lahendatavÜlesanne.lahendus()) {
                JOptionPane.showMessageDialog(null, "Tubli! " + "\n" + " Sinu vastus on õige!");
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid mõnda teist ülesannet proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("jah")) {
                    ülesandeValik = JOptionPane.showInputDialog(null,
                            "Sisesta, mitmendat ülesannet soovid lahendada (1-5)", "Uus ülesanne", JOptionPane.QUESTION_MESSAGE);
                    kasutajaLiides(ülesandeValik);
                }
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sinu vastus ei ole õige! \n" + lahendatavÜlesanne.getVihje(),
                        "Vale vastus",
                        JOptionPane.WARNING_MESSAGE);
                String valik = JOptionPane.showInputDialog(null,
                        "Kas soovid ülesannet uuesti proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                if (valik.equals("ei")) {
                    JOptionPane.showMessageDialog(null, "Õige vastus on: " + lahendatavÜlesanne.lahendus());
                    valik = JOptionPane.showInputDialog(null,
                            "Kas soovid mõnda teist ülesannet proovida (jah/ei)?", JOptionPane.QUESTION_MESSAGE);
                    if (valik.equals("jah")) {
                        ülesandeValik = JOptionPane.showInputDialog(null,
                                "Sisesta, mitmendat ülesannet soovid lahendada (1-5)", "Uus ülesanne", JOptionPane.QUESTION_MESSAGE);
                        kasutajaLiides(ülesandeValik);
                    }
                    break;
                }
            }
        }
        System.exit(0);
    }


     */
}
