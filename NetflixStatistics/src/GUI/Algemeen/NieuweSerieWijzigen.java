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

public class NieuweSerieWijzigen {

    public Scene NieuweSerieWijzigen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_SerieWijzigen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkeSerie=new HBox();
        HBox Hbox_Naam=new HBox();
        HBox Hbox_Genre=new HBox();
        HBox Hbox_Taal=new HBox();
        HBox Hbox_LeeftijdsIndicatie=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de Labels aangemaakt.
        Label Label_SerieWijzigen=new Label("Serie wijzigen");
        Label Label_WelkeSerie=new Label("Welke Serie wilt u wijzigen?");
        Label Label_Naam=new Label("Wat is de naam van de serie?");
        Label Label_Genre=new Label("Wat is het genre van de serie?");
        Label Label_Taal=new Label("Wat is de gesproken taal in de serie?");
        Label Label_LeeftijdsIndicatie=new Label("Hoe oud moet je minimaal zijn om de serie te mogen kijken?");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_Welkeserie=new ComboBox();//Hier worden alle series aan toegevoegd.

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Naam=new TextField();
        TextField Textfield_Genre=new TextField();
        TextField Textfield_Taal=new TextField();
        TextField Textfield_LeeftijdsIndicatie=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_SerieWijzigen toegevoegd.
        Borderpane_SerieWijzigen.setTop(Hbox_Label);
        Borderpane_SerieWijzigen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_SerieWijzigen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_Naam);
        Vbox_Gegevens.getChildren().add(Hbox_Genre);
        Vbox_Gegevens.getChildren().add(Hbox_Taal);
        Vbox_Gegevens.getChildren().add(Hbox_LeeftijdsIndicatie);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkeSerie toegevoegd.
        Hbox_WelkeSerie.getChildren().add(Label_WelkeSerie);
        Hbox_WelkeSerie.getChildren().add(Combobox_Welkeserie);

        //Hier wordt alles aan Hbox_Naam toegevoegd.
        Hbox_Naam.getChildren().add(Label_Naam);
        Hbox_Naam.getChildren().add(Textfield_Naam);

        //Hier wordt alles aan Hbox_Genre toegevoegd.
        Hbox_Genre.getChildren().add(Label_Genre);
        Hbox_Genre.getChildren().add(Textfield_Genre);

        //Hier wordt alles aan Hbox_Taal toegevoegd.
        Hbox_Taal.getChildren().add(Label_Taal);
        Hbox_Taal.getChildren().add(Textfield_Taal);

        //Hier wordt alles aan Hbox_LeeftijdsIndicatie toegevoegd.
        Hbox_LeeftijdsIndicatie.getChildren().add(Label_LeeftijdsIndicatie);
        Hbox_LeeftijdsIndicatie.getChildren().add(Textfield_LeeftijdsIndicatie);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_Seriewijzigen netjes gemaakt.
        Borderpane_SerieWijzigen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_SerieWijzigen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkeSerie netjes gemaakt.
        Label_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_Welkeserie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkeSerie.setAlignment(Pos.CENTER);
        Hbox_WelkeSerie.setSpacing(100);
        Label_WelkeSerie.setPrefSize(580,50);
        Combobox_Welkeserie.setPrefSize(580,50);

        //Hier wordt Hbox_Naam netjes gemaakt.
        Label_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Naam.setAlignment(Pos.CENTER);
        Hbox_Naam.setSpacing(100);
        Label_Naam.setPrefSize(580,50);
        Textfield_Naam.setPrefSize(580,50);

        //Hier wordt Hbox_Genre netjes gemaakt.
        Label_Genre.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Genre.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Genre.setAlignment(Pos.CENTER);
        Hbox_Genre.setSpacing(100);
        Label_Genre.setPrefSize(580,50);
        Textfield_Genre.setPrefSize(580,50);

        //Hier wordt Hbox_Taal netjes gemaakt.
        Label_Taal.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Taal.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Taal.setAlignment(Pos.CENTER);
        Hbox_Taal.setSpacing(100);
        Label_Taal.setPrefSize(580,50);
        Textfield_Taal.setPrefSize(580,50);

        //Hier wordt Hbox_LeeftijdsIndicatie netjes gemaakt.
        Label_LeeftijdsIndicatie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_LeeftijdsIndicatie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_LeeftijdsIndicatie.setAlignment(Pos.CENTER);
        Hbox_LeeftijdsIndicatie.setSpacing(100);
        Label_LeeftijdsIndicatie.setPrefSize(580,50);
        Textfield_LeeftijdsIndicatie.setPrefSize(580,50);

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
            Series Series=new Series();
            stage.setScene(Series.Series(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene NieuweSerieAanmaken aangemaakt.
        Scene NieuweSerieWijzigen=new Scene(Borderpane_SerieWijzigen,1300,650);
        stage.setTitle("Nieuwe serie wijzigen");

        //Hier wordt de scene gereturned.
        return NieuweSerieWijzigen;
    }
}
