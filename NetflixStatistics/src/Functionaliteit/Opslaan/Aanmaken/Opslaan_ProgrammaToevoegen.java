package Functionaliteit.Opslaan.Aanmaken;

import DatabaseConnectie.Connection;

public class Opslaan_ProgrammaToevoegen {

    public static void Opslaan(int ProfielID, int ProgrammaID, int Percentage){
        //Hier staat de querie die het bekeken programma toevoegt aan de database.

        //programma bekeken toevoegen aan acc.

        Connection.executeQuery("INSERT INTO ProgrammaBekekenDoor(ProgrammaID,ProfielID,PercentageBekeken)\n" +
                "VALUES('"+ProgrammaID+"','"+ProfielID+"','"+Percentage+"');");
    }
}
