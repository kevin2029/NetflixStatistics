package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_Seizoenen {
    // naam serie en seizoens nmr

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Serie.Naam,Seizoen.Seizoensnummer\n" +
            "FROM Serie\n" +
            "JOIN Seizoen\n" +
            "ON Serie.SerieID = Seizoen.SerieID");
}
