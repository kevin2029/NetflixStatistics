package GUI.AccountGericht;

import GUI.Basis.AccountGericht;
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

public class AccountWijzigen {

    public Scene AccountWijzigen(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_AccountWijzigen= new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkAccount=new HBox();
        HBox Hbox_Naam= new HBox();
        HBox Hbox_Woonplaats= new HBox();
        HBox Hbox_Adres=new HBox();
        HBox Hbox_buttons=new HBox();

        //Hier worden de Labels aangemaakt.
        Label Label_AccountWijzigen=new Label("Account wijzigen");
        Label Label_WelkAccount=new Label("Welk account wilt U wijzigen?");
        Label Label_Naam=new Label("Wat is uw voor en achternaam?");
        Label Label_Woonplaats=new Label("Wat is uw woonplaats?");
        Label Label_Adres=new Label("Wat is uw adres?");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkAccount=new ComboBox();//Hierin moeten alle accounts staan.

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Naam=new TextField();
        TextField Textfield_Woonplaats=new TextField();
        TextField Textfield_Adres=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_AccountWijzigen toegevoegd.
        Borderpane_AccountWijzigen.setTop(Hbox_Label);
        Borderpane_AccountWijzigen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_AccountWijzigen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkAccount);
        Vbox_Gegevens.getChildren().add(Hbox_Naam);
        Vbox_Gegevens.getChildren().add(Hbox_Woonplaats);
        Vbox_Gegevens.getChildren().add(Hbox_Adres);
        Vbox_Gegevens.getChildren().add(Hbox_buttons);

        //Hier wordt alles aan Hbox_WelkAccount toegevoegd.
        Hbox_WelkAccount.getChildren().add(Label_WelkAccount);
        Hbox_WelkAccount.getChildren().add(Combobox_WelkAccount);

        //Hier wordt alles aan Hbox_Naam toegevoegd.
        Hbox_Naam.getChildren().add(Label_Naam);
        Hbox_Naam.getChildren().add(Textfield_Naam); //Deze is al standaard ingevuld met de info van het account

        //Hier wordt alles aan Hbox_Woonplaats toegevoegd.
        Hbox_Woonplaats.getChildren().add(Label_Woonplaats);
        Hbox_Woonplaats.getChildren().add(Textfield_Woonplaats);//Deze is al standaard ingevuld met de info van het account

        //Hier wordt alles aan Hbox_Adres toegevoegd.
        Hbox_Adres.getChildren().add(Label_Adres);
        Hbox_Adres.getChildren().add(Textfield_Adres); //Deze is al standaard ingevuld met de info van het account

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_buttons.getChildren().add(Button_Opslaan);
        Hbox_buttons.getChildren().add(Button_Annuleren);





        //Hier wordt Borderpane_AccountWijzigen netjes gemaakt.
        Borderpane_AccountWijzigen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_AccountWijzigen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

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

        //Hier wordt Hbox_Naam netjes gemaakt.
        Label_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Naam.setAlignment(Pos.CENTER);
        Hbox_Naam.setSpacing(100);
        Label_Naam.setPrefSize(500,50);
        Textfield_Naam.setPrefSize(500,50);

        //Hier wordt Hbox_Woonplaats netjes gemaakt.
        Label_Woonplaats.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Woonplaats.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Woonplaats.setAlignment(Pos.CENTER);
        Hbox_Woonplaats.setSpacing(100);
        Label_Woonplaats.setPrefSize(500,50);
        Textfield_Woonplaats.setPrefSize(500,50);

        //Hier wordt Hbox_Adres netjes gemaakt.
        Label_Adres.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Adres.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Adres.setAlignment(Pos.CENTER);
        Hbox_Adres.setSpacing(100);
        Label_Adres.setPrefSize(500,50);
        Textfield_Adres.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_buttons.setAlignment(Pos.CENTER);
        Hbox_buttons.setSpacing(100);





        //Hier krijgt Button_Opslaan zijn functionaliteit.

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountGericht AccountGericht=new AccountGericht();
            stage.setScene(AccountGericht.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene AccountWijzigen aangemaakt.
        Scene AccountWijzigen=new Scene(Borderpane_AccountWijzigen,1300,650);
        stage.setTitle("Account aanmaken");

        //Hier wordt de scene gereturned.
        return AccountWijzigen;
    }
}
