package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import Functionaliteit.Printen.Accounts.Printen_AccountMet1Profiel;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Printen_AlleFilmsVboxenFlowPaneKomtOvereenMetDataset {

    @Test
    void alleFilms() {
        //Arrange
        List<Map<String, Object>> verwachtResultaat = Connection.RunQuery(
                "SELECT Programma.Titel, Film.Genre, film.Taal,Programma.TijdsduurInMinuten,film.Leeftijdsindicatie,COUNT(ProfielID) AS 'Aantal keer bekeken.'\n" +
                        "FROM Programma\n" +
                        "JOIN film\n" +
                        "ON Programma.ProgrammaID = Film.ProgrammaID\n" +
                        "JOIN ProgrammaBekekenDoor\n" +
                        "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +
                        "GROUP BY Programma.Titel, Film.Genre, film.Taal,Programma.TijdsduurInMinuten,film.Leeftijdsindicatie;"
        );

        //Act
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        FlowPane test = Printen_AlleFilms.AlleFilms();

        //Assert
        //Voor elke VBox in de FlowPane
        for (int i = 0; i< test.getChildren().size(); i++){
            //Voor elke Label in de Vbox
            for (int j = 0; j< ((VBox)test.getChildren().get(0)).getChildren().size(); j++) {
                Assertions.assertEquals(
                        //Vergelijkt de Value van de Label
                        ((Label)((VBox) test.getChildren().get(i)).getChildren().get(j)).getText(),
                        //Met de Value van de database.
                        verwachtResultaat.get(i).entrySet().toArray()[j].toString().replace("=", ": ")
                );
            }
        }

    }
}