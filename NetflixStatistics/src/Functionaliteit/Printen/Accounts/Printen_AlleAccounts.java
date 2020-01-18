package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Printen_AlleAccounts {

    public static FlowPane AlleAccounts(){
        FlowPane AlleAccounts=new FlowPane();

        List<Map<String, Object>> accounts = Connection.executeQuery( "SELECT * FROM Account;");

        for(Map<String, Object>  account : accounts){
            VBox row = new VBox();
            //Lambda Expression
            account.forEach((column, value) -> {
                row.getChildren().add(new Label(column + ": " + value));
            });
            AlleAccounts.getChildren().add(row);
        }
        return AlleAccounts;
    }
}


