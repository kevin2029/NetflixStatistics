package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_FilmLangsteTijdsduur {

    public static FlowPane Langstetijdsduur(){
        FlowPane Langstetijdsduur=new FlowPane();
        VBox film=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT TOP 1 Titel,TijdsduurInMinuten,film.Genre,film.Taal,film.Leeftijdsindicatie\n" +
                        "FROM Programma\n" +
                        "JOIN film\n" +
                        "ON Programma.ProgrammaID = Film.ProgrammaID;");


        for(Map<String, Object> films :result){
            Label alleFilms=new Label(films.toString());
            film.getChildren().add(alleFilms);
            Langstetijdsduur.getChildren().add(film);
        }

        return Langstetijdsduur;
    }



}
