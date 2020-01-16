package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_FilmsOnder16 {
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT  Titel, TijdsduurInMinuten\n" +
                    "FROM Programma\n" +
                    "JOIN film \n" +
                    "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                    "WHERE Leeftijdsindicatie < 16 \n" +
                    "ORDER BY TijdsduurInMinuten DESC;");
}
