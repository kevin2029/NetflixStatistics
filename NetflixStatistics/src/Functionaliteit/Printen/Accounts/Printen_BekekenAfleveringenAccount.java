package Functionaliteit.Printen.Accounts;

public class Printen_BekekenAfleveringenAccount {
      /* NAAM MOET NAAR DE NAAM VAN HET ACCOUNT VERWEZEN WORDEN
    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Programma.Titel, Profiel.Profielnaam FROM Programma\n" +
            "JOIN Aflevering\n" +
                "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +

            "JOIN ProgrammaBekekenDoor\n" +
                "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +

            "JOIN Profiel\n" +
                "ON ProgrammaBekekenDoor.ProfielID = Profiel.ProfielID\n" +

            "JOIN Account\n" +
                "ON Profiel.AccountID = Account.AccountID\n" +

            "WHERE Account.Naam = '"+ NAAM + "';");

            */


}
