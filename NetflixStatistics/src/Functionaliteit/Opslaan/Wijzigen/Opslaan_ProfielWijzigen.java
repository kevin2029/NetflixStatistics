package Functionaliteit.Opslaan.Wijzigen;

import DatabaseConnectie.Connection;

public class Opslaan_ProfielWijzigen {

    public static void Opslaan(int ProfielID, String Naam, int Leeftijd){
        //De querie die het profiel wijzigt aan de database.

        Connection.RunQuery("UPDATE Profiel\n" +
                "SET Profielnaam = '"+Naam+"', Leeftijd = '"+Leeftijd+"'\n" +
                "WHERE ProfielID = "+ProfielID+";");
    }
}
