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
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_CRUD=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Films=new Label("Films");

        //Hier worden de buttons aangemaakt.
        Button Button_NieuweFilm=new Button("Nieuwe film aanmaken");
        Button Button_FilmWijzigen=new Button("Film wijzigen");
        Button Button_FilmVerwijderen=new Button("Film verwijderen");
        Button Button_AlleFilms=new Button("Alle films");
        Button Button_LangsteTijdsduur=new Button("Langste tijdsduur");
        Button Button_FilmsMetLeeftijdsindicatieOnder16=new Button("Films met leeftijdsindicatie onder 16");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Films toegevoegt.
        Borderpane_Films.setTop(Vbox_LabelEnButtons);

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_CRUD);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegt.
        Hbox_Label.getChildren().add(Label_Films);

        //Hier wordt alles aan Hbox_CRUD toegevoegd.
        Hbox_CRUD.getChildren().add(Button_NieuweFilm);
        Hbox_CRUD.getChildren().add(Button_FilmWijzigen);
        Hbox_CRUD.getChildren().add(Button_FilmVerwijderen);

        //Hier wordt alles aan Hbox_Buttons toegevoegt.
        Hbox_Buttons.getChildren().add(Button_AlleFilms);
        Hbox_Buttons.getChildren().add(Button_LangsteTijdsduur);
        Hbox_Buttons.getChildren().add(Button_FilmsMetLeeftijdsindicatieOnder16);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Films netjes gemaakt.
        Borderpane_Films.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Films.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_CRUD netjes gemaakt.
        Hbox_CRUD.setAlignment(Pos.TOP_CENTER);
        Button_NieuweFilm.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_FilmWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_FilmVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_CRUD.setSpacing(50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_CENTER);
        Button_AlleFilms.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(250);






        //Hier krijgt Button_NieuweFilm zijn functionaliteit.
        Button_NieuweFilm.setOnAction(actionEvent -> {
            NieuweFilmAanmaken NieuweFilmAanmaken=new NieuweFilmAanmaken();
            stage.setScene(NieuweFilmAanmaken.NieuweFilmAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_FilmWijzigen zijn functionaliteit
        Button_FilmWijzigen.setOnAction(actionEvent -> {
            NieuweFilmWijzigen FilmWijzigen=new NieuweFilmWijzigen();
            stage.setScene(FilmWijzigen.NieuweFilmWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_FilmVerwijderen zijn functionaliteit.
        Button_FilmVerwijderen.setOnAction(actionEvent -> {
            FilmVerwijderen FilmVerwijderen=new FilmVerwijderen();
            stage.setScene(FilmVerwijderen.FilmVerwijderen(stage));
            stage.setFullScreen(true);
        });

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
