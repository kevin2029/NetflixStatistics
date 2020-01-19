package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Printen_LangsteTijdsduurOnder16VboxenFlowPaneGelijkDataset {

    @Test
    void langsteTijdsduurOnder16() {
        //Arrange
        List<Map<String, Object>> verwachtResultaat = Connection.RunQuery(
                "SELECT TOP 1 Titel,TijdsduurInMinuten,film.Genre,film.Taal,film.Leeftijdsindicatie\n" +
                        "FROM Programma\n" +
                        "JOIN film \n" +
                        "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                        "WHERE Leeftijdsindicatie < 16 \n" +
                        "ORDER BY TijdsduurInMinuten DESC;");

        //Act
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        FlowPane test = Printen_LangsteTijdsduurOnder16.LangsteTijdsduurOnder16();

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