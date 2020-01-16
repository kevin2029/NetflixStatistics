package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;

import java.util.List;
import java.util.Map;

public class Printen_AlleAccounts {
    List<Map<String, Object>> result = Connection.executeQuery( "SELECT * FROM Accounts;");
}
