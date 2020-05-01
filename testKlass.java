package OOPprojekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.HashSet;
import java.util.Set;


public class testKlass extends Application {

    public void start(Stage peaLava) throws Exception {

        BorderPane piiriPaan = new BorderPane();
        piiriPaan.setPadding(new Insets(10, 20, 35, 20));
        piiriPaan.setStyle("-fx-background-color: #FBE4F1;");

        Text tekst = new Text("Mitmendat ülesannet soovid lahendada (1-5)?");
        tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
        piiriPaan.setCenter(tekst);

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setSpacing(15);

        TextField sisestus = new TextField("");
        sisestus.setMaxWidth(50);
        String ülesandeValik = sisestus.getText();

        Button nupp = new Button("Lahendama!");
        vbox.getChildren().addAll(sisestus, nupp);
        piiriPaan.setBottom(vbox);

        //Ülesannet saab lahendama minna nii klikkides nupppu kui pressides enterit
        nupp.setOnMouseClicked(event -> {

            if (!sisestus.getText().equals("")) {

                //Kui sisestus ei ole nr 1-5, tuleks vale sisestuse exception catchida ja uuesti küsida
                Set<String> variandid = new HashSet<>();
                for (int i = 1; i < 6; i++) {
                    variandid.add(String.valueOf(i));
                }

                Kasutajaliides test = new Kasutajaliides(sisestus.getText());
                Stage ülesanne = new Stage();

                try {
                    kasSisendSobib(variandid, sisestus);

                    test.start(ülesanne);
                    peaLava.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                peaLava.close();
            }

            //Kui midagi ei sisestatud, tuleks ka teha exception ja lasta uuesti sisestada
            peaLava.close();
        });

        //Ülesande lahendama minek enteri vajutamisega
        sisestus.setOnKeyPressed(event2 -> {

            if (!sisestus.getText().equals("")) {
                if (event2.getCode().equals(KeyCode.ENTER)) {

                    Set<String> variandid = new HashSet<>();
                    for (int i = 1; i < 6; i++) {
                        variandid.add(String.valueOf(i));
                    }

                    Kasutajaliides test = new Kasutajaliides(sisestus.getText());
                    Stage ülesanne = new Stage();
                    try {
                        kasSisendSobib(variandid, sisestus);

                        test.start(ülesanne);
                        peaLava.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    peaLava.close();
                }
                //Kui midagi ei sisestatud, tuleks ka teha exception ja lasta uuesti sisestada
                peaLava.close();
            }
        });

        Scene stseen1 = new Scene(piiriPaan, 310, 180);
        peaLava.setTitle("Alustame!");
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    private static boolean kasSisendSobib(Set<String> variandid, TextField sisestus) throws Exception {
        if (variandid.contains(sisestus.getText())) return true;
        else {
            throw new ValeSisendiErind("Sisend ei ole number 1-5, proovi uuesti!");
        }
    }


    public static void main(String[] args) {
        launch(args);

    }
}