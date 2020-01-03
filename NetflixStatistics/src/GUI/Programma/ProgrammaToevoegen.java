package GUI.Programma;

import GUI.Profiel.AccountProfiel;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ProgrammaToevoegen {
    public Scene ProgrammaToevoegen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProgrammaToevoegen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkProgramma=new HBox();
        HBox Hbox_Percentage=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProgrammaToevoegen=new Label("Programma toevoegen");
        Label Label_WelkProgramma=new Label("Welk programma wilt U toevoegen?");
        Label Label_Percentage=new Label("Hoeveel procent heeft U bekeken?");

        //Hier wordt de combobox aangemaakt.
        ComboBox Opties=new ComboBox(); //Maak een arraylist of andere lijst bijv observable list om de combobox opties te geven. Hier staan alle programmas

        //Hier wordt het textfield aangemaakt.
        TextField Textfield_Percentage=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProgrammaToevoegen toegevoegd.
        Borderpane_ProgrammaToevoegen.setTop(Hbox_Label);
        Borderpane_ProgrammaToevoegen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProgrammaToevoegen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkProgramma);
        Vbox_Gegevens.getChildren().add(Hbox_Percentage);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkProgramma toegevoegd.
        Hbox_WelkProgramma.getChildren().add(Label_WelkProgramma);
        Hbox_WelkProgramma.getChildren().add(Opties);

        //Hier wordt alles aan Hbox_Percentage toegevoegd.
        Hbox_Percentage.getChildren().add(Label_Percentage);
        Hbox_Percentage.getChildren().add(Textfield_Percentage);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_ProgrammaToevoegen netjes gemaakt.
        Borderpane_ProgrammaToevoegen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProgrammaToevoegen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkProgramma netjes gemaakt.
        Label_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Opties.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProgramma.setAlignment(Pos.CENTER);
        Hbox_WelkProgramma.setSpacing(100);
        Label_WelkProgramma.setPrefSize(500,50);
        Opties.setPrefSize(500,50);

        //Hier wordt Hbox_Percentage netjes gemaakt.
        Label_Percentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Percentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Percentage.setAlignment(Pos.CENTER);
        Hbox_Percentage.setSpacing(100);
        Label_Percentage.setPrefSize(500,50);
        Textfield_Percentage.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);





        //Hier krijgt Button_Opslaan zijn functionaliteit.

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountProfiel Profiel=new AccountProfiel();
            stage.setScene(Profiel.AccountProfiel(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene ProgrammaToevoegen aangemaakt.
        Scene ProgrammaToevoegen=new Scene(Borderpane_ProgrammaToevoegen,1300,650);
        stage.setTitle("Programma toevoegen");

        //Hier wordt de scene gereturned.
        return ProgrammaToevoegen;
    }
}
