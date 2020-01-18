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
        VBox all=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery( "SELECT * FROM Accounts;");

        for(Map<String, Object> Accounts :result){
            Label alleAccount=new Label(Accounts.toString());
            all.getChildren().add(alleAccount);
            AlleAccounts.getChildren().add(all);
        }



        return AlleAccounts;
    }
}


