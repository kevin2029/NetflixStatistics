package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_LangsteTijdsduurOnder16 {

    public static FlowPane LangsteTijdsduurOnder16(){
        FlowPane LangstetijdsduurOnder16=new FlowPane();
        //for(Film met langste tijdsduur onder 16:Database){
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
        //LangsteTijdsduurOnder16.getChildren().add(film);
        ////Dus 1 film printen!!!
        return LangstetijdsduurOnder16;
    }

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT TOP 1 Titel, TijdsduurInMinuten\n" +
                    "FROM Programma\n" +
                    "JOIN film \n" +
                    "ON Programma.ProgrammaID = film.ProgrammaID\n" +
                    "WHERE Leeftijdsindicatie < 16 \n" +
                    "ORDER BY TijdsduurInMinuten DESC;");
}
