package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Account {

    public static void Verwijderen(int Account){
        //Hier komt de querrie om alle bekeken programmas van alle profielen van het account te verwijderen.
        //Hier komt de querrie om alle profielen van het account te verwijderen.
        //Hier komt de querrie om het account uit de database te verwijderen.

        Connection.executeQuery("DELETE FROM Account\n" +
                "WHERE Account. = '" +Account+"';");


    }
}
