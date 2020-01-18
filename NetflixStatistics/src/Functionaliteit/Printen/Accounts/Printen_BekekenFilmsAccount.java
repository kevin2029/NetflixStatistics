package Functionaliteit.Printen.Accounts;

import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_BekekenFilmsAccount {
    public static FlowPane BekekenFilmsAccount(int AccountID){
        FlowPane BekekenFilmsAccount=new FlowPane();

        BekekenFilmsAccount.setAlignment(Pos.TOP_CENTER);
        BekekenFilmsAccount.setHgap(50);
        BekekenFilmsAccount.setVgap(50);

        //naamVbox.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");

        return BekekenFilmsAccount;
    }

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
