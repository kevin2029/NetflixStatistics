package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Programma {

    public static void Verwijderen(int Profiel, int Programma){
        //Hier komt de querie om het programma uit de bekeken programmas van Profiel te verwijderen.

        /*
        List<Map<String, Object>> result = Connection.executeQuery("DELETE FROM ProgrammaBekekenDoor\n" +
                "FROM ProgrammaBekekenDoor\n" +
                "join Profiel\n" +
                "\ton Profiel.ProfielID = ProgrammaBekekenDoor.ProfielID\n" +
                "join Account\n" +
                "\ton Profiel.AccountID = Account.AccountID\n" +
                "\n" +
                "\twhere Profiel.Profielnaam = '' and Account.Naam = '' and ProgrammaBekekenDoor = '';");

                */
    }
}
