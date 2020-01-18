package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_Series {

    public static FlowPane AlleSeries(){
        FlowPane AlleSeries=new FlowPane();
        VBox Series=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Naam,Genre,Taal,Leeftijdsindicatie\n" +
                "FROM Serie;");


        for(Map<String, Object> series :result){
            Label alleSeries=new Label(series.toString());
            Series.getChildren().add(alleSeries);
            AlleSeries.getChildren().add(Series);
        }

        return AlleSeries;
    }
}
