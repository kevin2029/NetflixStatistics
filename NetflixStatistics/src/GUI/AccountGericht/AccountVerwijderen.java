package GUI.AccountGericht;

import Functionaliteit.Verwijderen.Verwijderen_Account;
import Functionaliteit.Verwijderen.Verwijderen_Profiel;
import GUI.Algemeen.Series;
import GUI.Basis.AccountGericht;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountVerwijderen {
    public Scene AccountVerwijderen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_AccountVerwijderen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_Label_WelkAccount=new HBox();
        HBox Hbox_Combobox_WelkAccount=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_AccountVerwijderen=new Label("Account verwijderen");
        Label Label_WelkAccount=new Label("Welk account wilt U verwijderen?");
        Label Label_ErrorKies=new Label("Kies eerst een account");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkAccount=new ComboBox();//Hier staan alle accounts.

        //Hier worden de buttons aangemaakt.
        Button Button_Verwijderen=new Button("Verwijderen");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_AccountVerwijderen toegevoegd.
        Borderpane_AccountVerwijderen.setTop(Hbox_Label);
        Borderpane_AccountVerwijderen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_AccountVerwijderen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_Label_WelkAccount);
        Vbox_Gegevens.getChildren().add(Hbox_Combobox_WelkAccount);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label_WelkAccount toegevoegd.
        Hbox_Label_WelkAccount.getChildren().add(Label_WelkAccount);

        //Hier wordt alles aan Hbox_Combobox_WelkAccount toegevoegd.
        Hbox_Combobox_WelkAccount.getChildren().add(Combobox_WelkAccount);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Verwijderen);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);





        //Hier wordt Borderpane_AccountVerwijderen netjes gemaakt.
        Borderpane_AccountVerwijderen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_AccountVerwijderen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_Label_WelkAccount netjes gemaakt.
        Label_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Label_WelkAccount.setAlignment(Pos.CENTER);
        Hbox_Label_WelkAccount.setSpacing(100);
        Label_WelkAccount.setPrefSize(580,50);

        //Hier wordt Hbox_Combobox_WelkAccount netjes gemaakt.
        Combobox_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Combobox_WelkAccount.setAlignment(Pos.CENTER);
        Hbox_Combobox_WelkAccount.setSpacing(100);
        Combobox_WelkAccount.setPrefSize(580,50);

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
            //Eerst kijken we of het account geselecteerd is.
            if(Combobox_WelkAccount.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else{
                //Hier gaat het geselecteerd ID omgezet worden in een int.
                int AccountID=Integer.parseInt((String)Combobox_WelkAccount.getSelectionModel().getSelectedItem());

                //Als we hier zijn is er een account geselecteerd dus maken we een methodcall.
                Verwijderen_Account.Verwijderen(AccountID);

                //Hier gaan we terug naar het scherm AccountGericht.
                AccountGericht AccountGericht=new AccountGericht();
                stage.setScene(AccountGericht.HomeAccountGericht(stage));
                stage.setFullScreen(true);
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountGericht AccountGericht=new AccountGericht();
            stage.setScene(AccountGericht.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene AccountVerwijderen aangemaakt.
        Scene AccountVerwijderen=new Scene(Borderpane_AccountVerwijderen,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene gereturned
        return AccountVerwijderen;
    }
}
