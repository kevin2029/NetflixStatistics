package Functionaliteit.Printen.Accounts;

import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class Printen_BekekenAfleveringenAccount {
    public static FlowPane BekekenAfleveringenAccount(int AccountID){
        FlowPane BekekenAfleveringenAccount=new FlowPane();

        BekekenAfleveringenAccount.setAlignment(Pos.TOP_CENTER);
        BekekenAfleveringenAccount.setHgap(25);
        BekekenAfleveringenAccount.setVgap(25);

        //naamVbox.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 13");

        return BekekenAfleveringenAccount;
    }



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
