package Functionaliteit.Opslaan.Aanmaken;
import DatabaseConnectie.Connection;

public class Opslaan_NieuwAccountAanmaken {

    public static void Opslaan(String Naam, String Woonplaats, String Adres){
        Connection.RunQuery("INSERT INTO Account(Naam,Woonplaats,Adres)\n" +
                "VALUES('"+Naam+"','"+Woonplaats+"','"+Adres+"');");
    }
}
