package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_AlleAccounts {

    public static FlowPane AlleAccounts(){
        FlowPane AlleAccounts=new FlowPane();
        //for(Account:Database){
        //VBox account=new VBox();
        //Label Naam=new Label(Querrie voor de naam te selecteren);
        //Label Woonplaats=new Label(Querrie voor de woonplaats te selecteren);
        //Label Adres=new Label(querrie voor het adres te selecteren);
        //account.getChildren().add(Naam);
        //account.getChildren().add(Woonplaats);
        //account.getChildren().add(Adres);
        //AlleAccounts.getChildren().add(account);
        return AlleAccounts;
    }
}


    //List<Map<String, Object>> result = Connection.executeQuery( "SELECT * FROM Accounts;");

