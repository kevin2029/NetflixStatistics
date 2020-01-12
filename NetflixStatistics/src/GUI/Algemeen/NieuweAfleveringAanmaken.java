package GUI.Algemeen;

import Functionaliteit.Opslaan.Aanmaken.Opslaan_NieuweAfleveringAanmaken;
import Functionaliteit.Opslaan.Aanmaken.Opslaan_NieuweFilmAanmaken;
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

public class NieuweAfleveringAanmaken {
    public Scene NieuweAfleveringAanmaken(Stage stage){
        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_NieuweAfleveringAanmaken=new BorderPane();
        HBox Hbox_Label=new HBox();
        VBox Vbox_Gegevens=new VBox();
        HBox Hbox_WelkeSerie=new HBox();
        HBox Hbox_WelkSeizoen=new HBox();
        HBox Hbox_Titel=new HBox();
        HBox Hbox_TijdInMinuten=new HBox();
        HBox Hbox_Buttons=new HBox();
        HBox Hbox_ErrorKies=new HBox();
        HBox Hbox_ErrorVakjes=new HBox();
        HBox Hbox_ErrorInteger=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_NieuweAfleveringAanmaken=new Label("Nieuwe aflevering aanmaken");
        Label Label_WelkeSerie=new Label("Van welke serie wilt U het seizoen selecteren?");
        Label Label_WelkSeizoen=new Label("Bij welk seizoen hoort de nieuwe aflevering?");
        Label Label_Titel=new Label("Wat is de titel van de aflevering?");
        Label Label_TijdInMinuten=new Label("Wat is de tijdsduur in minuten?");
        Label Label_ErrorKies=new Label("Kies eerst een serie en een seizoen");
        Label Label_ErrorVakjes=new Label("Vul alle vakjes in");
        Label Label_ErrorInteger=new Label("Tijdsduur moet een getal zijn");

        //Hier worden de comboboxen aangemaakt.
        ComboBox Combobox_WelkeSerie=new ComboBox();//deze bevat alle series. Geef de querie een methode als arraylist en zet die erin.
        ComboBox Combobox_WelkSeizoen=new ComboBox();//Deze bevat alle seizoenen van de geselecteerde serie.

        //Hier worden de textfields aangemaakt
        TextField Textfield_Titel=new TextField();
        TextField Textfield_TijdInMinuten=new TextField();

        //Hier worden de buttons aangemaakt.
        Button Button_Opslaan=new Button("Opslaan");
        Button Button_Annuleren=new Button("Annuleren");





        //Hier wordt alles aan Borderpane_NieuweAfleveringAanmaken toegevoegd.
        Borderpane_NieuweAfleveringAanmaken.setTop(Hbox_Label);
        Borderpane_NieuweAfleveringAanmaken.setCenter(Vbox_Gegevens);

        //Hier wordt alles aan Hbox_Label toegevoegd.
        Hbox_Label.getChildren().add(Label_NieuweAfleveringAanmaken);

        //Hier wordt alles aan Vbox_Gegevens toegevoegd.
        Vbox_Gegevens.getChildren().add(Hbox_WelkeSerie);
        Vbox_Gegevens.getChildren().add(Hbox_WelkSeizoen);
        Vbox_Gegevens.getChildren().add(Hbox_Titel);
        Vbox_Gegevens.getChildren().add(Hbox_TijdInMinuten);
        Vbox_Gegevens.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_WelkeSerie toegevoegd.
        Hbox_WelkeSerie.getChildren().add(Label_WelkeSerie);
        Hbox_WelkeSerie.getChildren().add(Combobox_WelkeSerie);

        //Hier wordt alles aan Hbox_WelkSeizoen toegevoegd.
        Hbox_WelkSeizoen.getChildren().add(Label_WelkSeizoen);
        Hbox_WelkSeizoen.getChildren().add(Combobox_WelkSeizoen);

        //Hier wordt alles aan Hbox_Titel toegevoegd.
        Hbox_Titel.getChildren().add(Label_Titel);
        Hbox_Titel.getChildren().add(Textfield_Titel);

        //Hier wordt alles aan Hbox_TijdInMinuten toegevoegd.
        Hbox_TijdInMinuten.getChildren().add(Label_TijdInMinuten);
        Hbox_TijdInMinuten.getChildren().add(Textfield_TijdInMinuten);

        //Hier wordt alles aan Hbox_Buttons toegevoegd.
        Hbox_Buttons.getChildren().add(Button_Opslaan);
        Hbox_Buttons.getChildren().add(Button_Annuleren);

        //Hier wordt alles aan HBox_ErrorKies toegevoegd.
        Hbox_ErrorKies.getChildren().add(Label_ErrorKies);

        //Hier wordt alles aan Hbox_ErrorVakjes toegevoegd.
        Hbox_ErrorVakjes.getChildren().add(Label_ErrorVakjes);

        //Hier wordt alles aan Hbox_ErrorInteger toegevoegd.
        Hbox_ErrorInteger.getChildren().add(Label_ErrorInteger);





        //Hier wordt Borderpane_NieuweAfleveringAanmaken netjes gemaakt.
        Borderpane_NieuweAfleveringAanmaken.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_NieuweAfleveringAanmaken.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Vbox_Gegevens netjes gemaakt.
        Vbox_Gegevens.setAlignment(Pos.CENTER);
        Vbox_Gegevens.setSpacing(40);

        //Hier wordt Hbox_WelkeSerie netjes gemaakt.
        Label_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkeSerie.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkeSerie.setAlignment(Pos.CENTER);
        Hbox_WelkeSerie.setSpacing(100);
        Label_WelkeSerie.setPrefSize(580,50);
        Combobox_WelkeSerie.setPrefSize(580,50);

        //Hier wordt Hbox_WelkSeizoen netjes gemaakt
        Label_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Combobox_WelkSeizoen.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_WelkSeizoen.setAlignment(Pos.CENTER);
        Hbox_WelkSeizoen.setSpacing(100);
        Label_WelkSeizoen.setPrefSize(580,50);
        Combobox_WelkSeizoen.setPrefSize(580,50);

        //Hier wordt Hbox_Titel netjes gemaakt.
        Label_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_Titel.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_Titel.setAlignment(Pos.CENTER);
        Hbox_Titel.setSpacing(100);
        Label_Titel.setPrefSize(580,50);
        Textfield_Titel.setPrefSize(580,50);

        //Hier wordt Hbox_TijdInMinuten netjes gemaakt.
        Label_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Textfield_TijdInMinuten.setStyle("-fx-background-color: White; -fx-text-fill: Black; -fx-font-size: 20");
        Hbox_TijdInMinuten.setAlignment(Pos.CENTER);
        Hbox_TijdInMinuten.setSpacing(100);
        Label_TijdInMinuten.setPrefSize(580,50);
        Textfield_TijdInMinuten.setPrefSize(580,50);

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
            //Hier wordt gekeken of serie en seizoen zijn geselecteerd.
            if(Combobox_WelkeSerie.getSelectionModel().isEmpty()||Combobox_WelkSeizoen.getSelectionModel().isEmpty()){
                Vbox_Gegevens.getChildren().add(Hbox_ErrorKies);
            }else {
                //Als we hier zijn, zijn serie en seizoen gekozen.
                Vbox_Gegevens.getChildren().remove(Hbox_ErrorKies);

                //Hier wordt gekeken of alle vakjes zijn ingevuld.
                if (Textfield_Titel.getText().trim().isEmpty() || Textfield_TijdInMinuten.getText().trim().isEmpty()) {
                    Vbox_Gegevens.getChildren().add(Hbox_ErrorVakjes);
                } else {

                    //Als we hier zijn, zijn alle vakjes ingevuld dus kan de error weg.
                    Vbox_Gegevens.getChildren().remove(Hbox_ErrorVakjes);

                    try {
                        //Hier wordt gekeken of de tijd in minuten ook daadwerkelijk een cijfer is.
                        int TijdInMinuten = Integer.parseInt(Textfield_TijdInMinuten.getText());

                        //Hier wordt de method call gedaan om de film toe te voegen.
                        Opslaan_NieuweAfleveringAanmaken.Opslaan(Combobox_WelkeSerie.getSelectionModel(), Combobox_WelkSeizoen.getSelectionModel(), Textfield_Titel.getText().trim(), TijdInMinuten);

                        //Hier gaat men terug naar het scherm Afleveringen.
                        Afleveringen Afleveringen = new Afleveringen();
                        stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
                        stage.setFullScreen(true);


                    } catch (NumberFormatException NFE) {
                        //Als het geen nummers waren dan wordt de volgende HBox toegevoegd aan de VBox.
                        Vbox_Gegevens.getChildren().add(Hbox_ErrorInteger);
                    }
                }
            }
        });
        //Hier krijgt Button_Annuleren zijn functionaliteit.
        Button_Annuleren.setOnAction(actionEvent -> {
            Afleveringen Afleveringen=new Afleveringen();
            stage.setScene(Afleveringen.HomeAlgemeenAfleveringen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt scene nieuweAfleveringAanmaken aangemaakt.
        Scene NieuweAfleveringAanmaken=new Scene(Borderpane_NieuweAfleveringAanmaken,1300,650);
        stage.setTitle("Nieuwe aflevering aanmaken");

        //Hier wordt de scene gereturned.
        return NieuweAfleveringAanmaken;
    }
}
