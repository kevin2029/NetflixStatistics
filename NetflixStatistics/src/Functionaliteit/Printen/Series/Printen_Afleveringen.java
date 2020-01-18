package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_Afleveringen {

    public static FlowPane AlleAfleveringen(){
        FlowPane AlleAfleveringen=new FlowPane();
        VBox afleveringen=new VBox();


        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten\n" +
                        "FROM Programma\n" +
                        "JOIN Aflevering\n" +
                        "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +
                        "JOIN Seizoen\n" +
                        "ON Aflevering.SeizoenID = Seizoen.SeizoenID\n" +
                        "JOIN Serie\n" +
                        "ON Seizoen.SerieID = Serie.SerieID;");


        for(Map<String, Object> aflevering:result){
            Label alleResult=new Label(aflevering.toString());
            afleveringen.getChildren().add(alleResult);
            AlleAfleveringen.getChildren().add(afleveringen);
        }

        return AlleAfleveringen;
    }




}
