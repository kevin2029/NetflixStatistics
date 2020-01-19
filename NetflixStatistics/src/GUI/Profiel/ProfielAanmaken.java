package GUI.Profiel;

import Functionaliteit.Opslaan.Aanmaken.Opslaan_NieuwProfielAanmaken;
import GUI.AccountGericht.AccountGerichtAccount;
import ObservableLists.ObservableList_Accounts;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfielAanmaken {

    public Scene ProfielAanmaken(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProfielAanmaken=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox VBox_Gegevens=new VBox();
        HBox Hbox_WelkAccount=new HBox();
        HBox Hbox_Naam=new HBox();
        HBox Hbox_Leeftijd=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();
        HBox Hbox_ErrorVakjes=new HBox();
        HBox Hbox_ErrorInteger=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProfielAanmaken=new Label("Profiel aanmaken");
        Label Label_WelkAccount=new Label("Voor welk account wilt U een profiel aanmaken?");
        Label Label_Naam=new Label("Wat is uw voor- en achternaam?");
        Label Label_Leeftijd=new Label("Wat is uw leeftijd?");
        Label Label_ErrorKies=new Label("Kies eerst een account");
        Label Label_ErrorVakjes=new Label("Vul alle vakjes in");
        Label Label_ErrorInteger=new Label("leeftijd moet een getal zijn");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_WelkAccount=new ComboBox(ObservableList_Accounts.ObservableList_Accounts()); //Hier staan alle accountID's.

        //Hier worden de textfields aangemaakt.
        TextField Textfield_Naam=new TextField();
        TextField Textfield_Leeftijd=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProfielAanmaken toegevoegd.
        Borderpane_ProfielAanmaken.setTop(Hbox_Label);
        Borderpane_ProfielAanmaken.setCenter(VBox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProfielAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        VBox_Gegevens.getChildren().add(Hbox_WelkAccount);
        VBox_Gegevens.getChildren().add(Hbox_Naam);
        VBox_Gegevens.getChildren().add(Hbox_Leeftijd);
        VBox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkAccount toegevoegd.
        Hbox_WelkAccount.getChildren().add(Label_WelkAccount);
        Hbox_WelkAccount.getChildren().add(Combobox_WelkAccount);

        //Hier wordt alles aan Hbox_Naam toegevoegd.
        Hbox_Naam.getChildren().add(Label_Naam);
        Hbox_Naam.getChildren().add(Textfield_Naam);

        //Hier wordt alles aan Hbox_Leeftijd toegevoegd.
        Hbox_Leeftijd.getChildren().add(Label_Leeftijd);
        Hbox_Leeftijd.getChildren().add(Textfield_Leeftijd);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);

        //Hier wordt alles aan Hbox_ErrorVakjes toegevoegd.
        Hbox_ErrorVakjes.getChildren().add(Label_ErrorVakjes);

        //Hier wordt alles aan Hbox_ErrorInteger toegevoegd.
        Hbox_ErrorInteger.getChildren().add(Label_ErrorInteger);





        //Hier wordt Borderpane_ProfielAanmaken netjes gemaakt.
        Borderpane_ProfielAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProfielAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        VBox_Gegevens.setAlignment(Pos.CENTER);
        VBox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkAccount netjes gemaakt.
        Label_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkAccount.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkAccount.setAlignment(Pos.CENTER);
        Hbox_WelkAccount.setSpacing(100);
        Label_WelkAccount.setPrefSize(500,50);
        Combobox_WelkAccount.setPrefSize(500,50);

        //Hier wordt Hbox_Naam netjes gemaakt.
        Label_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Naam.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Naam.setAlignment(Pos.CENTER);
        Hbox_Naam.setSpacing(100);
        Label_Naam.setPrefSize(500,50);
        Textfield_Naam.setPrefSize(500,50);

        //Hier wordt Hbox_Leeftijd netjes gemaakt.
        Label_Leeftijd.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Leeftijd.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Leeftijd.setAlignment(Pos.CENTER);
        Hbox_Leeftijd.setSpacing(100);
        Label_Leeftijd.setPrefSize(500,50);
        Textfield_Leeftijd.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(500,50);
        Label_ErrorKies.setAlignment(Pos.CENTER);
        Hbox_ErrorKies.setAlignment(Pos.CENTER);

        //Hier wordt Hbox_ErrorVakjes netjes gemaakt.
        Label_ErrorVakjes.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorVakjes.setPrefSize(500,50);
        Label_ErrorVakjes.setAlignment(Pos.CENTER);
        Hbox_ErrorVakjes.setAlignment(Pos.CENTER);

        //Hier wordt Hbox_ErrorInteger netjes gemaakt.
        Label_ErrorInteger.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorInteger.setPrefSize(500,50);
        Label_ErrorInteger.setAlignment(Pos.CENTER);
        Hbox_ErrorInteger.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Opslaan zijn functionaliteit.
        Button_Opslaan.setOnAction(actionEvent -> {

            //Hier wordt gekeken of een account is geselecteerd.
            if(Combobox_WelkAccount.getSelectionModel().isEmpty()){
                VBox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else {

                //Als we hier zijn is er een account geselecteerd, dus nu kan de error weg.
                VBox_Gegevens.getChildren().remove(Hbox_ErrorKies);

                //Hier kijken we of alle vakjes ingevuld zijn.
                if (Textfield_Naam.getText().trim().isEmpty() || Textfield_Leeftijd.getText().trim().isEmpty()) {
                    VBox_Gegevens.getChildren().add(Hbox_ErrorVakjes);
                } else {

                    //Als we hier zijn, zijn alle vakjes ingevuld dus kan de error weg.
                    VBox_Gegevens.getChildren().remove(Hbox_ErrorVakjes);

                    try {
                        //Hier wordt gekeken of de leeftijd ook daadwerkelijk een cijfer is.
                        int Leeftijd = Integer.parseInt(Textfield_Leeftijd.getText().trim());

                        //Hier wordt het geselecteerde AccountID omgezet in een Integer.
                        int AccountID= (int)Combobox_WelkAccount.getSelectionModel().getSelectedItem();

                        //Hier wordt de method call gedaan om het profiel toe te voegen.
                        Opslaan_NieuwProfielAanmaken.Opslaan(AccountID, Textfield_Naam.getText().trim(), Leeftijd);

                        //Hier gaat men terug naar het scherm Account.
                        AccountGerichtAccount Account = new AccountGerichtAccount();
                        stage.setScene(Account.Account(stage));
                        stage.setFullScreen(true);


                    } catch (NumberFormatException NFE) {
                        //Als het geen nummer was dan wordt de volgende HBox toegevoegd aan de VBox.
                        VBox_Gegevens.getChildren().add(Hbox_ErrorInteger);
                    }
                }
            }
        });

        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            AccountGerichtAccount Account=new AccountGerichtAccount();
            stage.setScene(Account.Account(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene ProfielAanmaken gemaakt.
        Scene ProfielAanmaken=new Scene(Borderpane_ProfielAanmaken,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene terug gegeven.
        return ProfielAanmaken;

    }
}
