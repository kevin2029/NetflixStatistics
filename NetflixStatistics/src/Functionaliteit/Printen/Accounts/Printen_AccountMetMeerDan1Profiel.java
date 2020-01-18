package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_AccountMetMeerDan1Profiel {

    public static FlowPane AccountsMetMeerDan1Profiel(){
        FlowPane AccountsMetMeerDan1Profiel=new FlowPane();


        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Account.AccountID,Naam \n" +
                        "FROM Account \n" +
                        "JOIN Profiel \n" +
                        "ON Account.AccountID = Profiel.AccountID \n" +
                        "GROUP BY Account.AccountID,Naam \n" +
                        "HAVING COUNT(Account.AccountID) >1; "
        );

        for(Map<String, Object> profiel:result){
            VBox meerprofiel=new VBox();
            //Lambda Expression
            profiel.forEach((column, value) -> {
                meerprofiel.getChildren().add(new Label(column + ": " + value));
            });
            AccountsMetMeerDan1Profiel.getChildren().add(meerprofiel);
        }

        return AccountsMetMeerDan1Profiel;
    }


}
