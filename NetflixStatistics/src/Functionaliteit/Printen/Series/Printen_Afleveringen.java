package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_Afleveringen {
    // prgromaa serie.naam,seizoen.nummer, afleveringsnummer,naam,tijdsduurinmin

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten\n" +
            "FROM Programma\n" +
            "JOIN Aflevering\n" +
            "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +
            "JOIN Seizoen\n" +
            "ON Aflevering.SeizoenID = Seizoen.SeizoenID\n" +
            "JOIN Serie\n" +
            "ON Seizoen.SerieID = Serie.SerieID;");
}
