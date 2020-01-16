/*
package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Serie {

    public static void Verwijderen(SingleSelectionModel Serie){
        //Hier komt de querrie om alle afleveringen van alle seizoenen te verwijderen.
        //Hier komt de querrie om alle seizoenen van de serie te verwijderen.
        //Hier komt de querrie om de serie uit de database te verwijderen.


        List<Map<String, Object>> result = Connection.executeQuery("DELETE FROM Serie\n" +
                "WHERE Serie.naam = '" +Serie+"';");


        //moet weg
    }
}
*/