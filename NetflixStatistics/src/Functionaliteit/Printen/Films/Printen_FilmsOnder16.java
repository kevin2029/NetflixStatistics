package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_FilmsOnder16 {

    public static FlowPane FilmsOnder16(){
        FlowPane AlleFilmsOnder16=new FlowPane();
        //for(FilmOnder16:Database){
        //VBox film=new VBox();
        //Label Titel=new Label(Querrie voor de titel te selecteren);
        //Label Genre=new Label(Querrie voor de genre te selecteren);
        //Label Taal=new Label(querrie voor het taal te selecteren);
        //Label Tijdsduur=new Label(Querrie voor de tijdsduur te selecteren);
        //Label Leeftijdsindicatie=new Label(Querrie voor de leeftijdsindicatie te selecteren);
        //film.getChildren().add(Titel);
        //film.getChildren().add(Genre);
        //film.getChildren().add(Taal);
        //film.getChildren().add(Tijdsduur);
        //film.getChildren().add(Leeftijdsindicatie);
        //AlleFilmsOnder16.getChildren().add(film);
        return AlleFilmsOnder16;
    }

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT  Titel, TijdsduurInMinuten\n" +
                    "FROM Programma\n" +
                    "JOIN film \n" +
                    "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                    "WHERE Leeftijdsindicatie < 16 \n" +
                    "ORDER BY TijdsduurInMinuten DESC;");
}
