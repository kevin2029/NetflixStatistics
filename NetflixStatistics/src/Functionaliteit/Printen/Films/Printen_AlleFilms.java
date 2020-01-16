package Functionaliteit.Printen.Films;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_AlleFilms {

    public static FlowPane AlleFilms(){
        FlowPane AlleFilms=new FlowPane();
        //for(Film:Database){
        //VBox film=new VBox();
        //Label Titel=new Label(Querrie voor de titel te selecteren);
        //Label Genre=new Label(Querrie voor de genre te selecteren);
        //Label Taal=new Label(querrie voor het taal te selecteren);
        //Label Tijdsduur=new Label(Querrie voor de tijdsduur te selecteren);
        //Label Leeftijdsindicatie=new Label(Querrie voor de leeftijdsindicatie te selecteren);
        //film.getChildren().add(Naam);
        //film.getChildren().add(Woonplaats);
        //film.getChildren().add(Adres);
        //film.getChildren().add(Tijdsduur);
        //film.getChildren().add(Leeftijdsindicatie);
        //AlleAccounts.getChildren().add(film);
        return AlleFilms;
    }


    List<Map<String, Object>> result = Connection.executeQuery( "SELECT Programma.Titel\n" +
            "FROM Programma\n" +
            "JOIN film\n" +
            "ON Programma.ProgrammaID = Film.ProgrammaID;");
}
