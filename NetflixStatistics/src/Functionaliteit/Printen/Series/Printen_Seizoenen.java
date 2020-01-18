package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class Printen_Seizoenen {

    public static FlowPane AlleSeizoenen(){
        FlowPane AlleSeizoenen=new FlowPane();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT Serie.Naam,Seizoen.Seizoensnummer\n" +
                        "FROM Serie\n" +
                        "JOIN Seizoen\n" +
                        "ON Serie.SerieID = Seizoen.SerieID");

        for(Map<String, Object>  seizoen : result){
            VBox Seizoenen=new VBox();
            //Lambda Expression
            seizoen.forEach((column, value) -> {
                Seizoenen.getChildren().add(new Label(column + ": " + value));
            });
            AlleSeizoenen.getChildren().add(Seizoenen);
        }

        return AlleSeizoenen;
    }


}
