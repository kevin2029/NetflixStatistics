/*
package GUI.Algemeen;

import Functionaliteit.Opslaan.Wijzigen.Opslaan_FilmWijzigen;
import Functionaliteit.Opslaan.Wijzigen.Opslaan_SerieWijzigen;
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

public class NieuweFilmWijzigen {
    public Scene NieuweFilmWijzigen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_NieuweFilmWijzigen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkeFilm=new HBox();
        HBox Hbox_Titel=new HBox();
        HBox Hbox_Genre=new HBox();
        HBox Hbox_TijdInMinuten=new HBox();
        HBox Hbox_Taal=new HBox();
        HBox Hbox_LeeftijdsIndicatie=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();
        HBox Hbox_ErrorVakjes=new HBox();
        HBox Hbox_ErrorInteger=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_FilmWijzigen=new Label("Film wijzigen");
        Label Label_WelkeFilm=new Label("Welke film wilt u wijzigen?");
        Label Label_Titel=new Label("Wat is de titel van de film?");
        Label Label_Genre=new Label("Wat is het genre van de film?");
        Label Label_TijdInMinuten=new Label("Wat is de tijdsduur in minuten?");
        Label Label_Taal=new Label("Wat is de gesproken taal in de film?");
        Label Label_Leeftijdsindicatie=new Label("Hoe oud moet je minimaal zijn om de film te mogen kijken?");
        Label Label_ErrorKies=new Label("Kies eerst een film");
        Label Label_ErrorVakjes=new Label("Vul alle vakjes in");
        Label Label_ErrorInteger=new Label("Tijdsduur en leeftijdsindicatie moet een getal zijn");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkeFilm=new ComboBox();//Hier staan alle films in.

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Titel=new TextField();
        TextField Textfield_Genre=new TextField();
        TextField Textfield_TijdInMinuten=new TextField();
        TextField Textfield_Taal=new TextField();
        TextField Textfield_LeeftijdsIndicatie=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_NieuweFilmWijzigen toegevoegd.
        Borderpane_NieuweFilmWijzigen.setTop(Hbox_Label);
        Borderpane_NieuweFilmWijzigen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_FilmWijzigen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkeFilm);
        Vbox_Gegevens.getChildren().add(Hbox_Titel);
        Vbox_Gegevens.getChildren().add(Hbox_Genre);
        Vbox_Gegevens.getChildren().add(Hbox_TijdInMinuten);
        Vbox_Gegevens.getChildren().add(Hbox_Taal);
        Vbox_Gegevens.getChildren().add(Hbox_LeeftijdsIndicatie);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkeFilm toegevoegd.
        Hbox_WelkeFilm.getChildren().add(Label_WelkeFilm);
        Hbox_WelkeFilm.getChildren().add(Combobox_WelkeFilm);

        //Hier wordt alles aan Hbox_Titel toegevoegd.
        Hbox_Titel.getChildren().add(Label_Titel);
        Hbox_Titel.getChildren().add(Textfield_Titel);//Deze is al ingevuld met de info van de film

        //Hier wordt alles aan Hbox_Genre toegevoegd.
        Hbox_Genre.getChildren().add(Label_Genre);
        Hbox_Genre.getChildren().add(Textfield_Genre);//Deze is al ingevuld met de info van de film

        //Hier wordt alles aan Hbox_TijdInMinuten toegevoegd.
        Hbox_TijdInMinuten.getChildren().add(Label_TijdInMinuten);
        Hbox_TijdInMinuten.getChildren().add(Textfield_TijdInMinuten);//Deze is al ingevuld met de info van de film

        //Hier wordt alles aan Hbox_Taal toegevoegd.
        Hbox_Taal.getChildren().add(Label_Taal);
        Hbox_Taal.getChildren().add(Textfield_Taal);//Deze is al ingevuld met de info van de film

        //Hier wordt alles aan Hbox_LeeftijdsIndicatie toegevoegd.
        Hbox_LeeftijdsIndicatie.getChildren().add(Label_Leeftijdsindicatie);
        Hbox_LeeftijdsIndicatie.getChildren().add(Textfield_LeeftijdsIndicatie);//Deze is al ingevuld met de info van de film

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);

        //Hier wordt alles aan Hbox_ErrorVakjes toegevoegd.
        Hbox_ErrorVakjes.getChildren().add(Label_ErrorVakjes);

        //Hier wordt alles aan Hbox_ErrorInteger toegevoegd.
        Hbox_ErrorInteger.getChildren().add(Label_ErrorInteger);





        //Hier wordt Borderpane_NieuweFilmWijzigen netjes gemaakt.
        Borderpane_NieuweFilmWijzigen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_FilmWijzigen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkeFilm netjes gemaakt.
        Label_WelkeFilm.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkeFilm.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkeFilm.setAlignment(Pos.CENTER);
        Hbox_WelkeFilm.setSpacing(100);
        Label_WelkeFilm.setPrefSize(580,50);
        Combobox_WelkeFilm.setPrefSize(580,50);

        //Hier wordt Hbox_Titel netjes gemaakt.
        Label_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Titel.setAlignment(Pos.CENTER);
        Hbox_Titel.setSpacing(100);
        Label_Titel.setPrefSize(580,50);
        Textfield_Titel.setPrefSize(580,50);

        //Hier wordt Hbox_Genre netjes gemaakt.
        Label_Genre.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Genre.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Genre.setAlignment(Pos.CENTER);
        Hbox_Genre.setSpacing(100);
        Label_Genre.setPrefSize(580,50);
        Textfield_Genre.setPrefSize(580,50);

        //Hier wordt Hbox_TijdInMinuten netjes gemaakt.
        Label_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_TijdInMinuten.setAlignment(Pos.CENTER);
        Hbox_TijdInMinuten.setSpacing(100);
        Label_TijdInMinuten.setPrefSize(580,50);
        Textfield_TijdInMinuten.setPrefSize(580,50);

        //Hier wordt Hbox_Taal netjes gemaakt.
        Label_Taal.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Taal.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Taal.setAlignment(Pos.CENTER);
        Hbox_Taal.setSpacing(100);
        Label_Taal.setPrefSize(580,50);
        Textfield_Taal.setPrefSize(580,50);

        //Hier wordt Hbox_LeeftijdsIndicatie netjes gemaakt.
        Label_Leeftijdsindicatie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_LeeftijdsIndicatie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_LeeftijdsIndicatie.setAlignment(Pos.CENTER);
        Hbox_LeeftijdsIndicatie.setSpacing(100);
        Label_Leeftijdsindicatie.setPrefSize(580,50);
        Textfield_LeeftijdsIndicatie.setPrefSize(580,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(500,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);

        //Hier wordt Hbox_ErrorVakjes netjes gemaakt.
        Label_ErrorVakjes.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorVakjes.setPrefSize(500,50);
        Label_ErrorVakjes.setAlignment(Pos.CENTER);
        Hbox_ErrorVakjes.setAlignment(Pos.CENTER);

        //Hier wordt Hbox_ErrorInteger netjes gemaakt.
        Label_ErrorInteger.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorInteger.setPrefSize(1000,50);
        Label_ErrorInteger.setAlignment(Pos.CENTER);
        Hbox_ErrorInteger.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Opslaan zijn functionaliteit.
        Button_Opslaan.setOnAction(actionEvent -> {
            //Hier wordt gekeken of een film geselecteerd is.
            if(Combobox_WelkeFilm.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else {
                //Als we hier zijn is alles geselecteerd dus kan de error weg.
                Vbox_Gegevens.getChildren().remove(Hbox_ErrorKies);

                //Hier kijken we of de vakjes zijn ingevuld.
                if (Textfield_Titel.getText().trim().isEmpty() || Textfield_Genre.getText().trim().isEmpty()||Textfield_TijdInMinuten.getText().trim().isEmpty()||Textfield_Taal.getText().trim().isEmpty()||Textfield_LeeftijdsIndicatie.getText().trim().isEmpty()) {
                    Vbox_Gegevens.getChildren().add(Hbox_ErrorVakjes);
                } else {

                    //Als we hier zijn, zijn alle vakjes ingevuld dus kan de error weg.
                    Vbox_Gegevens.getChildren().remove(Hbox_ErrorVakjes);

                    try {
                        //Hier wordt gekeken of de leeftijdsindicatie ook daadwerkelijk een cijfer is.
                        int Tijdsduur= Integer.parseInt(Textfield_TijdInMinuten.getText().trim());
                        int Leeftijdsindicatie = Integer.parseInt(Textfield_LeeftijdsIndicatie.getText().trim());

                        //Hier komt de methodcall
                        Opslaan_FilmWijzigen.Opslaan(Combobox_WelkeFilm.getSelectionModel(),Textfield_Titel.getText().trim(),Textfield_Genre.getText().trim(),Tijdsduur,Textfield_Taal.getText().trim(),Leeftijdsindicatie);

                        //Hier gaat men terug naar het scherm Films.
                        Films Films=new Films();
                        stage.setScene(Films.HomeAlgemeenFilms(stage));
                        stage.setFullScreen(true);

                    } catch (NumberFormatException NFE) {
                        //Als het geen nummer was dan wordt de volgende HBox toegevoegd aan de VBox.
                        Vbox_Gegevens.getChildren().add(Hbox_ErrorInteger);
                    }
                }
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Films Films=new Films();
            stage.setScene(Films.HomeAlgemeenFilms(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene NieuweFilmWijzigen aangemaakt.
        Scene NieuweFilmWijzigen=new Scene(Borderpane_NieuweFilmWijzigen,1300,650);
        stage.setTitle("Nieuwe film wijzigen");

        //Hier wordt de scene gereturned.
        return NieuweFilmWijzigen;
    }
}
*/