package GUI.Profiel;

import Functionaliteit.Verwijderen.Verwijderen_Profiel;
import Functionaliteit.Verwijderen.Verwijderen_Programma;
import GUI.AccountGericht.AccountGerichtAccount;
import GUI.Algemeen.Seizoenen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfielVerwijderen {
    public Scene ProfielVerwijderen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProfielVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkProfiel_Label=new HBox();
        HBox Hbox_WelkProfiel_Combobox=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProfielVerwijderen=new Label("Profiel verwijderen");
        Label Label_WelkProfiel=new Label("Welk profiel wilt U verwijderen?");
        Label Label_ErrorKies=new Label("Kies eerst een account en een profiel");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkProfiel=new ComboBox();//Hier staan alle profielen van het account.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProfielVerwijderen toegevoegd.
        Borderpane_ProfielVerwijderen.setTop(Hbox_Label);
        Borderpane_ProfielVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProfielVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkProfiel_Label);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProfiel_Combobox);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkProfiel_Label toegevoegd.
        Hbox_WelkProfiel_Label.getChildren().add(Label_WelkProfiel);

        //Hier wordt alles aan Hbox_WelkProfiel_Combobox toegevoegd.
        Hbox_WelkProfiel_Combobox.getChildren().add(Combobox_WelkProfiel);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);





        //Hier wordt Borderpane_SeizoenVerwijderen  netjes gemaakt.
        Borderpane_ProfielVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProfielVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkProfiel_Label netjes gemaakt.
        Label_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProfiel_Label.setAlignment(Pos.CENTER);
        Label_WelkProfiel.setPrefSize(580,50);

        //Hier wordt Hbox_WelkProfiel_Combobox netjes gemaakt.
        Combobox_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProfiel_Combobox.setAlignment(Pos.CENTER);
        Combobox_WelkProfiel.setPrefSize(580,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Verwijderen.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Verwijderen.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(500,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Verwijderen zijn functionaliteit.
        Button_Verwijderen.setOnAction(actionEvent -> {
            //Eerst kijken we of het account en een profiel geselecteerd zijn.
            if(Combobox_WelkProfiel.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else{
                //Als we hier zijn is er een account en een profiel geselecteerd dus maken we een methodcall.


                //Hier gaan we terug naar het scherm Account.
                AccountGerichtAccount Account=new AccountGerichtAccount();
                stage.setScene(Account.Account(stage));
                stage.setFullScreen(true);
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountGerichtAccount AccountGerichtAccount=new AccountGerichtAccount();
            stage.setScene(AccountGerichtAccount.Account(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene ProfielVerwijderen aangemaakt.
        Scene ProfielVerwijderen=new Scene(Borderpane_ProfielVerwijderen,1300,650);
        stage.setTitle("Profiel verwijderen");

        //Hier wordt de scene gereturned
        return ProfielVerwijderen;
    }
}
