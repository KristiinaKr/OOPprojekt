package OOPprojekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
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
                lahendatavÜlesanne = new ÜL1(0, 0, 0, "", "", "");
                Text tekst = new Text(lahendatavÜlesanne.getÜlesandePüstitus());
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "2": {
                lahendatavÜlesanne = new ÜL2(0, 0, 0, "", "", "");

                Text tekst = new Text(lahendatavÜlesanne.getÜlesandePüstitus());
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "3": {
                lahendatavÜlesanne = new ÜL3(0, 0, 0, "", "", "");

                Text tekst = new Text(lahendatavÜlesanne.getÜlesandePüstitus());
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "4": {
                lahendatavÜlesanne = new ÜL4(0, 0, 0, 0, "", "", "");

                Text tekst = new Text(lahendatavÜlesanne.getÜlesandePüstitus());
                tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                tekst.setTextAlignment(TextAlignment.CENTER);
                piiriPaan.setCenter(tekst);
                break;
            }

            case "5": {
                lahendatavÜlesanne = new ÜL5(0, 0, 0, "", "", "");

                Text tekst = new Text(lahendatavÜlesanne.getÜlesandePüstitus());
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
                if (Double.parseDouble(sisestus2.getText()) == lahendatavÜlesanne.lahendus()) {
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

                    //Saab uut ülesannet lahendada
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

                    //Programm lõppeb ära
                    ei.setOnMouseClicked(event3 -> {
                        õige.close();
                        ülesanne.close();
                    });

                    Scene stseen2 = new Scene(bp, 300, 160);
                    õige.setScene(stseen2);
                    õige.show();

                }
                //KUI SISESTATI VALE VASTUS
                else {
                    Stage vale = new Stage();
                    BorderPane bp = new BorderPane();
                    bp.setPadding(new Insets(10, 20, 10, 20));
                    bp.setStyle("-fx-background-color: #FBE4F1;");

                    //Anname vihje
                    Text tekst2 = new Text("Vale vastus! \n Vihje: " + lahendatavÜlesanne.getVihje());
                    tekst2.setTextAlignment(TextAlignment.CENTER);
                    tekst2.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));

                    //Kas proovid uuesti?
                    Text tekst3 = new Text("Kas soovid uuesti proovida?");
                    tekst3.setTextAlignment(TextAlignment.CENTER);
                    tekst3.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));

                    VBox vbox2 = new VBox();
                    vbox2.setSpacing(10);
                    vbox2.getChildren().addAll(tekst2, tekst3);
                    bp.setCenter(vbox2);
                    HBox hbox3 = new HBox();

                    Button jah = new Button("Jah");
                    Button ei = new Button(" Ei ");
                    hbox3.setAlignment(Pos.BOTTOM_CENTER);
                    hbox3.setSpacing(25);
                    hbox3.setPadding(new Insets(10,10,20,10));
                    hbox3.getChildren().addAll(jah, ei);
                    bp.setBottom(hbox3);

                    //Kui soovib uuesti sama ülesannet proovida, tuleb rewind samasse kohta
                    jah.setOnMouseClicked(event2 -> {
                        try {
                            start(ülesanne);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        vale.close();
                    });

                    ei.setOnMouseClicked(event3 -> {
                        BorderPane bp2 = new BorderPane();
                        bp2.setPadding(new Insets(10, 20, 10, 20));
                        bp2.setStyle("-fx-background-color: #FBE4F1;");

                        Text vastus = new Text("Õige vastus on: " + lahendatavÜlesanne.lahendus());
                        vastus.setTextAlignment(TextAlignment.CENTER);
                        vastus.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));

                        Text veel = new Text("Kas soovid mõnda muud ülesannet veel lahendada?");
                        veel.setTextAlignment(TextAlignment.CENTER);
                        veel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));

                        VBox järjest = new VBox();
                        järjest.setSpacing(10);
                        järjest.getChildren().addAll(vastus, veel);
                        bp2.setCenter(järjest);

                        ülesanne.close();
                    });

                    Scene stseen3 = new Scene(bp, 300, 160);
                    vale.setScene(stseen3);
                    vale.show();

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
