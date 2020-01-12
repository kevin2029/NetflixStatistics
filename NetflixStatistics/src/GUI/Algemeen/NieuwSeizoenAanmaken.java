package GUI.Algemeen;

import Functionaliteit.Opslaan.Aanmaken.Opslaan_NieuwSeizoenAanmaken;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NieuwSeizoenAanmaken {

    public Scene NieuwSeizoenAanmaken(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_NieuwSeizoenAanmaken=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_Label_WelkeSerie=new HBox();
        HBox Hbox_Combobox_WelkeSerie=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_NieuwSeizoenAanmaken=new Label("Nieuw seizoen aanmaken");
        Label Label_WelkeSerie=new Label("Welke serie moet een extra seizoen krijgen?");
        Label Label_ErrorKies=new Label("Kies eerst een serie");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkeSerie=new ComboBox();//Hier worden alle series weergeven (zelfde querie als bij serie wijzigen)

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_NieuwSeizoenAanmaken toegevoegd.
        Borderpane_NieuwSeizoenAanmaken.setTop(Hbox_Label);
        Borderpane_NieuwSeizoenAanmaken.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_NieuwSeizoenAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_Label_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_Combobox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label_WelkeSerie toegevoegd.
        Hbox_Label_WelkeSerie.getChildren().add(Label_WelkeSerie);

        //Hier wordt alles aan Hbox_Combobox_WelkeSerie toegevoegd.
        Hbox_Combobox_WelkeSerie.getChildren().add(Combobox_WelkeSerie);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan Hbox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);





        //Hier wordt Borderpane_NieuwSeizoenAanmaken netjes gemaakt.
        Borderpane_NieuwSeizoenAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_NieuwSeizoenAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_Label_WelkeSerie netjes gemaakt.
        Label_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Label_WelkeSerie.setAlignment(Pos.CENTER);
        Hbox_Label_WelkeSerie.setSpacing(100);
        Label_WelkeSerie.setPrefSize(580,50);

        //Hier wordt Hbox_Combobox_WelkeSerie netjes gemaakt.
        Combobox_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Combobox_WelkeSerie.setAlignment(Pos.CENTER);
        Hbox_Combobox_WelkeSerie.setSpacing(100);
        Combobox_WelkeSerie.setPrefSize(580,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(1000,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Opslaan zijn functionaliteit.
        Button_Opslaan.setOnAction(actionEvent -> {
            //Hier wordt gekeken of er iets is geselecteerd.
            if(Combobox_WelkeSerie.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else{
                //Hier wordt de method call gedaan om het seizoen toe te voegen.
                Opslaan_NieuwSeizoenAanmaken.Opslaan(Combobox_WelkeSerie.getSelectionModel());

                //Hier gaat men terug naar het scherm Seizoenen.
                Seizoenen Seizoenen=new Seizoenen();
                stage.setScene(Seizoenen.Seizoenen(stage));
                stage.setFullScreen(true);
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Seizoenen Seizoenen=new Seizoenen();
            stage.setScene(Seizoenen.Seizoenen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene NieuwSeizoenAanmaken aangemaakt.
        Scene NieuwSeizoenAanmaken=new Scene(Borderpane_NieuwSeizoenAanmaken,1300,650);
        stage.setTitle("Nieuw seizoen aanmaken");

        //Hier wordt de scene gereturned.
        return NieuwSeizoenAanmaken;
    }
}
