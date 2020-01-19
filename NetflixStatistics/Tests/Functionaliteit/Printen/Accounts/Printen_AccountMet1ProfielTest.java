package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javafx.scene.control.Label;
import java.awt.*;
import java.util.List;
import java.util.Map;

class Printen_AccountMet1ProfielTest {

    @Test
    void accountsMet1Profiel() {
        List<Map<String, Object>> verwachtResultaat = Connection.RunQuery(
                "SELECT Account.AccountID,Naam \n" +
                        "FROM Account \n" +
                        "JOIN Profiel \n" +
                        "ON Account.AccountID = Profiel.AccountID \n" +
                        "GROUP BY Account.AccountID,Naam \n" +
                        "HAVING COUNT(Account.AccountID) = '1';")
                ;
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        FlowPane test = Printen_AccountMet1Profiel.AccountsMet1Profiel();

        //For each VBox in the FlowPane
        for (int i = 0; i< test.getChildren().size(); i++){
            //For each label in the VBox
            for (int j = 0; j< ((VBox)test.getChildren().get(0)).getChildren().size(); j++) {
                Assertions.assertEquals(
                        //Compare the text value in the label
                        ((Label)((VBox) test.getChildren().get(i)).getChildren().get(j)).getText(),
                        //With the value in the database
                        verwachtResultaat.get(i).entrySet().toArray()[j].toString().replace("=", ": ")
                );
            }
        }
    }
}