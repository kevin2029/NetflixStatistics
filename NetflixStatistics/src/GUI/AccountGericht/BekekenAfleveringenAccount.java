package GUI.AccountGericht;

import Functionaliteit.Printen.Accounts.Printen_BekekenAfleveringenAccount;
import GUI.Basis.AccountGericht;
import ObservableLists.ObservableList_Accounts;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BekekenAfleveringenAccount {

    public Scene BekekenAfleveringenAccount(Stage stage){

        //Hier worden de grids aangemaakt.
        BorderPane Borderpane_BekekenAfleveringenAccount=new BorderPane();
        VBox Vbox_Top=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Button=new HBox();
        HBox Hbox_Aanrading=new HBox();

        //Hier worden de labels aangemaakt.
        Label Label_BekekenAfleveringenAccount=new Label("Bekeken afleveringen voor dit account");
        Label Label_Aanrading=new Label("Omdat je ... hebt bekeken raden we je ... ook aan!"); //... wordt vervangen door programma namen.


        //Hier wordt de button aangemaakt.
        Button Button_Print=new Button("Print");
        Button Button_Terug=new Button("< Terug");

        //Hier wordt de combobox aangemaakt.
        ComboBox Combobox_Account=new ComboBox(ObservableList_Accounts.ObservableList_Accounts()); //Hier staan alle accountID's.





        //Hier wordt alles aan Borderpane_BekekenAfleveringenAccount toegevoegd.
        Borderpane_BekekenAfleveringenAccount.setTop(Vbox_Top);

        //Hier wordt alles aan Vbox_Top toegevoegd.
        Vbox_Top.getChildren().add(Hbox_Label);
        Vbox_Top.getChildren().add(Hbox_Button);
        Vbox_Top.getChildren().add(Hbox_Aanrading);

        //Hier wordt alles aan Hbox_Label toegvoegd.
        Hbox_Label.getChildren().add(Label_BekekenAfleveringenAccount);

        //Hier wordt alles aan Hbox_Button toegevoegd.
        Hbox_Button.getChildren().add(Button_Print);
        Hbox_Button.getChildren().add(Combobox_Account);
        Hbox_Button.getChildren().add(Button_Terug);

        //Hier wordt alles aan Hbox_Aanrading toegevoegd.
        Hbox_Aanrading.getChildren().add(Label_Aanrading);





        //Hier wordt Borderpane_BekekenAfleveringenAccount netjes gemaakt.
        Borderpane_BekekenAfleveringenAccount.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_BekekenAfleveringenAccount.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Button netjes gemaakt.
        Button_Print.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Combobox_Account.setPromptText("Selecteer een account");
        Combobox_Account.setPrefSize(300,40);
        Combobox_Account.setStyle("-fx-background-color: White; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Button.setAlignment(Pos.TOP_RIGHT);
        Hbox_Button.setSpacing(500);

        //Hier wordt Hbox_Aanrading netjes gemaakt.
        Label_Aanrading.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Aanrading.setAlignment(Pos.CENTER);




        //Hier krijgt Button_Print zijn functionaliteit.
        Button_Print.setOnAction(actionEvent -> {

            //Eerst kijken we of de Combobox is ingevuld.
            if (Combobox_Account.getSelectionModel().isEmpty()) {

            }else{
<<<<<<< HEAD
                //Daarna zetten we het geselecteerde accountID om in een Integer.
                int AccountID= Integer.parseInt((String)Combobox_Account.getSelectionModel().getSelectedItem());
=======
                //Eerst zetten we het geselecteerde accountID om in een int.
                int AccountID= (int)Combobox_Account.getSelectionModel().getSelectedItem();
>>>>>>> 104ae8338d985cf22d4d318818c34486b8ef5a52

                //Hier komt de methodcall om te printen.
                Borderpane_BekekenAfleveringenAccount.setCenter(Printen_BekekenAfleveringenAccount.BekekenAfleveringenAccount(AccountID));

            }
        });

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            AccountGericht AccountGericht=new AccountGericht();
            stage.setScene(AccountGericht.HomeAccountGericht(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt de scene BekekenAfleveringenAccount aangemaakt.
        Scene BekekenAfleveringenAccount=new Scene(Borderpane_BekekenAfleveringenAccount,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //hier wordt de scene terug gegeven.
        return BekekenAfleveringenAccount;
    }
}
