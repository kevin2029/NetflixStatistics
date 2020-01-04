package GUI.Algemeen;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FilmVerwijderen {
    public Scene FilmVerwijderen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_FilmVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_Label_WelkeFilm=new HBox();
        HBox Hbox_Combobox_WelkeFilm=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_FilmVerwijderen=new Label("Film verwijderen");
        Label Label_WelkeFilm=new Label("Welke film wilt U verwijderen?");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkeFilm=new ComboBox();//Hier staan alle films.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_FilmVerwijderen toegevoegd.
        Borderpane_FilmVerwijderen.setTop(Hbox_Label);
        Borderpane_FilmVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_FilmVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_Label_WelkeFilm);
        Vbox_Gegevens.getChildren().add(Hbox_Combobox_WelkeFilm);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label_WelkeFilm toegevoegd.
        Hbox_Label_WelkeFilm.getChildren().add(Label_WelkeFilm);

        //Hier wordt alles aan Hbox_Combobox_WelkeFilm toegevoegd.
        Hbox_Combobox_WelkeFilm.getChildren().add(Combobox_WelkeFilm);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_FilmVerwijderen  netjes gemaakt.
        Borderpane_FilmVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_FilmVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_Label_WelkeFilm netjes gemaakt.
        Label_WelkeFilm.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Label_WelkeFilm.setAlignment(Pos.CENTER);
        Hbox_Label_WelkeFilm.setSpacing(100);
        Label_WelkeFilm.setPrefSize(580,50);

        //Hier wordt Hbox_Combobox_WelkeFilm netjes gemaakt.
        Combobox_WelkeFilm.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Combobox_WelkeFilm.setAlignment(Pos.CENTER);
        Hbox_Combobox_WelkeFilm.setSpacing(100);
        Combobox_WelkeFilm.setPrefSize(580,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Verwijderen.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Verwijderen.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);





        //Hier krijgt Button_Verwijderen zijn functionaliteit.

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Films Films=new Films();
            stage.setScene(Films.HomeAlgemeenFilms(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene FilmVerwijderen aangemaakt.
        Scene FilmVerwijderen=new Scene(Borderpane_FilmVerwijderen,1300,650);
        stage.setTitle("Film verwijderen");

        //Hier wordt de scene gereturned
        return FilmVerwijderen;
    }
}
