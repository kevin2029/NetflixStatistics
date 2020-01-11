package GUI.Programma;

import GUI.Profiel.AccountProfiel;
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

public class ProgrammaWijzigen {
    public Scene ProgrammaWijzigen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProgrammaWijzigen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkAccount=new HBox();
        HBox Hbox_WelkProfiel=new HBox();
        HBox Hbox_WelkProgramma=new HBox();
        HBox Hbox_Percentage=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProgrammaWijzigen=new Label("Programma wijzigen");
        Label Label_WelkAccount=new Label("Van welk Account wilt U een profiel selecteren?");
        Label Label_WelkProfiel=new Label("Op welk profiel wilt U een programma wijzigen?");
        Label Label_WelkProgramma=new Label("Welk programma wilt U wijzigen?");
        Label Label_NieuwPercentage=new Label("Geef het nieuwe bekeken percentage");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkAccount=new ComboBox();//Hier staan alle accounts.
        ComboBox Combobox_WelkProfiel=new ComboBox();//Hier staan alle profielen.
        ComboBox Combobox_WelkProgrammas=new ComboBox(); //Hier staan alle programmas.

        //Hier wordt het textfield aangemaakt.
        TextField Textfield_Percentage=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProgrammaWijzigen toegevoegd.
        Borderpane_ProgrammaWijzigen.setTop(Hbox_Label);
        Borderpane_ProgrammaWijzigen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProgrammaWijzigen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkAccount);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProfiel);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProgramma);
        Vbox_Gegevens.getChildren().add(Hbox_Percentage);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkAccount toegevoegd.
        Hbox_WelkAccount.getChildren().add(Label_WelkAccount);
        Hbox_WelkAccount.getChildren().add(Combobox_WelkAccount);

        //Hier wordt alles aan Hbox_WelkProfiel toegevoegd.
        Hbox_WelkProfiel.getChildren().add(Label_WelkProfiel);
        Hbox_WelkProfiel.getChildren().add(Combobox_WelkProfiel);

        //Hier wordt alles aan Hbox_WelkProgramma toegevoegd.
        Hbox_WelkProgramma.getChildren().add(Label_WelkProgramma);
        Hbox_WelkProgramma.getChildren().add(Combobox_WelkProgrammas);

        //Hier wordt alles aan Hbox_Percentage toegevoegd.
        Hbox_Percentage.getChildren().add(Label_NieuwPercentage);
        Hbox_Percentage.getChildren().add(Textfield_Percentage);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_ProgrammaWijzigen netjes gemaakt.
        Borderpane_ProgrammaWijzigen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProgrammaWijzigen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkAccount netjes gemaakt.
        Label_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkAccount.setAlignment(Pos.CENTER);
        Hbox_WelkAccount.setSpacing(100);
        Label_WelkAccount.setPrefSize(500,50);
        Combobox_WelkAccount.setPrefSize(500,50);

        //Hier wordt Hbox_WelkProfiel netjes gemaakt.
        Label_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProfiel.setAlignment(Pos.CENTER);
        Hbox_WelkProfiel.setSpacing(100);
        Label_WelkProfiel.setPrefSize(500,50);
        Combobox_WelkProfiel.setPrefSize(500,50);

        //Hier wordt Hbox_WelkProgramma netjes gemaakt.
        Label_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkProgrammas.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProgramma.setAlignment(Pos.CENTER);
        Hbox_WelkProgramma.setSpacing(100);
        Label_WelkProgramma.setPrefSize(500,50);
        Combobox_WelkProgrammas.setPrefSize(500,50);

        //Hier wordt Hbox_Percentage netjes gemaakt.
        Label_NieuwPercentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Percentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Percentage.setAlignment(Pos.CENTER);
        Hbox_Percentage.setSpacing(100);
        Label_NieuwPercentage.setPrefSize(500,50);
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





        //Hier wordt scene ProgrammaWijzigen aangemaakt.
        Scene ProgrammaWijzigen=new Scene(Borderpane_ProgrammaWijzigen,1300,650);
        stage.setTitle("Programma wijzigen");

        //Hier wordt de scene gereturned.
        return ProgrammaWijzigen;
    }
}