package GUI.AccountGericht;

import GUI.Basis.AccountGericht;
import GUI.Profiel.ProfielAanmaken;
import GUI.Profiel.ProfielVerwijderen;
import GUI.Profiel.ProfielWijzigen;
import GUI.Programma.ProgrammaToevoegen;
import GUI.Programma.ProgrammaVerwijderenUitBekeken;
import GUI.Programma.ProgrammaWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountGerichtAccount {

    public Scene Account(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_Account=new BorderPane();
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_CRUD=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt
        Label Label_Accountnaam=new Label("Profielen"); //Wat er in het label staat wordt is anders voor elk account. Zo heeft account: Klaas de naam Klaas in het label

        //Hier worden de buttons aangemaakt
        Button Button_ProfielAanmaken=new Button("Profiel aanmaken");
        Button Button_ProfielWijzigen=new Button("Profiel wijzigen");
        Button Button_ProfielVerwijderen=new Button("Profiel verwijderen");
        Button Button_ProgrammaToevoegen=new Button("Programma toevoegen");
        Button Button_ProgrammaWijzigen=new Button("Programma wijzigen");
        Button Button_ProgrammaVerwijderen=new Button("Programma verwijderen");
        Button Button_Terug=new Button("< Terug");







        //Hier wordt alles aan Borderpane_Account toegevoegd.
        Borderpane_Account.setTop(Vbox_LabelEnButtons);

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_CRUD);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_Accountnaam);

        //Hier wordt alles aan Hbox_CRUD toegevoegd.
        Hbox_CRUD.getChildren().add(Button_ProfielAanmaken);
        Hbox_CRUD.getChildren().add(Button_ProfielWijzigen);
        Hbox_CRUD.getChildren().add(Button_ProfielVerwijderen);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_ProgrammaToevoegen);
        Hbox_Buttons.getChildren().add(Button_ProgrammaWijzigen);
        Hbox_Buttons.getChildren().add(Button_ProgrammaVerwijderen);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Account netjes gemaakt.
        Borderpane_Account.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Accountnaam.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_CRUD netjes gemaakt.
        Button_ProfielAanmaken.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProfielWijzigen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProfielVerwijderen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_CRUD.setAlignment(Pos.CENTER);
        Hbox_CRUD.setSpacing(150);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_ProgrammaToevoegen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProgrammaWijzigen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProgrammaVerwijderen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setAlignment(Pos.TOP_RIGHT);
        Hbox_Buttons.setSpacing(200);





        //Hier krijgt Button_ProfielAanmaken zijn functionaliteit.
        Button_ProfielAanmaken.setOnAction(actionEvent -> {
            ProfielAanmaken ProfielAanmaken=new ProfielAanmaken();
            stage.setScene(ProfielAanmaken.ProfielAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProfielWijzigen zijn functionaliteit.
        Button_ProfielWijzigen.setOnAction(actionEvent -> {
            ProfielWijzigen ProfielWijzigen=new ProfielWijzigen();
            stage.setScene(ProfielWijzigen.ProfielWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProfielVerwijderen zijn functionaliteit.
        Button_ProfielVerwijderen.setOnAction(actionEvent -> {
            ProfielVerwijderen ProfielVerwijderen=new ProfielVerwijderen();
            stage.setScene(ProfielVerwijderen.ProfielVerwijderen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProgrammaToevoegen zijn functionaliteit.
        Button_ProgrammaToevoegen.setOnAction(actionEvent -> {
            ProgrammaToevoegen ProgrammaToevoegen=new ProgrammaToevoegen();
            stage.setScene(ProgrammaToevoegen.ProgrammaToevoegen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProgrammaWijzigen zijn functionaliteit.
        Button_ProgrammaWijzigen.setOnAction(actionEvent -> {
            ProgrammaWijzigen ProgrammaWijzigen=new ProgrammaWijzigen();
            stage.setScene(ProgrammaWijzigen.ProgrammaWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_ProgrammaVerwijderen zijn functionaliteit.
        Button_ProgrammaVerwijderen.setOnAction(actionEvent -> {
            ProgrammaVerwijderenUitBekeken ProgrammaVerwijderen=new ProgrammaVerwijderenUitBekeken();
            stage.setScene(ProgrammaVerwijderen.ProgrammaVerwijderenUitBekeken(stage));
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
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene gereturned.
        return Account;
    }
}
