package Functionaliteit.Printen.Profielen;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_BekekenProgrammasProfiel {


    /* NAAM IS PROFIEL NAAM DIE GEKOZEN IS.
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Programma.Titel, Profiel.Profielnaam \n" +
            "FROM Programma\n" +
            "JOIN ProgrammaBekekenDoor\n" +
            "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +
            "JOIN Profiel\n" +
            "ON ProgrammaBekekenDoor.ProfielID = Profiel.ProfielID\n" +
            "WHERE Profiel.Profielnaam = '" + NAAM +"';");

            */
}
