package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_FilmsOnder16 {

    public static FlowPane FilmsOnder16(){
        FlowPane AlleFilmsOnder16=new FlowPane();

        VBox film=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT  Titel,TijdsduurInMinuten,film.Genre,film.Taal,film.Leeftijdsindicatie\n" +
                        "FROM Programma\n" +
                        "JOIN film \n" +
                        "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                        "WHERE Leeftijdsindicatie < 16 \n" +
                        "ORDER BY TijdsduurInMinuten DESC;");


        for(Map<String, Object> films :result){
            Label alleFilms=new Label(films.toString());
            film.getChildren().add(alleFilms);
            AlleFilmsOnder16.getChildren().add(film);
        }

        return AlleFilmsOnder16;
    }
}
