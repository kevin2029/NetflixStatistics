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
        VBox meerprofiel=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Account.AccountID,Naam \n" +
                        "FROM Account \n" +
                        "JOIN Profiel \n" +
                        "ON Account.AccountID = Profiel.AccountID \n" +
                        "GROUP BY Account.AccountID,Naam \n" +
                        "HAVING COUNT(Account.AccountID) = >1; "
        );

        for(Map<String, Object> profiel:result){
            Label metMeerProfiel=new Label(profiel.toString());
            meerprofiel.getChildren().add(metMeerProfiel);
            AccountsMetMeerDan1Profiel.getChildren().add(meerprofiel);
        }

        return AccountsMetMeerDan1Profiel;
    }


}
