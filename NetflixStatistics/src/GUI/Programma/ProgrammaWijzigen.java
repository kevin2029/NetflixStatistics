package GUI.Programma;

import Functionaliteit.Opslaan.Aanmaken.Opslaan_ProgrammaToevoegen;
import Functionaliteit.Opslaan.Wijzigen.Opslaan_ProgrammaWijzigen;
import GUI.AccountGericht.AccountGerichtAccount;
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

public class ProgrammaWijzigen {
    public Scene ProgrammaWijzigen(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_ProgrammaWijzigen=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkProfiel=new HBox();
        HBox Hbox_WelkProgramma=new HBox();
        HBox Hbox_Percentage=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();
        HBox Hbox_ErrorVakjes=new HBox();
        HBox Hbox_ErrorInteger=new HBox();
        HBox Hbox_ErrorPercentage=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_ProgrammaWijzigen=new Label("Programma wijzigen");
        Label Label_WelkProfiel=new Label("Op welk profiel wilt U een programma wijzigen?");
        Label Label_WelkProgramma=new Label("Welk programma wilt U wijzigen?");
        Label Label_NieuwPercentage=new Label("Geef het nieuwe bekeken percentage");
        Label Label_ErrorKies=new Label("Kies eerst een account, profiel en programma");
        Label Label_ErrorVakjes=new Label("Vul alle vakjes in");
        Label Label_ErrorInteger=new Label("Percentage moet een getal zijn");
        Label Label_ErrorPercentage=new Label("Het nieuwe percentage mag niet groter dan 100 zijn");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkProfiel=new ComboBox();//Hier staan alle profielen.
        ComboBox Combobox_WelkProgramma=new ComboBox(); //Hier staan alle programmas.

        //Hier wordt het textfield aangemaakt.
        TextField Textfield_Percentage=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_ProgrammaWijzigen toegevoegd.
        Borderpane_ProgrammaWijzigen.setTop(Hbox_Label);
        Borderpane_ProgrammaWijzigen.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_ProgrammaWijzigen);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkProfiel);
        Vbox_Gegevens.getChildren().add(Hbox_WelkProgramma);
        Vbox_Gegevens.getChildren().add(Hbox_Percentage);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkProfiel toegevoegd.
        Hbox_WelkProfiel.getChildren().add(Label_WelkProfiel);
        Hbox_WelkProfiel.getChildren().add(Combobox_WelkProfiel);

        //Hier wordt alles aan Hbox_WelkProgramma toegevoegd.
        Hbox_WelkProgramma.getChildren().add(Label_WelkProgramma);
        Hbox_WelkProgramma.getChildren().add(Combobox_WelkProgramma);

        //Hier wordt alles aan Hbox_Percentage toegevoegd.
        Hbox_Percentage.getChildren().add(Label_NieuwPercentage);
        Hbox_Percentage.getChildren().add(Textfield_Percentage);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);

        //Hier wordt alles aan Hbox_ErrorVakjes toegevoegd.
        Hbox_ErrorVakjes.getChildren().add(Label_ErrorVakjes);

        //Hier wordt alles aan Hbox_ErrorInteger toegevoegd.
        Hbox_ErrorInteger.getChildren().add(Label_ErrorInteger);

        //Hier wordt alles aan Hbox_ErrorPercentage toegevoegd.
        Hbox_ErrorPercentage.getChildren().add(Label_ErrorPercentage);





        //Hier wordt Borderpane_ProgrammaWijzigen netjes gemaakt.
        Borderpane_ProgrammaWijzigen.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_ProgrammaWijzigen.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkProfiel netjes gemaakt.
        Label_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkProfiel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProfiel.setAlignment(Pos.CENTER);
        Hbox_WelkProfiel.setSpacing(100);
        Label_WelkProfiel.setPrefSize(500,50);
        Combobox_WelkProfiel.setPrefSize(500,50);

        //Hier wordt Hbox_WelkProgramma netjes gemaakt.
        Label_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkProgramma.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkProgramma.setAlignment(Pos.CENTER);
        Hbox_WelkProgramma.setSpacing(100);
        Label_WelkProgramma.setPrefSize(500,50);
        Combobox_WelkProgramma.setPrefSize(500,50);

        //Hier wordt Hbox_Percentage netjes gemaakt.
        Label_NieuwPercentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Percentage.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Percentage.setAlignment(Pos.CENTER);
        Hbox_Percentage.setSpacing(100);
        Label_NieuwPercentage.setPrefSize(500,50);
        Textfield_Percentage.setPrefSize(500,50);

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Button_Opslaan.setStyle("-fx-background-color: Green; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Annuleren.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30");
        Button_Opslaan.setPrefSize(200,50);
        Button_Annuleren.setPrefSize(200,50);
        Hbox_Buttons.setAlignment(Pos.CENTER);
        Hbox_Buttons.setSpacing(100);

        //Hier wordt Hbox_ErrorKies netjes gemaakt.
        Label_ErrorKies.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorKies.setPrefSize(1000,50);
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

        //Hier wordt Hbox_ErrorPercentage netjes gemaakt.
        Label_ErrorPercentage.setStyle("-fx-background-color: Red; -fx-text-fill: Black; -fx-font-size: 30; -fx-border-radius: 20 20 20 20; -fx-background-radius: 20 20 20 20");
        Label_ErrorPercentage.setPrefSize(1000,50);
        Label_ErrorPercentage.setAlignment(Pos.CENTER);
        Hbox_ErrorPercentage.setAlignment(Pos.CENTER);





        //Hier krijgt Button_Opslaan zijn functionaliteit.
        Button_Opslaan.setOnAction(actionEvent -> {
            //Hier wordt gekeken of het account, profiel en programma geselecteerd zijn.
            if(Combobox_WelkProfiel.getSelectionModel().isEmpty()||Combobox_WelkProgramma.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else {
                //Als we hier zijn is alles geselecteerd dus kan de error weg.
                Vbox_Gegevens.getChildren().remove(Hbox_ErrorKies);

                //Hier kijken we of het vakje is ingevuld.
                if (Textfield_Percentage.getText().trim().isEmpty()) {
                    Vbox_Gegevens.getChildren().add(Hbox_ErrorVakjes);
                } else {

                    //Als we hier zijn, zijn alle vakjes ingevuld dus kan de error weg.
                    Vbox_Gegevens.getChildren().remove(Hbox_ErrorVakjes);

                    try {
                        //Hier wordt gekeken of het percentage ook daadwerkelijk een cijfer is.
                        int Percentage = Integer.parseInt(Textfield_Percentage.getText().trim());

                        if (Percentage > 100) {
                            //Als we hier zijn is het percentage een cijfer dus kan de error weg. Er komt nu een nieuwe error want het percentage kan niet hoger dan 100 zijn.
                            Vbox_Gegevens.getChildren().remove(Hbox_ErrorInteger);
                            Vbox_Gegevens.getChildren().add(Hbox_ErrorPercentage);
                        } else {
                            //Hier zetten we de geselecteerde ID's om in Integers.
                            int ProfielID= Integer.parseInt((String)Combobox_WelkProfiel.getSelectionModel().getSelectedItem());
                            int ProgrammaID=Integer.parseInt((String)Combobox_WelkProgramma.getSelectionModel().getSelectedItem());

                            //Hier komt de methodcall
                            Opslaan_ProgrammaWijzigen.Opslaan(ProfielID,ProgrammaID,Percentage);

                            //Hier gaat men terug naar het scherm AccountProfiel.
                            AccountGerichtAccount Account = new AccountGerichtAccount();
                            stage.setScene(Account.Account(stage));
                            stage.setFullScreen(true);
                        }
                    } catch (NumberFormatException NFE) {
                        //Als het geen nummer was dan wordt de volgende HBox toegevoegd aan de VBox.
                        Vbox_Gegevens.getChildren().add(Hbox_ErrorInteger);
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





        //Hier wordt scene ProgrammaWijzigen aangemaakt.
        Scene ProgrammaWijzigen=new Scene(Borderpane_ProgrammaWijzigen,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt de scene gereturned.
        return ProgrammaWijzigen;
    }
}
