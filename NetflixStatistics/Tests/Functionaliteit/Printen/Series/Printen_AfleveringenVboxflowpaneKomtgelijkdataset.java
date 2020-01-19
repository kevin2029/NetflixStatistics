package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import Functionaliteit.Printen.Profielen.Printen_AlleProfielen;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Printen_AfleveringenVboxflowpaneKomtgelijkdataset {

    @Test
    void alleAfleveringen() {

        //Arrange
        List<Map<String, Object>> verwachtResultaat = Connection.RunQuery(
                "SELECT Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten,AVG(PercentageBekeken) AS 'Iedereen Gem tijdsduurbekeken. '\n" +
                        "FROM Programma\n" +
                        "JOIN Aflevering\n" +
                        "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +
                        "JOIN Seizoen\n" +
                        "ON Aflevering.SeizoenID = Seizoen.SeizoenID\n" +
                        "JOIN Serie\n" +
                        "ON Seizoen.SerieID = Serie.SerieID\n" +
                        "JOIN ProgrammaBekekenDoor\n" +
                        "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +
                        "group by Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten;");

        //Act
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        FlowPane test = Printen_Afleveringen.AlleAfleveringen();

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