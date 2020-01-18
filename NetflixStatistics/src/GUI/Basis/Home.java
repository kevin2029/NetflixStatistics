package GUI.Basis;

import DatabaseConnectie.Connection;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

public class Home extends Application {

    // verander de knoppen borders naar grijs!

    @Override
    public void start(Stage stage) throws Exception {

        //hier wordt de stage klaargemaakt.
        stage.setScene(Home(stage));
        //stage.setFullScreen(true);
        stage.show();
    }

    public Scene Home(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Home = new BorderPane();
        HBox Hbox_Home_Label=new HBox();
        HBox Hbox_Home_Buttons = new HBox();

        //Hier wordt het label aangemaakt.
        Label AlgemeenOfAccount=new Label("Welkom bij Netflix Statistics. Wilt U de statistieken in het algemeen bekijken of wilt U het per account bekijken?");

        //Hier worden de buttons aangemaakt.
        Button Button_Algemeen=new Button("Algemeen");
        Button Button_AccountGericht=new Button("Account");






        //Hier wordt alles aan Borderpane_home toegevoegd.
        Borderpane_Home.setTop(Hbox_Home_Label);
        Borderpane_Home.setCenter(Hbox_Home_Buttons);


        //Hier wordt alles aan Hbox_Home_Label toegevoegd.
        Hbox_Home_Label.getChildren().add(AlgemeenOfAccount);

        //Hier wordt alles aan Hbox_Home_Buttons toegevoegd.
        Hbox_Home_Buttons.getChildren().add(Button_Algemeen);
        Hbox_Home_Buttons.getChildren().add(Button_AccountGericht);






        //Hier wordt Borderpane_home netjes gemaakt.
        Borderpane_Home.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Home_Label netjes gemaakt.
        Hbox_Home_Label.setAlignment(Pos.CENTER);
        AlgemeenOfAccount.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 20");

        //Hier wordt Hbox_Home_Buttons netjes gemaakt.
        Hbox_Home_Buttons.setSpacing(145);
        Button_Algemeen.setPrefSize(350,110);
        Button_AccountGericht.setPrefSize(350,110);
        Hbox_Home_Buttons.setAlignment(Pos.CENTER);
        Button_Algemeen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:40; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_AccountGericht.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:40; -fx-text-fill: Red; -fx-font-weight: bold");





        //Hier krijgt Button_Algemeen functionaliteit.
        Button_Algemeen.setOnAction(actionEvent -> {
            HomeAlgemeen Algemeen=new HomeAlgemeen();
            stage.setScene(Algemeen.HomeAlgemeen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_AccountGericht functionaliteit.
        Button_AccountGericht.setOnAction(actionEvent -> {
            AccountGericht Accounts=new AccountGericht();
            stage.setScene(Accounts.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });




        //Hier wordt scene Home aangemaakt.
        Scene Home=new Scene(Borderpane_Home,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene Home gereturned.
        return Home;
    }
}
