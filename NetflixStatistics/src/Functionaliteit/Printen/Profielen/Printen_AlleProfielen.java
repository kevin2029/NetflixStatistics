package Functionaliteit.Printen.Profielen;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;

//Alle Profilen worden opgehaald, vervolgens in een VBox gedaan en tot slot in een Flowpane.
public class Printen_AlleProfielen {

    public static FlowPane AlleProfielen(){
        FlowPane Profielen=new FlowPane();

        Profielen.setAlignment(Pos.TOP_CENTER);
        Profielen.setHgap(50);
        Profielen.setVgap(50);

        List<Map<String, Object>> result = Connection.RunQuery("SELECT Profielnaam, Leeftijd\n" +
                "FROM Profiel;");

        for(Map<String, Object>  profiel : result){
            VBox row = new VBox();
            row.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            profiel.forEach((column, value) -> {
                row.getChildren().add(new Label(column + ": " + value));
            });
            Profielen.getChildren().add(row);
        }

        return Profielen;
    }


}
