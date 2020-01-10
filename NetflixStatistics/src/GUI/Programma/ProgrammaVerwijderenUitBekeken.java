package GUI.Programma;

import GUI.Basis.AccountGericht;
import GUI.Profiel.AccountProfiel;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgrammaVerwijderenUitBekeken {
    public Scene ProgrammaVerwijderenUitBekeken(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProgrammaVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkAccount=new HBox();
        HBox Hbox_WelkProfiel=new HBox();
        HBox Hbox_WelkProgramma=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProgrammaVerwijderen=new Label("Programma verwijderen uit bekeken programma's");
        Label Label_WelkAccount=new Label("Van welk Account wilt U een profiel selecteren?");
        Label Label_WelkProfiel=new Label("Op welk profiel wilt U een programma verwijderen?");
        Label Label_WelkProgramma=new Label("Welk programma wilt U verwijderen?");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkAccount=new ComboBox();//Hier staan alle accounts.
        ComboBox Combobox_WelkProfiel=new ComboBox();//Hier staan alle profielen.
        ComboBox Combobox_WelkProgramma=new ComboBox(); //Hier staan alle programmas.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProgrammaVerwijderen toegevoegd.
        Borderpane_ProgrammaVerwijderen.setTop(Hbox_Label);
        Borderpane_ProgrammaVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProgrammaVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkAccount);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProfiel);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProgramma);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkAccount toegevoegd.
        Hbox_WelkAccount.getChildren().add(Label_WelkAccount);
        Hbox_WelkAccount.getChildren().add(Combobox_WelkAccount);

        //Hier wordt alles aan Hbox_WelkProfiel toegevoegd.
        Hbox_WelkProfiel.getChildren().add(Label_WelkProfiel);
        Hbox_WelkProfiel.getChildren().add(Combobox_WelkProfiel);

        //Hier wordt alles aan Hbox_WelkProgramma toegevoegd.
        Hbox_WelkProgramma.getChildren().add(Label_WelkProgramma);
        Hbox_WelkProgramma.getChildren().add(Combobox_WelkProgramma);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_ProgrammaVerwijderen netjes gemaakt.
        Borderpane_ProgrammaVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProgrammaVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
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

        //Hier worden Hbox_WelkProgramma netjes gemaakt.
        Label_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProgramma.setAlignment(Pos.CENTER);
        Hbox_WelkProgramma.setSpacing(100);
        Label_WelkProgramma.setPrefSize(500,50);
        Combobox_WelkProgramma.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Verwijderen.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Verwijderen.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);





        //Hier krijgt Button_Verwijderen zijn functionaliteit.

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountProfiel Profiel=new AccountProfiel();
            stage.setScene(Profiel.AccountProfiel(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene ProgrammaVerwijderen aangemaakt.
        Scene ProgrammaVerwijderen=new Scene(Borderpane_ProgrammaVerwijderen,1300,650);
        stage.setTitle("Programma verwijderen uit bekeken programma's");

        //Hier wordt de scene gereturned
        return ProgrammaVerwijderen;
    }
}
