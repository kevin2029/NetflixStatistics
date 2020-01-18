package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_Series {

    public static FlowPane AlleSeries(){
        FlowPane AlleSeries=new FlowPane();

        AlleSeries.setAlignment(Pos.TOP_CENTER);
        AlleSeries.setHgap(50);
        AlleSeries.setVgap(50);

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Naam,Genre,Taal,Leeftijdsindicatie\n" +
                "FROM Serie;");

        for(Map<String, Object>  series : result){
            VBox Series=new VBox();
            Series.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");

            //Lambda Expression
            series.forEach((column, value) -> {
                Series.getChildren().add(new Label(column + ": " + value));
            });
            AlleSeries.getChildren().add(Series);
        }

        return AlleSeries;
    }
}
