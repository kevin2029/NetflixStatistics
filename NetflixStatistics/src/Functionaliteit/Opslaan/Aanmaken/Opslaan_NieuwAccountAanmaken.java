package Functionaliteit.Opslaan.Aanmaken;

import DatabaseConnectie.Connection;
import java.util.List;
import java.util.Map;

public class Opslaan_NieuwAccountAanmaken {

    public static void Opslaan(String Naam, String Woonplaats, String Adres){
        Connection.executeQuery("INSERT INTO Account(Naam,Woonplaats,Adres)\n" +
                "VALUES('"+Naam+"','"+Woonplaats+"','"+Adres+"');");
    }
}
