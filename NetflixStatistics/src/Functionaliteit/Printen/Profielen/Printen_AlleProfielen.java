package Functionaliteit.Printen.Profielen;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_AlleProfielen {
    List<Map<String, Object>> result = Connection.executeQuery("SELECT Profielnaam, Leeftijd\n" +
            "FROM Profiel;");
}
