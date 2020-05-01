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

            //ESIMENE VARIANT: SISESTATI ÕIGE VASTUS

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
                hBox.setPadding(new Insets(10, 10, 20, 10));
                hBox.getChildren().addAll(jah, ei);

                bp.setCenter(tekst2);
                bp.setBottom(hBox);

                //LAHEDAS ÕIGESTI - VÕTAB UUE ÜLESANDE
                //Saab uut ülesannet lahendada
                jah.setOnMouseClicked(event2 -> {
                    testKlass testklass = new testKlass();
                    Stage pealava = new Stage();
                    try {
                        testklass.start(pealava);
                        ülesanne.close();
                        õige.close();
                        //TODO erindi püüdmine
                    } catch (Exception e) {
                        System.out.println("Midagi juhtus");
                    }
                });

                //EI SOOVI ROHKEM LAHENDADA
                //Programm lõppeb ära
                ei.setOnMouseClicked(event3 -> {
                    õige.close();
                    ülesanne.close();
                });

                Scene stseen2 = new Scene(bp, 300, 160);
                õige.setScene(stseen2);
                õige.show();
            }


            //VARIANT 2: KUI SISESTATI VALE VASTUS
            else {
                Stage vale = new Stage();
                BorderPane bp5 = new BorderPane();
                bp5.setPadding(new Insets(10, 20, 10, 20));
                bp5.setStyle("-fx-background-color: #FBE4F1;");

                //Anname vihje
                Text tekst2 = new Text("Vale vastus! \n\n Vihje: " + lahendatavÜlesanne.getVihje());
                tekst2.setTextAlignment(TextAlignment.CENTER);
                tekst2.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                bp5.setCenter(tekst2);

                //Kas proovid uuesti?
                Text tekst3 = new Text("Kas soovid uuesti proovida?");
                tekst3.setTextAlignment(TextAlignment.CENTER);
                tekst3.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));


                Button jah = new Button("Jah");
                Button ei = new Button(" Ei ");
                HBox hbox3 = new HBox();
                hbox3.setAlignment(Pos.BOTTOM_CENTER);
                hbox3.setSpacing(25);
                hbox3.setPadding(new Insets(10, 10, 20, 10));
                hbox3.getChildren().addAll(jah, ei);

                VBox vbox2 = new VBox();
                vbox2.setSpacing(10);
                vbox2.setAlignment(Pos.CENTER);
                vbox2.getChildren().addAll(tekst3, hbox3);
                bp5.setBottom(vbox2);


                //Kui soovib uuesti sama ülesannet proovida, tuleb rewind ülesande teksti juurde
                jah.setOnMouseClicked(event2 -> {
                    try {
                        vale.close();
                        //TODO erindi püüdmine
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // vale.close();
                });


                //EI TAHA UUESTI SAMA ÜL LAHENDADA
                ei.setOnMouseClicked(event2 -> {
                    ülesanne.close();
                    vale.close();
                    Stage vastuseLava = new Stage();
                    BorderPane bp4 = new BorderPane();
                    bp4.setPadding(new Insets(10, 20, 10, 20));
                    bp4.setStyle("-fx-background-color: #FBE4F1;");

                    Text vastus = new Text("Õige vastus on: " + lahendatavÜlesanne.lahendus());
                    vastus.setTextAlignment(TextAlignment.CENTER);
                    vastus.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));
                    bp4.setCenter(vastus);

                    Text veel = new Text("Kas soovid mõnda muud ülesannet \nveel lahendada?");
                    veel.setTextAlignment(TextAlignment.CENTER);
                    veel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 13));

                    HBox hbox4 = new HBox();
                    Button jah2 = new Button("Jah");
                    Button ei2 = new Button(" Ei ");
                    hbox4.setAlignment(Pos.BOTTOM_CENTER);
                    hbox4.setSpacing(25);
                    hbox4.setPadding(new Insets(10, 10, 20, 10));
                    hbox4.getChildren().addAll(jah2, ei2);

                    VBox järjest = new VBox();
                    järjest.setSpacing(10);
                    järjest.setAlignment(Pos.CENTER);
                    järjest.getChildren().addAll(veel, hbox4);
                    bp4.setBottom(järjest);


                    // TAHAD MUUD ÜLESANNET LAHENDADA: TAGASI ALGUSESSE
                    jah2.setOnMouseClicked(event3 -> {
                        testKlass testklass = new testKlass();
                        Stage pealava = new Stage();
                        try {
                            testklass.start(pealava);
                            vale.close();
                            vastuseLava.close();
                            //TODO erindi püüdmine
                        } catch (Exception e) {
                            System.out.println("Midagi juhtus");
                        }
                    });

                    //EI TAHA ROHKEM MIDAGI LAHENDADA
                    //KÕIK LÄHEB KINNI, PROGRAMMI TÖÖ LÕPPENUD
                    ei2.setOnMouseClicked(event4 -> {
                        ülesanne.close();
                        vale.close();
                        vastuseLava.close();
                    });

                    Scene stseen3 = new Scene(bp4, 300, 160);
                    vastuseLava.setScene(stseen3);
                    vastuseLava.show();
                });

                Scene stseen3 = new Scene(bp5, 400, 200);
                vale.setScene(stseen3);
                vale.show();
            }
        });

        Scene stseen1 = new Scene(piiriPaan, 550, 190);
        ülesanne.setTitle("Siin on sinu ülesanne");
        ülesanne.setScene(stseen1);
        ülesanne.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}