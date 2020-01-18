package Functionaliteit.Verwijderen;

import DatabaseConnectie.Connection;
import javafx.scene.control.SingleSelectionModel;

import java.util.List;
import java.util.Map;

public class Verwijderen_Programma {

    public static void Verwijderen(int Profiel, int Programma){
        //Hier komt de querie om het programma uit de bekeken programmas van Profiel te verwijderen.

        Connection.executeQuery("DELETE FROM ProgrammaBekekenDoor\n" +
                "WHERE ProgrammaBekekenDoor.ProfielID = '" +Profiel+"' AND ProgrammaBekekenDoor.ProgrammaID = '"+Programma+"' ;");
    }
}
