package GUI.AccountGericht;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        //Hier wordt de button aangemaakt.
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_BekekenFilmsAccount toegevoegd.
        Borderpane_BekekenFilmsAccount.setTop(Hbox_Label);
        Borderpane_BekekenFilmsAccount.setRight(Hbox_Button);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_BekekenFilms);

        //Hier wordt alles aan Hbox_Button toegevoegd
        Hbox_Button.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_BekekenFilmsAccount netjes gemaakt.
        Borderpane_BekekenFilmsAccount.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_BekekenFilms.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");





        //Hier krijgt Button_Terug zijn functionaliteit
        Button_Terug.setOnAction(actionEvent -> {
            AccountGerichtAccount AccountGerichtAccount=new AccountGerichtAccount();
            stage.setScene(AccountGerichtAccount.Account(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene BekekenFilmsAccount aangemaakt.
        Scene BekekenFilmsAccount=new Scene(Borderpane_BekekenFilmsAccount,1300,650);
        stage.setTitle("Bekeken films voor dit account");

        //Hier wordt de scene gereturned.
        return BekekenFilmsAccount;
    }
}
