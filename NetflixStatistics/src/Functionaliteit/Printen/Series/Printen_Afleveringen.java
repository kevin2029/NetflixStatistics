package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_Afleveringen {

    public static FlowPane AlleAfleveringen(){
        FlowPane AlleAfleveringen=new FlowPane();

        AlleAfleveringen.setAlignment(Pos.TOP_CENTER);
        AlleAfleveringen.setHgap(25);
        AlleAfleveringen.setVgap(25);

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten\n" +
                        "FROM Programma\n" +
                        "JOIN Aflevering\n" +
                        "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +
                        "JOIN Seizoen\n" +
                        "ON Aflevering.SeizoenID = Seizoen.SeizoenID\n" +
                        "JOIN Serie\n" +
                        "ON Seizoen.SerieID = Serie.SerieID;");


        for(Map<String, Object>  aflevering : result){
            VBox afleveringen=new VBox();
            afleveringen.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 13");
            //Lambda Expression
            aflevering.forEach((column, value) -> {
                afleveringen.getChildren().add(new Label(column + ": " + value));
            });
            AlleAfleveringen.getChildren().add(afleveringen);
        }

        return AlleAfleveringen;
    }




}
