package GUI.Algemeen;

import GUI.Basis.HomeAlgemeen;
import GUI.Profiel.AccountProfiel;
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
        Button Button_NieuweSerieAanmaken=new Button("Nieuwe serie aanmaken");
        Button Button_SerieWijzigen=new Button("Serie wijzigen");
        Button Button_SerieVerwijderen=new Button("Serie verwijderen");
        Button Button_Terug=new Button("< Terug");


//Dit is een test voor de view zelf en moet zo snel mogelijk verwijderd worden.
        HBox Hbox=new HBox();
        VBox Vbox=new VBox();
        Button klik=new Button("Naam");
        Borderpane_Series.setBottom(Hbox);
        Hbox.getChildren().add(Vbox);
        Vbox.getChildren().add(klik);
        klik.setOnAction(actionEvent -> {
            Seizoenen Seizoenen=new Seizoenen();
            stage.setScene(Seizoenen.Seizoenen(stage));
            stage.setFullScreen(true);
        });


        //Hier wordt alles aan Borderpane_Series toegevoegd.
        Borderpane_Series.setTop(Vbox_LabelEnButtons);

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Series);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_NieuweSerieAanmaken);
        Hbox_Buttons.getChildren().add(Button_SerieWijzigen);
        Hbox_Buttons.getChildren().add(Button_SerieVerwijderen);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Series netjes gemaakt.
        Borderpane_Series.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Series.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_CENTER);
        Button_NieuweSerieAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_SerieWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_SerieVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(270);





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

        //Hier krijgt Button_Terug zijn functionaliteit
        Button_Terug.setOnAction(actionEvent -> {
            HomeAlgemeen HomeAlgemeen=new HomeAlgemeen();
            stage.setScene(HomeAlgemeen.HomeAlgemeen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene Series aangemaakt.
        Scene Series=new Scene(Borderpane_Series,1300,650);
        stage.setTitle("Series");

        //Hier wordt de scene gereturned.
        return Series;
    }
}
