package GUI.AccountGericht;

import GUI.Basis.AccountGericht;
import GUI.Profiel.AccountProfiel;
import GUI.Profiel.ProfielAanmaken;
import GUI.Profiel.ProfielWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountGerichtAccount {

    public Scene Account(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Account=new BorderPane();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Button=new HBox();

        //Hier wordt het label aangemaakt
        Label Label_Accountnaam=new Label("Account"); //Wat er in het label staat wordt is anders voor elk account. Zo heeft account: Klaas de naam Klaas in het label

        //Hier worden de buttons aangemaakt
        Button Button_ProfielAanmaken=new Button("Profiel aanmaken");
        Button Button_BekekenFilmsAccount=new Button("Bekeken films voor dit account");
        Button Button_BekekenAfleveringenAccount=new Button("Bekeken afleveringen voor dit account");
        Button Button_Terug=new Button("< Terug");


//Dit is een test voor de view zelf en moet zo snel mogelijk verwijderd worden.
        HBox Hbox=new HBox();
        VBox Vbox=new VBox();
        Button klik=new Button("Naam");
        Button Wijzig=new Button("Wijzig");
        Borderpane_Account.setBottom(Hbox);
        Hbox.getChildren().add(Vbox);
        Vbox.getChildren().add(klik);
        Vbox.getChildren().add(Wijzig);
        klik.setOnAction(actionEvent -> {
            AccountProfiel Profiel=new AccountProfiel();
            stage.setScene(Profiel.AccountProfiel(stage));
            stage.setFullScreen(true);
        });


        //Hier wordt alles aan Borderpane_Account toegevoegd.
        Borderpane_Account.setTop(Hbox_Label);
        Borderpane_Account.setRight(Hbox_Button);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Accountnaam);

        //Hier wordt alles aan Hbox_Button toegevoegd.
        Hbox_Button.getChildren().add(Button_ProfielAanmaken);
        Hbox_Button.getChildren().add(Button_BekekenFilmsAccount);
        Hbox_Button.getChildren().add(Button_BekekenAfleveringenAccount);
        Hbox_Button.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Account netjes gemaakt.
        Borderpane_Account.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Accountnaam.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Button_ProfielAanmaken.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_BekekenFilmsAccount.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_BekekenAfleveringenAccount.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Button.setSpacing(175);





        //Hier krijgt Button_ProfielAanmaken zijn functionaliteit.
        Button_ProfielAanmaken.setOnAction(actionEvent -> {
            ProfielAanmaken ProfielAanmaken=new ProfielAanmaken();
            stage.setScene(ProfielAanmaken.ProfielAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProfielWijzigen zijn functionaliteit.
        Wijzig.setOnAction(actionEvent -> {
            ProfielWijzigen ProfielWijzigen=new ProfielWijzigen();
            stage.setScene(ProfielWijzigen.ProfielWijzigen(stage));
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

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            AccountGericht AccountGericht=new AccountGericht();
            stage.setScene(AccountGericht.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene Account aangemaakt
        Scene Account=new Scene(Borderpane_Account,1300,650);
        stage.setTitle("Account"); //Dit veranderd in de naam van het account voor elk account.

        //Hier wordt de scene gereturned.
        return Account;
    }
}
