package Functionaliteit.Opslaan.Aanmaken;

import DatabaseConnectie.Connection;

public class Opslaan_NieuwProfielAanmaken {

    public static void Opslaan(int AccountID, String Naam, int Leeftijd){
        //Hier staat de querie die het nieuwe profiel toevoegt aan de database.
        Connection.executeQuery("INSERT INTO Profiel(Profielnaam,Leeftijd,AccountID)\n" +
                "VALUES('"+Naam+"','"+Leeftijd+"','"+AccountID+"');");


    }
}
