package GUI.Algemeen;

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

        //Hier worden de buttons aangemaakt.
        Button Button_NieuweAfleveringAanmaken=new Button("Nieuwe aflevering aanmaken");
        Button Button_NieuweAfleveringWijzigen=new Button("Nieuwe aflevering wijzigen");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Afleveringen toegevoegt.
        Borderpane_Afleveringen.setTop(Hbox_Label);
        Borderpane_Afleveringen.setRight(Hbox_Button);

        //Hier wordt alles aan Hbox_Label toegevoegt.
        Hbox_Label.getChildren().add(Label_Afleveringen);

        //Hier wordt alles aan Hbox_Button Toegevoegt
        Hbox_Button.getChildren().add(Button_NieuweAfleveringAanmaken);
        Hbox_Button.getChildren().add(Button_NieuweAfleveringWijzigen);
        Hbox_Button.getChildren().add(Button_Terug);






        //Hier wordt Borderpane_Afleveringen netjes gemaakt.
        Borderpane_Afleveringen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Afleveringen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Hbox_Button.setAlignment(Pos.TOP_CENTER);
        Button_NieuweAfleveringAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_NieuweAfleveringWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Button.setSpacing(420);





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

        //Hier krijgt aflevering verwijderen zijn functionaliteit

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Seizoenen Seizoenen=new Seizoenen();
            stage.setScene(Seizoenen.Seizoenen(stage));
            stage.setFullScreen(true);
        });




        //Hier wordt Scene Afleveringen aangemaakt.
        Scene Afleveringen=new Scene(Borderpane_Afleveringen,1300,650);
        stage.setTitle("Afleveringen van dit seizoen");

        //Hier wordt de scene Afleveringen gereturned.
        return Afleveringen;
    }
}
