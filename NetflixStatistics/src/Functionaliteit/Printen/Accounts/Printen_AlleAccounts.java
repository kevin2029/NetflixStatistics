package Functionaliteit.Printen.Accounts;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;

//Alle accounts worden opgehaald, vervolgens in een VBox gedaan en tot slot in een Flowpane.
public class Printen_AlleAccounts {

    public static FlowPane AlleAccounts(){
        FlowPane AlleAccounts=new FlowPane();
        AlleAccounts.setAlignment(Pos.TOP_CENTER);
        AlleAccounts.setHgap(50);
        AlleAccounts.setVgap(50);

        List<Map<String, Object>> accounts = Connection.RunQuery( "SELECT * FROM Account;");

        for(Map<String, Object>  account : accounts){
            VBox row = new VBox();
            row.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            account.forEach((column, value) -> {
                row.getChildren().add(new Label(column + ": " + value));
            });
            AlleAccounts.getChildren().add(row);
        }
        return AlleAccounts;
    }
}


