package OOPprojekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class testKlass extends Application {

    public void start(Stage peaLava) throws Exception {

        BorderPane piiriPaan = new BorderPane();
        piiriPaan.setPadding(new Insets(30, 20, 15, 20));

        Text tekst = new Text("Mitmendat ülesannet soovid lahendada? (1-5)");
        tekst.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
        //tekst.setFill(Color.WHITE);
        piiriPaan.setTop(tekst);

        TextField sisestus = new TextField("");
        sisestus.setMaxWidth(50);
        piiriPaan.setCenter(sisestus);
       piiriPaan.setStyle("-fx-background-color: #FBE4F1;");
               //"#DD4184
        String ülesandeValik = sisestus.getText();

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.BOTTOM_CENTER);

        Button nupp = new Button("Lahendama!");
        //nupp.setOnMouseClicked(); siis lähme lahendama
        vbox.getChildren().add(nupp);
        piiriPaan.setBottom(vbox);

        Scene stseen1 = new Scene(piiriPaan, 310, 180);
        peaLava.setTitle("Alustame!");
        peaLava.setScene(stseen1);
        peaLava.show();

        nupp.setOnMouseClicked(event -> {
            System.out.println("Valisid ülesande " + sisestus.getText());
            peaLava.close();
        });

        Kasutajaliides test = new Kasutajaliides(ülesandeValik);
        System.out.println(ülesandeValik);
    }

    public static void main(String[] args) {
        launch(args);

    }

    /*
    public static void main(String[] args) {

        String ülesandeValik = JOptionPane.showInputDialog(null,
                "Sisesta, mitmendat ülesannet soovid lahendada (1-5)", "Alustame!", JOptionPane.QUESTION_MESSAGE);

        Kasutajaliides test = new Kasutajaliides(ülesandeValik);

        test.kasutajaLiides(ülesandeValik);
    }
     */
}