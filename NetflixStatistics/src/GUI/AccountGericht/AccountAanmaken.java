package GUI.AccountGericht;

import Functionaliteit.Opslaan.Aanmaken.Opslaan_NieuwAccountAanmaken;
import GUI.Basis.AccountGericht;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountAanmaken {

    public Scene AccountAanmaken(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_AccountAanmaken= new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_Naam= new HBox();
        HBox Hbox_Woonplaats= new HBox();
        HBox Hbox_Adres=new HBox();
        HBox Hbox_buttons=new HBox();
        HBox Hbox_Error=new HBox();

        //Hier worden de Labels aangemaakt.
        Label Label_AccountAanmaken=new Label("Account aanmaken");
        Label Label_Naam=new Label("Wat is uw voor- en achternaam?");
        Label Label_Woonplaats=new Label("Wat is uw woonplaats?");
        Label Label_Adres=new Label("Wat is uw adres?");
        Label Label_Error=new Label("Vul alle vakjes in.");

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Naam=new TextField();
        TextField Textfield_Woonplaats=new TextField();
        TextField Textfield_Adres=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_AccountAanmaken toegevoegd.
        Borderpane_AccountAanmaken.setTop(Hbox_Label);
        Borderpane_AccountAanmaken.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_AccountAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_Naam);
        Vbox_Gegevens.getChildren().add(Hbox_Woonplaats);
        Vbox_Gegevens.getChildren().add(Hbox_Adres);
        Vbox_Gegevens.getChildren().add(Hbox_buttons);

        //Hier wordt alles aan Hbox_Naam toegevoegd.
        Hbox_Naam.getChildren().add(Label_Naam);
        Hbox_Naam.getChildren().add(Textfield_Naam);

        //Hier wordt alles aan Hbox_Woonplaats toegevoegd.
        Hbox_Woonplaats.getChildren().add(Label_Woonplaats);
        Hbox_Woonplaats.getChildren().add(Textfield_Woonplaats);

        //Hier wordt alles aan Hbox_Adres toegevoegd.
        Hbox_Adres.getChildren().add(Label_Adres);
        Hbox_Adres.getChildren().add(Textfield_Adres);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_buttons.getChildren().add(Button_Opslaan);
        Hbox_buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan Hbox_Error toegevoegd.
        Hbox_Error.getChildren().add(Label_Error);





        //Hier wordt Borderpane_AccountAanmaken netjes gemaakt.
        Borderpane_AccountAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_AccountAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

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

        //Hier wordt Hbox_Error netjes gemaakt.
        Label_Error.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_Error.setPrefSize(500,50);
        Label_Error.setAlignment(Pos.CENTER);
        Hbox_Error.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Opslaan zijn functionaliteit.
        Button_Opslaan.setOnAction(actionEvent -> {
            //Hier wordt gekeken of alle vakjes zijn ingevuld. Als dat niet het geval is dan wordt de volgende HBox aan de VBox toegevoegd.
            if(Textfield_Naam.getText().trim().isEmpty() || Textfield_Woonplaats.getText().trim().isEmpty()||Textfield_Adres.getText().trim().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_Error);
            }else{
                //Als de vakjes zijn ingevuld wordt hier de methodcall gedaan om het account toe te voegen in de database.
                Opslaan_NieuwAccountAanmaken.Opslaan(Textfield_Naam.getText().trim(),Textfield_Woonplaats.getText().trim(),Textfield_Adres.getText().trim());

                //Hier gaat men terug naar het scherm Accounts.
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





        //Hier wordt de scene AccountAanmaken aangemaakt.
        Scene AccountAanmaken=new Scene(Borderpane_AccountAanmaken,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene terug gegeven.
        return AccountAanmaken;
    }
}
