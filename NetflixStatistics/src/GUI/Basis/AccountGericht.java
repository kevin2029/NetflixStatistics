package GUI.Basis;

import Functionaliteit.Opslaan.Wijzigen.Opslaan_AccountWijzigen;
import Functionaliteit.Printen.Accounts.Printen_AccountMet1Profiel;
import Functionaliteit.Printen.Accounts.Printen_AccountMetMeerDan1Profiel;
import Functionaliteit.Printen.Accounts.Printen_AlleAccounts;
import GUI.AccountGericht.*;
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
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_CRUD=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ProfielenEnProgrammas=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Accounts=new Label("Accounts");

        //Hier worden de buttons aangemaakt.
        Button Button_Profielen=new Button("Profielen");
        Button Button_AcccountAanmaken=new Button("Account aanmaken");
        Button Button_AccountWijzigen=new Button("Account wijzigen");
        Button Button_AccountVerwijderen=new Button("Account verwijderen");
        Button Button_AlleAccounts=new Button("Alle accounts");
        Button Button_AccountsMet1Profiel=new Button("Accounts met 1 profiel");
        Button Button_AccountsMetMeerDan1Profiel=new Button("Accounts met meer dan 1 profiel");
        Button Button_Terug=new Button("< Terug");
        Button Button_BekekenFilmsAccount=new Button("Bekeken films account");
        Button Button_BekekenAfleveringenAccount=new Button("Bekeken afleveringen account");





        //Hier wordt alles aan Borderpane_Accounts toegevoegd.
        Borderpane_Accounts.setTop(Vbox_LabelEnButtons);
        Borderpane_Accounts.setCenter(Printen_AlleAccounts.AlleAccounts());

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_CRUD);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);
        Vbox_LabelEnButtons.getChildren().add(Hbox_ProfielenEnProgrammas);

        //Hier wordt alles een Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Accounts);

        //Hier wordt alles aan Hbox_CRUD toegevoegd.
        Hbox_CRUD.getChildren().add(Button_Profielen);
        Hbox_CRUD.getChildren().add(Button_AcccountAanmaken);
        Hbox_CRUD.getChildren().add(Button_AccountWijzigen);
        Hbox_CRUD.getChildren().add(Button_AccountVerwijderen);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_AlleAccounts);
        Hbox_Buttons.getChildren().add(Button_AccountsMet1Profiel);
        Hbox_Buttons.getChildren().add(Button_AccountsMetMeerDan1Profiel);
        Hbox_Buttons.getChildren().add(Button_Terug);

        //Hier wordt alles aan Hbox_ProfielenEnProgrammas toegevoegd.
        Hbox_ProfielenEnProgrammas.getChildren().add(Button_BekekenFilmsAccount);
        Hbox_ProfielenEnProgrammas.getChildren().add(Button_BekekenAfleveringenAccount);





        //Hier wordt Borderpane_Accounts netjes gemaakt.
        Borderpane_Accounts.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Accounts.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_CRUD netjes gemaakt.
        Button_Profielen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AcccountAanmaken.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountWijzigen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountVerwijderen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_CRUD.setAlignment(Pos.CENTER);
        Hbox_CRUD.setSpacing(100);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_AlleAccounts.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountsMet1Profiel.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountsMetMeerDan1Profiel.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(220);

        //Hier wordt Hbox_ProfielenEnProgrammas netjes gemaakt.
        Button_BekekenFilmsAccount.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_BekekenAfleveringenAccount.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_ProfielenEnProgrammas.setAlignment(Pos.CENTER);
        Hbox_ProfielenEnProgrammas.setSpacing(100);




        //Hier krijgt Button_AccountAanmaken zijn functionaliteit.
        Button_AcccountAanmaken.setOnAction(actionEvent -> {
            AccountAanmaken AccountAanmaken=new AccountAanmaken();
            stage.setScene(AccountAanmaken.AccountAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AccountWijzigen zijn functionaliteit.
        Button_AccountWijzigen.setOnAction(actionEvent -> {
            AccountWijzigen AccountWijzigen=new AccountWijzigen();
            stage.setScene(AccountWijzigen.AccountWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AccountVerwijderen zijn functionaliteit.
        Button_AccountVerwijderen.setOnAction(actionEvent -> {
            AccountVerwijderen AccountVerwijderen=new AccountVerwijderen();
            stage.setScene(AccountVerwijderen.AccountVerwijderen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AlleAccounts zijn functionaliteit.
        Button_AlleAccounts.setOnAction(actionEvent -> {
            Borderpane_Accounts.setCenter(Printen_AlleAccounts.AlleAccounts());
        });

        //Hier krijgt Button_AccountsMet1Profiel zijn functionaliteit.
        Button_AccountsMet1Profiel.setOnAction(actionEvent -> {
            Borderpane_Accounts.setCenter(Printen_AccountMet1Profiel.AccountsMet1Profiel());
        });

        //Hier krijgt Button_AccountsMetMeerDan1Profiel zijn functionaliteit.
        Button_AccountsMetMeerDan1Profiel.setOnAction(actionEvent -> {
            Borderpane_Accounts.setCenter(Printen_AccountMetMeerDan1Profiel.AccountsMetMeerDan1Profiel());
        });

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            Home Home=new Home();
            stage.setScene(Home.Home(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_Profielen zijn functionaliteit.
        Button_Profielen.setOnAction(actionEvent -> {
            AccountGerichtAccount Acc=new AccountGerichtAccount();
            stage.setScene(Acc.Account(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_BekekenFilmsAccount zijn functionaliteit.
        Button_BekekenFilmsAccount.setOnAction(actionEvent -> {
            BekekenFilmsAccount BekekenFilmsAccount=new BekekenFilmsAccount();
            stage.setScene(BekekenFilmsAccount.BekekenFilmsAccount(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_BekekenAfleveringenAccount zijn functionaliteit.
        Button_BekekenAfleveringenAccount.setOnAction(actionEvent -> {
            BekekenAfleveringenAccount BekekenAfleveringenAccount=new BekekenAfleveringenAccount();
            stage.setScene(BekekenAfleveringenAccount.BekekenAfleveringenAccount(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de Scene AccountGericht aangemaakt
        Scene AccountGericht= new Scene(Borderpane_Accounts,1300,650);
        stage.setTitle("Accounts");

        //Hier wordt scene AccountGericht gereturned.
        return AccountGericht;
    }
}
