package GUI.Algemeen;

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

        //Hier worden de buttons aangemaakt.
        Button Button_SeizoenAanmaken=new Button("Seizoen aanmaken");
        Button Button_Terug=new Button("< Terug");


//Dit is een test voor de view zelf en moet zo snel mogelijk verwijderd worden.
        HBox Hbox=new HBox();
        VBox Vbox=new VBox();
        Button klik=new Button("Naam");
        Borderpane_Seizoenen.setBottom(Hbox);
        Hbox.getChildren().add(Vbox);
        Vbox.getChildren().add(klik);
        klik.setOnAction(actionEvent -> {
            Afleveringen Afleveringen=new Afleveringen();
            stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
            stage.setFullScreen(true);
        });


        //Hier wordt alles aan Borderpane_Seizoenen toegevoegd.
        Borderpane_Seizoenen.setTop(Vbox_LabelEnButtons);

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Seizoenen);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_SeizoenAanmaken);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Seizoenen netjes gemaakt.
        Borderpane_Seizoenen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Seizoenen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_RIGHT);
        Button_SeizoenAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(565);





        //Hier krijgt Button_SeizoenAanmaken zijn functionaliteit.
        Button_SeizoenAanmaken.setOnAction(actionEvent -> {
            NieuwSeizoenAanmaken NieuwSeizoenAanmaken=new NieuwSeizoenAanmaken();
            stage.setScene(NieuwSeizoenAanmaken.NieuwSeizoenAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Terug zijn functionaliteit
        Button_Terug.setOnAction(actionEvent -> {
            Series Series=new Series();
            stage.setScene(Series.Series(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene Seizoenen aangemaakt.
        Scene Seizoenen=new Scene(Borderpane_Seizoenen,1300,650);
        stage.setTitle("Seizoenen voor deze serie.");

        //Hier wordt de scene gereturnd.
        return Seizoenen;
    }
}
