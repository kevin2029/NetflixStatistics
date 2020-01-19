package Functionaliteit.Opslaan.Wijzigen;

import DatabaseConnectie.Connection;

public class Opslaan_ProgrammaWijzigen {

    public static void Opslaan(int Profiel, int Programma, int Percentage){

        Connection.RunQuery("UPDATE ProgrammaBekekenDoor\n" +
                "SET PercentageBekeken = "+Percentage+"\n" +
                "WHERE ProgrammaID = "+Programma+" AND ProfielID = "+Profiel+";");

    }
}
