package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;

public class Verwijderen_Profiel {

    public static void Verwijderen(int Profiel){
        //De querrie om het profiel te verwijderen uit de database.

        Connection.RunQuery("DELETE FROM Profiel\n" +
                "WHERE Profiel.ProfielID = '" +Profiel+"';");
    }
}
