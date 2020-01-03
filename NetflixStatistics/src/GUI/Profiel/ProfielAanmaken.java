package GUI.Profiel;

import GUI.AccountGericht.AccountGerichtAccount;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfielAanmaken {

    public Scene ProfielAanmaken(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProfielAanmaken=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox VBox_Gegevens=new VBox();
        HBox Hbox_Naam=new HBox();
        HBox Hbox_Leeftijd=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProfielAanmaken=new Label("Profiel aanmaken");
        Label Label_Naam=new Label("Wat is uw voor en achternaam?");
        Label Label_Leeftijd=new Label("Wat is uw leeftijd?");

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Naam=new TextField();
        TextField Textfield_Leeftijd=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProfielAanmaken toegevoegd.
        Borderpane_ProfielAanmaken.setTop(Hbox_Label);
        Borderpane_ProfielAanmaken.setCenter(VBox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProfielAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        VBox_Gegevens.getChildren().add(Hbox_Naam);
        VBox_Gegevens.getChildren().add(Hbox_Leeftijd);
        VBox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Naam toegevoegd.
        Hbox_Naam.getChildren().add(Label_Naam);
        Hbox_Naam.getChildren().add(Textfield_Naam);

        //Hier wordt alles aan Hbox_Leeftijd toegevoegd.
        Hbox_Leeftijd.getChildren().add(Label_Leeftijd);
        Hbox_Leeftijd.getChildren().add(Textfield_Leeftijd);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_ProfielAanmaken netjes gemaakt.
        Borderpane_ProfielAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProfielAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        VBox_Gegevens.setAlignment(Pos.CENTER);
        VBox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_Naam netjes gemaakt.
        Label_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Naam.setAlignment(Pos.CENTER);
        Hbox_Naam.setSpacing(100);
        Label_Naam.setPrefSize(500,50);
        Textfield_Naam.setPrefSize(500,50);

        //Hier wordt Hbox_Leeftijd netjes gemaakt.
        Label_Leeftijd.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Leeftijd.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Leeftijd.setAlignment(Pos.CENTER);
        Hbox_Leeftijd.setSpacing(100);
        Label_Leeftijd.setPrefSize(500,50);
        Textfield_Leeftijd.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);





        //Hier krijgt Button_Opslaan zijn functionaliteit.

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountGerichtAccount Account=new AccountGerichtAccount();
            stage.setScene(Account.Account(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene ProfielAanmaken gemaakt.
        Scene ProfielAanmaken=new Scene(Borderpane_ProfielAanmaken,1300,650);
        stage.setTitle("Profiel aanmaken");

        //Hier wordt de scene gereturned.
        return ProfielAanmaken;

    }
}
