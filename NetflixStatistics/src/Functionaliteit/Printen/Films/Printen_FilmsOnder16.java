package Functionaliteit.Printen.Films;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;

//Alle films met leeftijds indicatie van lager dan 16 worden opgehaald, vervolgens in een VBox gedaan en tot slot in een Flowpane.
public class Printen_FilmsOnder16 {

    public static FlowPane FilmsOnder16(){
        FlowPane AlleFilmsOnder16=new FlowPane();
        AlleFilmsOnder16.setAlignment(Pos.TOP_CENTER);
        AlleFilmsOnder16.setHgap(50);
        AlleFilmsOnder16.setVgap(50);

        List<Map<String, Object>> result = Connection.RunQuery(
                "SELECT  Titel,TijdsduurInMinuten,film.Genre,film.Taal,film.Leeftijdsindicatie\n" +
                        "FROM Programma\n" +
                        "JOIN film \n" +
                        "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                        "WHERE Leeftijdsindicatie < 16 \n" +
                        "ORDER BY TijdsduurInMinuten DESC;");

        for(Map<String, Object>  films : result){
            VBox film=new VBox();
            film.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            films.forEach((column, value) -> {
                film.getChildren().add(new Label(column + ": " + value));
            });
            AlleFilmsOnder16.getChildren().add(film);
        }
        return AlleFilmsOnder16;
    }
}
