/*
package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Aflevering {

    public static void Verwijderen(SingleSelectionModel Serie, SingleSelectionModel Seizoen, SingleSelectionModel Aflevering){
        //Hier komt de querie om de aflevering te verwijderen uit de bekeken programmas.
        //Hier komt de querie om de aflevering te verwijderen uit de database.

        List<Map<String, Object>> result = Connection.executeQuery("DELETE FROM Programma\n" +
                "WHERE Programma.naam = '" +Aflevering+"';");


        //moet weg
    }
}
*/