package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_AlleFilms {

    public static FlowPane AlleFilms(){
        FlowPane AlleFilms=new FlowPane();


        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Programma.Titel, Film.Genre, film.Taal,Programma.TijdsduurInMinuten,film.Leeftijdsindicatie\n" +
                "FROM Programma\n" +
                "JOIN film\n" +
                "ON Programma.ProgrammaID = Film.ProgrammaID;");


        for(Map<String, Object>  films : result){
            VBox film=new VBox();
            //Lambda Expression
            films.forEach((column, value) -> {
                film.getChildren().add(new Label(column + ": " + value));
            });
            AlleFilms.getChildren().add(film);
        }
        return AlleFilms;
    }


}
