package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Printen_AccountMetMeerDan1ProfielVboxEnFlowPaneKomenOverEenMetDeDataset {

    @Test
    void accountsMetMeerDan1Profiel() {
        //Arrange
        List<Map<String, Object>> verwachtResultaat = Connection.RunQuery(
                "SELECT Account.AccountID,Naam \n" +
                        "FROM Account \n" +
                        "JOIN Profiel \n" +
                        "ON Account.AccountID = Profiel.AccountID \n" +
                        "GROUP BY Account.AccountID,Naam \n" +
                        "HAVING COUNT(Account.AccountID) >1;")
                ;

        //Act
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        FlowPane test = Printen_AccountMetMeerDan1Profiel.AccountsMetMeerDan1Profiel();

        //Assert
        //Voor elke VBox in de FlowPane
        for (int i = 0; i< test.getChildren().size(); i++){
            //Voor elke Label in de Vbox
            for (int j = 0; j< ((VBox)test.getChildren().get(0)).getChildren().size(); j++) {
                Assertions.assertEquals(
                        //Vergelijkt de Value van de Label
                        ((Label)((VBox) test.getChildren().get(i)).getChildren().get(j)).getText(),
                        //Met de Value van de database.
                        verwachtResultaat.get(i).entrySet().toArray()[j].toString().replace("=", ": ")
                );
            }
        }
    }
}