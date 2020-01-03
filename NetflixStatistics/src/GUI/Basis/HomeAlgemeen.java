package GUI.Basis;

import GUI.Algemeen.Afleveringen;
import GUI.Algemeen.Films;
import GUI.Algemeen.Series;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HomeAlgemeen {

    public Scene HomeAlgemeen(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Algemeen = new BorderPane();
        HBox Hbox_Algemeen_Label=new HBox();
        HBox Hbox_Algemeen_Terug=new HBox();
        HBox Hbox_Algemeen_Buttons = new HBox();

        //Hier wordt het label aangemaakt.
        Label FilmsOfSeries=new Label("Wilt U de statistieken voor de films of voor de series zien?");

        //Hier worden de buttons aangemaakt.
        Button Button_Terug=new Button("< Terug");
        Button Button_Films=new Button("Films");
        Button Button_Series=new Button("Series");





        // Hier wordt alles aan Borderpane_Algemeen toegevoegt.
        Borderpane_Algemeen.setTop(Hbox_Algemeen_Label);
        Borderpane_Algemeen.setRight(Hbox_Algemeen_Terug);
        Borderpane_Algemeen.setCenter(Hbox_Algemeen_Buttons);

        //Hier wordt alles aan Hbox_Algemeen_Label toegevoegt.
        Hbox_Algemeen_Label.getChildren().add(FilmsOfSeries);

        // Hier wordt alles aan Hbox_Algemeen_Terug toegevoegt.
        Hbox_Algemeen_Terug.getChildren().add(Button_Terug);

        //Hier wordt alles aan Hbox_Algemeen_Buttons toegevoegt.
        Hbox_Algemeen_Buttons.getChildren().add(Button_Films);
        Hbox_Algemeen_Buttons.getChildren().add(Button_Series);





        //Hier wordt Borderpane_Algemeen netjes gemaakt.
        Borderpane_Algemeen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Algemeen_Label netjes gemaakt.
        Hbox_Algemeen_Label.setAlignment(Pos.CENTER);
        FilmsOfSeries.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 20");

        //Hier wordt Hbox_Algemeen_Terug netjes gemaakt.
        Hbox_Algemeen_Buttons.setAlignment(Pos.TOP_RIGHT);
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");

        //Hier wordt Hbox_Algemeen_Buttons netjes gemaakt.
        Hbox_Algemeen_Buttons.setSpacing(145);
        Button_Films.setPrefSize(350,110);
        Button_Series.setPrefSize(350,110);
        Hbox_Algemeen_Buttons.setAlignment(Pos.CENTER);
        Button_Films.setStyle("-fx-background-color: Black; -fx-font-size:40; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Series.setStyle("-fx-background-color: Black; -fx-font-size:40; -fx-text-fill: Red; -fx-font-weight: bold");





        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Home Home=new Home();
            stage.setScene(Home.Home(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Films zijn functionaliteit.
        Button_Films.setOnAction(actionEvent -> {
            Films Films=new Films();
            stage.setScene(Films.HomeAlgemeenFilms(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Series zijn functionaliteit.
        Button_Series.setOnAction(actionEvent -> {
            Series Series=new Series();
            stage.setScene(Series.Series(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene Algemeen aangemaakt.
        Scene Algemeen=new Scene(Borderpane_Algemeen,1300,650);
        stage.setTitle("Algemeen");

        //Hier wordt scene Algemeen gereturned.
        return Algemeen;
    }
}
// Deze pagina behoort alleen nog een afbeelding te bevatten.

//Deze gaat naar de aflevering pagina
/*
Button_Afleveringen.setOnAction(actionEvent -> {
        Afleveringen Afleveringen=new Afleveringen();
        stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
        stage.setFullScreen(true);
        });
*/