package Functionaliteit.Printen.Profielen;

import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_AlleProfielen {
    public static FlowPane AlleProfielen(){
        FlowPane Profielen=new FlowPane();

        Profielen.setAlignment(Pos.TOP_CENTER);
        Profielen.setHgap(50);
        Profielen.setVgap(50);

        //naamVbox.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");

        return Profielen;
    }

    List<Map<String, Object>> result = Connection.executeQuery("SELECT Profielnaam, Leeftijd\n" +
            "FROM Profiel;");
}
