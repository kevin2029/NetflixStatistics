/*
package GUI.Algemeen;

import Functionaliteit.Verwijderen.Verwijderen_Seizoen;
import Functionaliteit.Verwijderen.Verwijderen_Serie;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SerieVerwijderen {
    public Scene SerieVerwijderen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_SerieVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_Label_WelkeSerie=new HBox();
        HBox Hbox_Combobox_WelkeSerie=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_SerieVerwijderen=new Label("Serie verwijderen");
        Label Label_WelkeSerie=new Label("Welke serie wilt U verwijderen?");
        Label Label_ErrorKies=new Label("Kies eerst een serie");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkeSerie=new ComboBox();//Hier staan alle series.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_SerieVerwijderen toegevoegd.
        Borderpane_SerieVerwijderen.setTop(Hbox_Label);
        Borderpane_SerieVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_SerieVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_Label_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_Combobox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label_WelkeSerie toegevoegd.
        Hbox_Label_WelkeSerie.getChildren().add(Label_WelkeSerie);

        //Hier wordt alles aan Hbox_Combobox_WelkeSerie toegevoegd.
        Hbox_Combobox_WelkeSerie.getChildren().add(Combobox_WelkeSerie);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);





        //Hier wordt Borderpane_SerieVerwijderen  netjes gemaakt.
        Borderpane_SerieVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_SerieVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

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
        Button_Verwijderen.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Verwijderen.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(500,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Verwijderen zijn functionaliteit.
        Button_Verwijderen.setOnAction(actionEvent -> {
            //Eerst kijken we of de serie is geselecteerd.
            if(Combobox_WelkeSerie.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else{
                //Als we hier zijn is er een serie geselecteerd dus maken we een methodcall.
                Verwijderen_Serie.Verwijderen(Combobox_WelkeSerie.getSelectionModel());

                //Hier gaan we terug naar het scherm Series.
                Series Series=new Series();
                stage.setScene(Series.Series(stage));
                stage.setFullScreen(true);
            }
        });
        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Series Series=new Series();
            stage.setScene(Series.Series(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene SerieVerwijderen aangemaakt.
        Scene SerieVerwijderen=new Scene(Borderpane_SerieVerwijderen,1300,650);
        stage.setTitle("Serie verwijderen");

        //Hier wordt de scene gereturned
        return SerieVerwijderen;
    }
}
*/