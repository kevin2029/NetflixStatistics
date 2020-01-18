/*
package GUI.Profiel;

import GUI.AccountGericht.AccountGerichtAccount;
import GUI.Programma.ProgrammaToevoegen;
import GUI.Programma.ProgrammaVerwijderenUitBekeken;
import GUI.Programma.ProgrammaWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountProfiel {
    public Scene AccountProfiel(Stage stage){

        //Hier worden de grids gemaakt.
        BorderPane Borderpane_AccountProfiel=new BorderPane();
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons= new HBox();
        HBox Hbox_Aanrading=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProgrammasVoorProfiel=new Label("Bekeken programmas voor dit profiel");
        Label Label_Aanrading=new Label("Omdat je ... hebt bekeken raden we je ... ook aan!"); //... wordt vervangen door programma namen.

        //Hier worden de buttons aangemaakt.
        Button Button_ProgrammaToevoegen=new Button("Programma toevoegen");
        Button Button_ProgrammaWijzigen=new Button("Programma wijzigen");
        Button Button_ProgrammaVerwijderen=new Button("Programma verwijderen");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_AccountProfiel toegevoegd.
        Borderpane_AccountProfiel.setTop(Vbox_LabelEnButtons);

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Aanrading);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProgrammasVoorProfiel);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_ProgrammaToevoegen);
        Hbox_Buttons.getChildren().add(Button_ProgrammaWijzigen);
        Hbox_Buttons.getChildren().add(Button_ProgrammaVerwijderen);
        Hbox_Buttons.getChildren().add(Button_Terug);

        //Hier wordt alles aan Hbox_Aanrading toegevoegd.
        Hbox_Aanrading.getChildren().add(Label_Aanrading);





        //Hier wordt Borderpane_AccountProfiel netjes gemaakt.
        Borderpane_AccountProfiel.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProgrammasVoorProfiel.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_ProgrammaToevoegen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProgrammaWijzigen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_ProgrammaVerwijderen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(200);

        //Hier wordt Hbox_Aanrading netjes gemaakt.
        Label_Aanrading.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 20");
        Hbox_Aanrading.setAlignment(Pos.CENTER);





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
            AccountGerichtAccount Account=new AccountGerichtAccount();
            stage.setScene(Account.Account(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene AccountProfiel aangemaakt.
        Scene AccountProfiel=new Scene(Borderpane_AccountProfiel,1300,650);
        stage.setTitle("Profiel");//Deze naam veranderd in de naam van het profiel.

        //Hier wordt de scene gereturned.
        return AccountProfiel;
    }
}
*/