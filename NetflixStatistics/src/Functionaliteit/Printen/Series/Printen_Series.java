package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_Series {

    public static FlowPane AlleSeries(){
        FlowPane AlleSeries=new FlowPane();
        //for(Serie:Database){
        //VBox serie=new VBox();
        //Label Titel=new Label(Querrie voor de naam te selecteren);
        //Label Genre=new Label(Querrie voor de genre te selecteren);
        //Label Taal=new Label(querrie voor het taal te selecteren);
        //Label Leeftijdsindicatie=new Label(Querrie voor de leeftijdsindicatie te selecteren);
        //serie.getChildren().add(Naam);
        //serie.getChildren().add(Genre);
        //serie.getChildren().add(Taal);
        //serie.getChildren().add(Leeftijdsindicatie);
        //AlleSeries.getChildren().add(serie);
        return AlleSeries;
    }

    List<Map<String, Object>> result = Connection.executeQuery("SELECT Naam,Genre,Taal,Leeftijdsindicatie\n" +
            "FROM Serie;");
}
