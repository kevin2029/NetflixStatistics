package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_AlleFilms {
    List<Map<String, Object>> result = Connection.executeQuery( "SELECT Programma.Titel\n" +
            "FROM Programma\n" +
            "JOIN film\n" +
            "ON Programma.ProgrammaID = Film.ProgrammaID;");
}
