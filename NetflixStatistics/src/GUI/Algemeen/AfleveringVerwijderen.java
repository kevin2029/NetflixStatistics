/*
package GUI.Algemeen;

import Functionaliteit.Verwijderen.Verwijderen_Aflevering;
import Functionaliteit.Verwijderen.Verwijderen_Film;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AfleveringVerwijderen {
    public Scene AfleveringVerwijderen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_AfleveringVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkeSerie=new HBox();
        HBox Hbox_WelkSeizoen=new HBox();
        HBox Hbox_WelkeAflevering=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_AfleveringVerwijderen=new Label("Aflevering verwijderen");
        Label Label_WelkeSerie=new Label("Van welke serie wilt U een seizoen selecteren?");
        Label Label_WelkSeizoen=new Label("Van welk seizoen wilt U een aflevering verwijderen?");
        Label Label_WelkeAflevering=new Label("Welke aflevering wilt U verwijderen?");
        Label Label_ErrorKies=new Label("Kies eerst een serie, seizoen en aflevering");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkeSerie=new ComboBox();//Hier staan alle series.
        ComboBox Combobox_WelkSeizoen=new ComboBox();//Hier staan alle seizoenen.
        ComboBox Combobox_WelkeAflevering=new ComboBox();//Hier staan alle afleveringen.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_AfleveringVerwijderen toegevoegd.
        Borderpane_AfleveringVerwijderen.setTop(Hbox_Label);
        Borderpane_AfleveringVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_AfleveringVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_WelkSeizoen);
        Vbox_Gegevens.getChildren().add(Hbox_WelkeAflevering);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkeSerie toegevoegd.
        Hbox_WelkeSerie.getChildren().add(Label_WelkeSerie);
        Hbox_WelkeSerie.getChildren().add(Combobox_WelkeSerie);

        //Hier wordt alles aan Hbox_WelkSeizoen toegevoegd.
        Hbox_WelkSeizoen.getChildren().add(Label_WelkSeizoen);
        Hbox_WelkSeizoen.getChildren().add(Combobox_WelkSeizoen);

        //Hier wordt alles aan Hbox_WelkeAflevering toegevoegd.
        Hbox_WelkeAflevering.getChildren().add(Label_WelkeAflevering);
        Hbox_WelkeAflevering.getChildren().add(Combobox_WelkeAflevering);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);





        //Hier wordt Borderpane_AfleveringVerwijderen  netjes gemaakt.
        Borderpane_AfleveringVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_AfleveringVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkeSerie netjes gemaakt.
        Label_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkeSerie.setAlignment(Pos.CENTER);
        Hbox_WelkeSerie.setSpacing(100);
        Label_WelkeSerie.setPrefSize(580,50);
        Combobox_WelkeSerie.setPrefSize(580,50);

        //Hier wordt Hbox_WelkSeizoen netjes gemaakt.
        Label_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkSeizoen.setAlignment(Pos.CENTER);
        Hbox_WelkSeizoen.setSpacing(100);
        Label_WelkSeizoen.setPrefSize(580,50);
        Combobox_WelkSeizoen.setPrefSize(580,50);

        //Hier wordt Hbox_WelkeAflevering netjes gemaakt.
        Label_WelkeAflevering.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkeAflevering.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkeAflevering.setAlignment(Pos.CENTER);
        Hbox_WelkeAflevering.setSpacing(100);
        Label_WelkeAflevering.setPrefSize(580,50);
        Combobox_WelkeAflevering.setPrefSize(580,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Verwijderen.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Verwijderen.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(1000,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Verwijderen zijn functionaliteit.
        Button_Verwijderen.setOnAction(actionEvent -> {
            //Eerst kijken we of de serie, het seizoen en de aflevering geselecteerd is.
            if(Combobox_WelkeSerie.getSelectionModel().isEmpty()||Combobox_WelkSeizoen.getSelectionModel().isEmpty()||Combobox_WelkeAflevering.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else{
                //Als we hier zijn is er een serie, seizoen en aflevering geselecteerd dus maken we een methodcall.
                Verwijderen_Aflevering.Verwijderen(Combobox_WelkeSerie.getSelectionModel(),Combobox_WelkSeizoen.getSelectionModel(),Combobox_WelkeAflevering.getSelectionModel());

                //Hier gaan we terug naar het scherm Afleveringen.
                Afleveringen Afleveringen=new Afleveringen();
                stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
                stage.setFullScreen(true);
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Afleveringen Afleveringen=new Afleveringen();
            stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene AfleveringVerwijderen aangemaakt.
        Scene AfleveringVerwijderen=new Scene(Borderpane_AfleveringVerwijderen,1300,650);
        stage.setTitle("Aflevering verwijderen");

        //Hier wordt de scene gereturned
        return AfleveringVerwijderen;
    }
}
*/