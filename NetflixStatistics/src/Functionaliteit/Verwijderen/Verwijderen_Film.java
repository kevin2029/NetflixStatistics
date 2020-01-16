/*
package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Film {

    public static void Verwijderen(SingleSelectionModel Film){
        //Hier komt een querie om de film te verwijderen uit de bekeken programmas van alle profielen
        //Hier komt de querrie om de film te verwijderen uit de database.

        List<Map<String, Object>> result = Connection.executeQuery("DELETE FROM Programma\n" +
                "WHERE Programma.naam = '" +Film+"';");


        //moet weg
    }
}
*/