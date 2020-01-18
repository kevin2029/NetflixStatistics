package GUI.AccountGericht;

import GUI.Basis.AccountGericht;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BekekenFilmsAccount {

    public Scene BekekenFilmsAccount(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_BekekenFilmsAccount=new BorderPane();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Button=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_BekekenFilms=new Label("Bekeken films voor dit account");

        //Hier worden de buttons aangemaakt.
        Button Button_Print=new Button("Print");
        Button Button_Terug=new Button("< Terug");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_Account=new ComboBox();





        //Hier wordt alles aan Borderpane_BekekenFilmsAccount toegevoegd.
        Borderpane_BekekenFilmsAccount.setTop(Hbox_Label);
        Borderpane_BekekenFilmsAccount.setRight(Hbox_Button);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_BekekenFilms);

        //Hier wordt alles aan Hbox_Button toegevoegd
        Hbox_Button.getChildren().add(Button_Print);
        Hbox_Button.getChildren().add(Combobox_Account);
        Hbox_Button.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_BekekenFilmsAccount netjes gemaakt.
        Borderpane_BekekenFilmsAccount.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_BekekenFilms.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Button_Print.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Combobox_Account.setPromptText("Selecteer een account");
        Combobox_Account.setPrefSize(300,40);
        Combobox_Account.setStyle("-fx-background-color: White; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Button.setAlignment(Pos.TOP_RIGHT);
        Hbox_Button.setSpacing(500);





        //Hier krijgt Button_Print zijn functionaliteit.
        Button_Print.setOnAction(actionEvent -> {
            if(Combobox_Account.getSelectionModel().isEmpty()){

            }else{
                //Eerst zetten we het geselecteerde AccountID om in een Integer.
                int AccountID= Integer.parseInt((String)Combobox_Account.getSelectionModel().getSelectedItem());

                //Hier komt de methodcall voor het printen.

            }
        });

        //Hier krijgt Button_Terug zijn functionaliteit
        Button_Terug.setOnAction(actionEvent -> {
            AccountGericht AccountGericht=new AccountGericht();
            stage.setScene(AccountGericht.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene BekekenFilmsAccount aangemaakt.
        Scene BekekenFilmsAccount=new Scene(Borderpane_BekekenFilmsAccount,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene gereturned.
        return BekekenFilmsAccount;
    }
}
