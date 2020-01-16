package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_Afleveringen {

    public static FlowPane AlleAfleveringen(){
        FlowPane AlleAfleveringen=new FlowPane();
        //for(Aflevering:Database){
        //VBox aflevering=new VBox();
        //Label SerieTitel=new Label(Querrie voor de titel van de serie te selecteren);
        //Label Seizoensnummer=new Label(Querrie voor de seizoensnummer te selecteren);
        //Label nummer+naamAflevering=new Label(querrie voor het nummer en de naam van de aflevering te selecteren);
        //Label Tijdsduur=new Label(Querrie voor de tijdsduur te selecteren);
        //aflevering.getChildren().add(SerieTitel);
        //aflevering.getChildren().add(Seizoensnummer);
        //aflevering.getChildren().add(nummer+naamAflevering);
        //aflevering.getChildren().add(Tijdsduur);
        //AlleAfleveringen.getChildren().add(aflevering);
        return AlleAfleveringen;
    }

    // prgromaa serie.naam,seizoen.nummer, afleveringsnummer,naam,tijdsduurinmin

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Serie.Naam,Seizoen.Seizoensnummer,Aflevering.AfleveringNummer,Programma.Titel,Programma.TijdsduurInMinuten\n" +
            "FROM Programma\n" +
            "JOIN Aflevering\n" +
            "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +
            "JOIN Seizoen\n" +
            "ON Aflevering.SeizoenID = Seizoen.SeizoenID\n" +
            "JOIN Serie\n" +
            "ON Seizoen.SerieID = Serie.SerieID;");
}
