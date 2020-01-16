package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_AccountMet1Profiel {
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Account.AccountID,Naam \n" +
            "FROM Account \n" +
            "JOIN Profiel \n" +
                "ON Account.AccountID = Profiel.AccountID \n" +
            "GROUP BY Account.AccountID,Naam \n" +
            "HAVING COUNT(Account.AccountID) = '1';"
    );

}
