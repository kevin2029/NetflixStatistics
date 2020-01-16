package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_LangsteTijdsduurOnder16 {
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT TOP 1 Titel, TijdsduurInMinuten\n" +
                    "FROM Programma\n" +
                    "JOIN film \n" +
                    "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                    "WHERE Leeftijdsindicatie < 16 \n" +
                    "ORDER BY TijdsduurInMinuten DESC;");
}
