package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_Series {
    List<Map<String, Object>> result = Connection.executeQuery("SELECT Profielnaam, Leeftijd\n" +
            "FROM Profiel;");
}
