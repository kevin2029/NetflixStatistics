package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_BekekenFilmsAccount {
    /* NAAM MOET NAAR DE NAAM VAN HET ACCOUNT VERWEZEN WORDEN
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Programma.Titel, Profiel.Profielnaam FROM Programma\n" +
            "JOIN Film\n" +
	               "ON Programma.ProgrammaID = Film.ProgrammaID" +

            "JOIN ProgrammaBekekenDoor\n" +
                "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +

            "JOIN Profiel\n" +
                "ON ProgrammaBekekenDoor.ProfielID = Profiel.ProfielID\n" +

            "JOIN Account\n" +
                "ON Profiel.AccountID = Account.AccountID\n" +

            "WHERE Account.Naam = '"+ NAAM + "';");

            */

}
