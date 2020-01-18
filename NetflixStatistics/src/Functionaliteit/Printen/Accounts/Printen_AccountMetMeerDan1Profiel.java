package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_AccountMetMeerDan1Profiel {

    public static FlowPane AccountsMetMeerDan1Profiel(){
        FlowPane AccountsMetMeerDan1Profiel=new FlowPane();

        AccountsMetMeerDan1Profiel.setAlignment(Pos.TOP_CENTER);
        AccountsMetMeerDan1Profiel.setHgap(50);
        AccountsMetMeerDan1Profiel.setVgap(50);


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
            meerprofiel.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            //Lambda Expression
            profiel.forEach((column, value) -> {
                meerprofiel.getChildren().add(new Label(column + ": " + value));
            });
            AccountsMetMeerDan1Profiel.getChildren().add(meerprofiel);
        }

        return AccountsMetMeerDan1Profiel;
    }


}
