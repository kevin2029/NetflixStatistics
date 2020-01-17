package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Profiel {

    public static void Verwijderen(int Profiel){
        //Hier komt de querrie om alle bekeken programmas van Profiel te verwijderen.
        //Hier komt de querrie om het profiel te verwijderen uit de database.

        List<Map<String, Object>> result = Connection.executeQuery("DELETE FROM Profiel\n" +
                "WHERE Profiel.naam = '" +Profiel+"';");
    }
}
