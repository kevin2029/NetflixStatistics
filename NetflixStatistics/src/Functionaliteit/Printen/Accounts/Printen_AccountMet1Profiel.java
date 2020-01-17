package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_AccountMet1Profiel {

    public static FlowPane AccountsMet1Profiel(){
        FlowPane AccountsMet1Profiel=new FlowPane();
        //for(AccountsMet1Profiel:Database){
        //VBox account=new VBox();
        //Label Naam=new Label(Querrie voor de naam te selecteren);
        //Label Woonplaats=new Label(Querrie voor de woonplaats te selecteren);
        //Label Adres=new Label(querrie voor het adres te selecteren);
        //account.getChildren().add(Naam);
        //account.getChildren().add(Woonplaats);
        //account.getChildren().add(Adres);
        //AlleAccounts.getChildren().add(account);
        return AccountsMet1Profiel;
    }

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Account.AccountID,Naam \n" +
            "FROM Account \n" +
            "JOIN Profiel \n" +
                "ON Account.AccountID = Profiel.AccountID \n" +
            "GROUP BY Account.AccountID,Naam \n" +
            "HAVING COUNT(Account.AccountID) = '1';"
    );

}
