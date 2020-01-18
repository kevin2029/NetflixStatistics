package GUI.Algemeen;

import Functionaliteit.Printen.Series.Printen_Afleveringen;
import GUI.Basis.Home;
import GUI.Basis.HomeAlgemeen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Afleveringen {

    public Scene HomeAlgemeenAfleveringen(Stage stage){
        // hier worden de grids aangemaakt.
        BorderPane Borderpane_Afleveringen=new BorderPane();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Button=new HBox();

        // Hier wordt het label aangemaakt.
        Label Label_Afleveringen=new Label("Afleveringen");

        //Hier wordt de button aangemaakt.
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Afleveringen toegevoegt.
        Borderpane_Afleveringen.setTop(Hbox_Label);
        Borderpane_Afleveringen.setRight(Hbox_Button);
        Borderpane_Afleveringen.setCenter(Printen_Afleveringen.AlleAfleveringen());

        //Hier wordt alles aan Hbox_Label toegevoegt.
        Hbox_Label.getChildren().add(Label_Afleveringen);

        //Hier wordt alles aan Hbox_Button Toegevoegt
        Hbox_Button.getChildren().add(Button_Terug);






        //Hier wordt Borderpane_Afleveringen netjes gemaakt.
        Borderpane_Afleveringen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Afleveringen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Hbox_Button.setAlignment(Pos.TOP_RIGHT);
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");





        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Seizoenen Seizoenen=new Seizoenen();
            stage.setScene(Seizoenen.Seizoenen(stage));
            stage.setFullScreen(true);
        });




        //Hier wordt Scene Afleveringen aangemaakt.
        Scene Afleveringen=new Scene(Borderpane_Afleveringen,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene Afleveringen gereturned.
        return Afleveringen;
    }
}
//code die nu niet meer gebruikt wordt en verwijderd word.
//Button Button_NieuweAfleveringAanmaken=new Button("Nieuwe aflevering aanmaken");
//Button Button_NieuweAfleveringWijzigen=new Button("aflevering wijzigen");
//Button Button_AfleveringVerwijderen=new Button("Aflevering verwijderen");
//Hbox_Button.getChildren().add(Button_NieuweAfleveringAanmaken);
//Hbox_Button.getChildren().add(Button_NieuweAfleveringWijzigen);
//Hbox_Button.getChildren().add(Button_AfleveringVerwijderen);
//Button_NieuweAfleveringAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_NieuweAfleveringWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_AfleveringVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Hbox_Button.setSpacing(220);




        /*
        //Hier krijgt Button_NieuweAfleveringAanmaken zijn functionaliteit.
        Button_NieuweAfleveringAanmaken.setOnAction(actionEvent -> {
            NieuweAfleveringAanmaken NieuweAfleveringAanmaken=new NieuweAfleveringAanmaken();
            stage.setScene(NieuweAfleveringAanmaken.NieuweAfleveringAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AfleveringWijzigen zijn functionaliteit
        Button_NieuweAfleveringWijzigen.setOnAction(actionEvent -> {
            NieuweAfleveringWijzigen NieuweAfleveringWijzigen=new NieuweAfleveringWijzigen();
            stage.setScene(NieuweAfleveringWijzigen.NieuweAfleveringWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AfleveringVerwijderen zijn functionaliteit.
        Button_AfleveringVerwijderen.setOnAction(actionEvent -> {
            AfleveringVerwijderen AfleveringVerwijderen=new AfleveringVerwijderen();
            stage.setScene(AfleveringVerwijderen.AfleveringVerwijderen(stage));
            stage.setFullScreen(true);
        });
        */