package Functionaliteit.Opslaan.Wijzigen;

import DatabaseConnectie.Connection;

public class Opslaan_AccountWijzigen {

    public static void Opslaan(int AccountID, String Naam, String Woonplaats, String Adres){
    //De querrie die het account wijzigt in de database.

        Connection.RunQuery("UPDATE Account\n" +
                "SET Naam = '"+Naam+"', Woonplaats = '"+Woonplaats+"', Adres = '"+Adres+"'\n" +
                "WHERE AccountID = "+AccountID+";");

    }
}
