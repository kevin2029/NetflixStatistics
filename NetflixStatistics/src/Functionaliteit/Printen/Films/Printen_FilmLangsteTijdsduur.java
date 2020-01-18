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

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT TOP 1 Titel,TijdsduurInMinuten,film.Genre,film.Taal,film.Leeftijdsindicatie\n" +
                        "FROM Programma\n" +
                        "JOIN film\n" +
                        "ON Programma.ProgrammaID = Film.ProgrammaID\n" +
                        "ORDER BY TijdsduurInMinuten DESC;");

        for(Map<String, Object>  films : result){
            VBox film=new VBox();
            //Lambda Expression
            films.forEach((column, value) -> {
                film.getChildren().add(new Label(column + ": " + value));
            });
            Langstetijdsduur.getChildren().add(film);
        }

        return Langstetijdsduur;
    }



}
