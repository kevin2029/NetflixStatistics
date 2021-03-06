package GUI.Algemeen;

import Functionaliteit.Printen.Series.Printen_Series;
import GUI.Basis.HomeAlgemeen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Series {

    public Scene Series (Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Series=new BorderPane();
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Series=new Label("Series");

        //Hier worden de buttons aangemaakt.
        Button Button_Seizoenen=new Button("Seizoenen");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Series toegevoegd.
        Borderpane_Series.setTop(Vbox_LabelEnButtons);
        Borderpane_Series.setCenter(Printen_Series.AlleSeries());

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Series);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Seizoenen);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Series netjes gemaakt.
        Borderpane_Series.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Series.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_RIGHT);
        Button_Seizoenen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(605);





        //Hier krijgt Button_Seizoenen zijn functionaliteit.
        Button_Seizoenen.setOnAction(actionEvent -> {
            Seizoenen Seizoenen=new Seizoenen();
            stage.setScene(Seizoenen.Seizoenen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            HomeAlgemeen HomeAlgemeen=new HomeAlgemeen();
            stage.setScene(HomeAlgemeen.HomeAlgemeen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene Series aangemaakt.
        Scene Series=new Scene(Borderpane_Series,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene terug gegeven.
        return Series;
    }
}
//code die nu niet meer gebruikt wordt en verwijderd word.
//Button Button_NieuweSerieAanmaken=new Button("Nieuwe serie aanmaken");
//Button Button_SerieWijzigen=new Button("Serie wijzigen");
//Button Button_SerieVerwijderen=new Button("Serie verwijderen");
//Hbox_Buttons.getChildren().add(Button_NieuweSerieAanmaken);
//Hbox_Buttons.getChildren().add(Button_SerieWijzigen);
//Hbox_Buttons.getChildren().add(Button_SerieVerwijderen);
//Button_NieuweSerieAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_SerieWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_SerieVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Hbox_Buttons.setSpacing(270);




        /*
        //Hier krijgt Button_SerieAanmaken zijn functionaliteit.
        Button_NieuweSerieAanmaken.setOnAction(actionEvent -> {
            NieuweSerieAanmaken NieuweSerieAanmaken=new NieuweSerieAanmaken();
            stage.setScene(NieuweSerieAanmaken.NieuweSerieAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_SerieWijzigen zijn functionaliteit.
        Button_SerieWijzigen.setOnAction(actionEvent -> {
            NieuweSerieWijzigen NieuweSerieWijzigen=new NieuweSerieWijzigen();
            stage.setScene(NieuweSerieWijzigen.NieuweSerieWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_SerieVerwijderen zijn functionaliteit.
        Button_SerieVerwijderen.setOnAction(actionEvent -> {
            SerieVerwijderen SerieVerwijderen=new SerieVerwijderen();
            stage.setScene(SerieVerwijderen.SerieVerwijderen(stage));
            stage.setFullScreen(true);
        });

       */