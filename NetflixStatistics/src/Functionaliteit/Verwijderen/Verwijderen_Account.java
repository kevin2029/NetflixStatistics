package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;

public class Verwijderen_Account {

    public static void Verwijderen(int Account){
        //De querrie om het account uit de database te verwijderen.

        Connection.RunQuery("DELETE FROM Account\n" +
                "WHERE Account.AccountID = '" +Account+"';");


    }
}
