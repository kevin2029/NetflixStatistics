package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_AccountMet1Profiel {

    public static FlowPane AccountsMet1Profiel(){
        FlowPane AccountsMet1Profiel=new FlowPane();


        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Account.AccountID,Naam \n" +
                        "FROM Account \n" +
                        "JOIN Profiel \n" +
                        "ON Account.AccountID = Profiel.AccountID \n" +
                        "GROUP BY Account.AccountID,Naam \n" +
                        "HAVING COUNT(Account.AccountID) = '1';"
        );

        for(Map<String, Object> profiel:result){
            VBox eenprofiel=new VBox();
            //Lambda Expression
            profiel.forEach((column, value) -> {
                eenprofiel.getChildren().add(new Label(column + ": " + value));
            });
            AccountsMet1Profiel.getChildren().add(eenprofiel);
        }

        return AccountsMet1Profiel;
    }



}
