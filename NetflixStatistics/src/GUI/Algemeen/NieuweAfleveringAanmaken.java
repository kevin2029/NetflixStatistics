package GUI.Algemeen;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NieuweAfleveringAanmaken {
    public Scene NieuweAfleveringAanmaken(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_NieuweAfleveringAanmaken=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkeSerie=new HBox();
        HBox Hbox_WelkSeizoen=new HBox();
        HBox Hbox_Titel=new HBox();
        HBox Hbox_TijdInMinuten=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_NieuweAfleveringAanmaken=new Label("Nieuwe aflevering aanmaken");
        Label Label_WelkeSerie=new Label("Van welke serie wilt U het seizoen selecteren?");
        Label Label_WelkSeizoen=new Label("Bij welk seizoen hoort de nieuwe aflevering?");
        Label Label_Titel=new Label("Wat is de titel van de aflevering?");
        Label Label_TijdInMinuten=new Label("Wat is het tijdsduur in minuten?");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkeSerie=new ComboBox();//deze bevat alle series. Geef de querie een methode als arraylist en zet die erin.
        ComboBox Combobox_WelkSeizoen=new ComboBox();//Deze bevat alle seizoenen van de geselecteerde serie.

        //Hier worden de textfields aangemaakt
        TextField Textfield_Titel=new TextField();
        TextField Textfield_TijdInMinuten=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_NieuweAfleveringAanmaken toegevoegd.
        Borderpane_NieuweAfleveringAanmaken.setTop(Hbox_Label);
        Borderpane_NieuweAfleveringAanmaken.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_NieuweAfleveringAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_WelkSeizoen);
        Vbox_Gegevens.getChildren().add(Hbox_Titel);
        Vbox_Gegevens.getChildren().add(Hbox_TijdInMinuten);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkeSerie toegevoegd.
        Hbox_WelkeSerie.getChildren().add(Label_WelkeSerie);
        Hbox_WelkeSerie.getChildren().add(Combobox_WelkeSerie);

        //Hier wordt alles aan Hbox_WelkSeizoen toegevoegd.
        Hbox_WelkSeizoen.getChildren().add(Label_WelkSeizoen);
        Hbox_WelkSeizoen.getChildren().add(Combobox_WelkSeizoen);

        //Hier wordt alles aan Hbox_Titel toegevoegd.
        Hbox_Titel.getChildren().add(Label_Titel);
        Hbox_Titel.getChildren().add(Textfield_Titel);

        //Hier wordt alles aan Hbox_TijdInMinuten toegevoegd.
        Hbox_TijdInMinuten.getChildren().add(Label_TijdInMinuten);
        Hbox_TijdInMinuten.getChildren().add(Textfield_TijdInMinuten);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_NieuweAfleveringAanmaken netjes gemaakt.
        Borderpane_NieuweAfleveringAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_NieuweAfleveringAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

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

        //Hier wordt Hbox_WelkSeizoen netjes gemaakt
        Label_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkSeizoen.setAlignment(Pos.CENTER);
        Hbox_WelkSeizoen.setSpacing(100);
        Label_WelkSeizoen.setPrefSize(580,50);
        Combobox_WelkSeizoen.setPrefSize(580,50);

        //Hier wordt Hbox_Titel netjes gemaakt.
        Label_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Titel.setAlignment(Pos.CENTER);
        Hbox_Titel.setSpacing(100);
        Label_Titel.setPrefSize(580,50);
        Textfield_Titel.setPrefSize(580,50);

        //Hier wordt Hbox_TijdInMinuten netjes gemaakt.
        Label_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_TijdInMinuten.setAlignment(Pos.CENTER);
        Hbox_TijdInMinuten.setSpacing(100);
        Label_TijdInMinuten.setPrefSize(580,50);
        Textfield_TijdInMinuten.setPrefSize(580,50);

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
            Afleveringen Afleveringen=new Afleveringen();
            stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene nieuweAfleveringAanmaken aangemaakt.
        Scene NieuweAfleveringAanmaken=new Scene(Borderpane_NieuweAfleveringAanmaken,1300,650);
        stage.setTitle("Nieuwe aflevering aanmaken");

        //Hier wordt de scene gereturned.
        return NieuweAfleveringAanmaken;
    }
}
