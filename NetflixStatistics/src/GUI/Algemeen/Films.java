package GUI.Algemeen;

import GUI.Basis.HomeAlgemeen;
import GUI.Programma.ProgrammaWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Films {

    public Scene HomeAlgemeenFilms(Stage stage){
        // Hier worden de grids aangemaakt.
        BorderPane Borderpane_Films=new BorderPane();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Films=new Label("Films");

        //Hier worden de buttons aangemaakt.
        Button Button_NieuweFilm=new Button("Nieuwe film aanmaken");
        Button Button_AlleFilms=new Button("Alle films");
        Button Button_LangsteTijdsduur=new Button("Langste tijdsduur");
        Button Button_FilmsMetLeeftijdsindicatieOnder16=new Button("Films met leeftijdsindicatie onder 16");
        Button Button_Terug=new Button("< Terug");


//Dit is een test voor de view zelf en moet zo snel mogelijk verwijderd worden.
        HBox Hbox=new HBox();
        VBox Vbox=new VBox();
        Button Wijzig=new Button("Wijzig");
        Borderpane_Films.setBottom(Hbox);
        Hbox.getChildren().add(Vbox);
        Vbox.getChildren().add(Wijzig);
        Wijzig.setOnAction(actionEvent -> {
            NieuweFilmWijzigen FilmWijzigen=new NieuweFilmWijzigen();
            stage.setScene(FilmWijzigen.NieuweFilmWijzigen(stage));
            stage.setFullScreen(true);
        });


        //Hier wordt alles aan Borderpane_Films toegevoegt.
        Borderpane_Films.setTop(Hbox_Label);
        Borderpane_Films.setRight(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegt.
        Hbox_Label.getChildren().add(Label_Films);

        //Hier wordt alles aan Hbox_Buttons toegevoegt.
        Hbox_Buttons.getChildren().add(Button_NieuweFilm);
        Hbox_Buttons.getChildren().add(Button_AlleFilms);
        Hbox_Buttons.getChildren().add(Button_LangsteTijdsduur);
        Hbox_Buttons.getChildren().add(Button_FilmsMetLeeftijdsindicatieOnder16);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Films netjes gemaakt.
        Borderpane_Films.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Films.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_RIGHT);
        Button_NieuweFilm.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AlleFilms.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(130);






        //Hier krijgt Button_NieuweFilm zijn functionaliteit.
        Button_NieuweFilm.setOnAction(actionEvent -> {
            NieuweFilmAanmaken NieuweFilmAanmaken=new NieuweFilmAanmaken();
            stage.setScene(NieuweFilmAanmaken.NieuweFilmAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt film wijzigen zijn functionaliteit

        //Hier krijgt film verwijderen zijn functionaliteit.

        //Hier krijgt Button_AlleFilms zijn functionaliteit.

        //Hier krijgt Button_LangsteTijdsduur zijn functionaliteit.

        //Hier krijgt Button_FilmsMetLeeftijdsindicatieOnder16.

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            HomeAlgemeen HomeAlgemeen=new HomeAlgemeen();
            stage.setScene(HomeAlgemeen.HomeAlgemeen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt Scene films gemaakt.
        Scene Films=new Scene(Borderpane_Films,1300,650);
        stage.setTitle("Films");

        //Hier wordt scene Films gereturned.
        return Films;
    }
}
