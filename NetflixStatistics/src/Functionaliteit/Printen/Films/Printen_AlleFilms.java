package Functionaliteit.Printen.Films;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;

//Alle Films worden opgehaald, vervolgens in een VBox gedaan en tot slot in een Flowpane.

public class Printen_AlleFilms {

    public static FlowPane AlleFilms(){
        FlowPane AlleFilms=new FlowPane();
        AlleFilms.setAlignment(Pos.TOP_CENTER);
        AlleFilms.setHgap(50);
        AlleFilms.setVgap(50);

        List<Map<String, Object>> result = Connection.RunQuery(
                "SELECT Programma.Titel, Film.Genre, film.Taal,Programma.TijdsduurInMinuten,film.Leeftijdsindicatie,COUNT(ProfielID) AS 'Aantal keer bekeken.'\n" +
                "FROM Programma\n" +
                "JOIN film\n" +
                "ON Programma.ProgrammaID = Film.ProgrammaID\n" +
                "JOIN ProgrammaBekekenDoor\n" +
                "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +
                "GROUP BY Programma.Titel, Film.Genre, film.Taal,Programma.TijdsduurInMinuten,film.Leeftijdsindicatie;"
        );

        for(Map<String, Object>  films : result){
            VBox film=new VBox();
            film.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            films.forEach((column, value) -> {
                film.getChildren().add(new Label(column + ": " + value));
            });
            AlleFilms.getChildren().add(film);
        }
        return AlleFilms;
    }


}
