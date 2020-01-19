package GUI.Algemeen;

import Functionaliteit.Printen.Series.Printen_Seizoenen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Seizoenen {

    public Scene Seizoenen(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Seizoenen=new BorderPane();
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Seizoenen=new Label("Seizoenen");

        //Hier wordt de button aangemaakt.
        Button Button_Afleveringen=new Button("Afleveringen");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Seizoenen toegevoegd.
        Borderpane_Seizoenen.setTop(Vbox_LabelEnButtons);
        Borderpane_Seizoenen.setCenter(Printen_Seizoenen.AlleSeizoenen());

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Seizoenen);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Afleveringen);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Seizoenen netjes gemaakt.
        Borderpane_Seizoenen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Seizoenen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_RIGHT);
        Button_Afleveringen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(590);





        //Hier krijgt Button_Afleveringen zijn functionaliteit.
        Button_Afleveringen.setOnAction(actionEvent -> {
            Afleveringen Afleveringen=new Afleveringen();
            stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Series Series=new Series();
            stage.setScene(Series.Series(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene Seizoenen aangemaakt.
        Scene Seizoenen=new Scene(Borderpane_Seizoenen,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene terug gegeven.
        return Seizoenen;
    }
}
//code die nu niet meer gebruikt wordt en verwijderd word.
//Button Button_NieuwSeizoenAanmaken=new Button("Nieuw seizoen aanmaken");
//Button Button_SeizoenVerwijderen=new Button("Seizoen verwijderen");
//Hbox_Buttons.getChildren().add(Button_NieuwSeizoenAanmaken);
//Hbox_Buttons.getChildren().add(Button_SeizoenVerwijderen);
//Button_NieuwSeizoenAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_SeizoenVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Hbox_Buttons.setSpacing(470);




        /*
        //Hier krijgt Button_SeizoenAanmaken zijn functionaliteit.
        Button_NieuwSeizoenAanmaken.setOnAction(actionEvent -> {
            NieuwSeizoenAanmaken NieuwSeizoenAanmaken=new NieuwSeizoenAanmaken();
            stage.setScene(NieuwSeizoenAanmaken.NieuwSeizoenAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_SeizoenVerwijderen zijn functionaliteit.
        Button_SeizoenVerwijderen.setOnAction(actionEvent -> {
            SeizoenVerwijderen SeizoenVerwijderen=new SeizoenVerwijderen();
            stage.setScene(SeizoenVerwijderen.SeizoenVerwijderen(stage));
            stage.setFullScreen(true);
        });
        */