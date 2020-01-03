package GUI.Basis;

import GUI.AccountGericht.AccountAanmaken;
import GUI.AccountGericht.AccountGerichtAccount;
import GUI.AccountGericht.AccountWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountGericht {

    public Scene HomeAccountGericht(Stage stage){

        //Hier worden de grids gemaakt.
        BorderPane Borderpane_Accounts=new BorderPane();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Accounts=new Label("Accounts");

        //Hier worden de buttons aangemaakt.
        Button Button_AcccountAanmaken=new Button("Account aanmaken");
        Button Button_AlleAccounts=new Button("Alle accounts");
        Button Button_AccountsMet1Profiel=new Button("Accounts met 1 profiel");
        Button Button_AccountsMetMeerDan1Profiel=new Button("Accounts met meer dan 1 profiel");
        Button Button_Terug=new Button("< Terug");


//Dit is een test voor de view zelf en moet zo snel mogelijk verwijderd worden.
        HBox Hbox=new HBox();
        VBox Vbox=new VBox();
        Button klik=new Button("Naam");
        Button Wijzig=new Button("Wijzig");
        Borderpane_Accounts.setBottom(Hbox);
        Hbox.getChildren().add(Vbox);
        Vbox.getChildren().add(klik);
        Vbox.getChildren().add(Wijzig);
        klik.setOnAction(actionEvent -> {
            AccountGerichtAccount Acc=new AccountGerichtAccount();
            stage.setScene(Acc.Account(stage));
            stage.setFullScreen(true);
        });


        //Hier wordt alles aan Borderpane_Accounts toegevoegd.
        Borderpane_Accounts.setTop(Hbox_Label);
        Borderpane_Accounts.setLeft(Hbox_Buttons);

        //Hier wordt alles een Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Accounts);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_AcccountAanmaken);
        Hbox_Buttons.getChildren().add(Button_AlleAccounts);
        Hbox_Buttons.getChildren().add(Button_AccountsMet1Profiel);
        Hbox_Buttons.getChildren().add(Button_AccountsMetMeerDan1Profiel);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Accounts netjes gemaakt.
        Borderpane_Accounts.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Accounts.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_AcccountAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AlleAccounts.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountsMet1Profiel.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountsMetMeerDan1Profiel.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(120);





        //Hier krijgt Button_AccountAanmaken zijn functionaliteit.
        Button_AcccountAanmaken.setOnAction(actionEvent -> {
            AccountAanmaken AccountAanmaken=new AccountAanmaken();
            stage.setScene(AccountAanmaken.AccountAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AlleAccounts zijn functionaliteit.

        //Hier krijgt Button_AccountsMet1Profiel zijn functionaliteit.

        //Hier krijgt Button_AccountsMetMeerDan1Profiel zijn functionaliteit.

        //Hier krijgt Button_AccountWijzigen zijn functionaliteit.
        Wijzig.setOnAction(actionEvent -> {
            AccountWijzigen AccountWijzigen=new AccountWijzigen();
            stage.setScene(AccountWijzigen.AccountWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AccountVerwijderen zijn functionaliteit.

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Home Home=new Home();
            stage.setScene(Home.Home(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de Scene AccountGericht aangemaakt
        Scene AccountGericht= new Scene(Borderpane_Accounts,1300,650);
        stage.setTitle("Accounts");

        //Hier wordt scene AccountGericht gereturned.
        return AccountGericht;
    }
}
