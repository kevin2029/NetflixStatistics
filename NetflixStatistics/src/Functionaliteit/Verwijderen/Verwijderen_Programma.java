package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;

public class Verwijderen_Programma {

    public static void Verwijderen(int Profiel, int Programma){
        //De querie om het programma uit de bekeken programmas van Profiel te verwijderen.

        Connection.RunQuery("DELETE FROM ProgrammaBekekenDoor\n" +
                "WHERE ProgrammaBekekenDoor.ProfielID = '" +Profiel+"' AND ProgrammaBekekenDoor.ProgrammaID = '"+Programma+"' ;");
    }
}
