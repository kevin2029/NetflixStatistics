package Functionaliteit.Aanrading;
import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;
//Programma's worden aangeraden.

public class AanradingProgramma {

    public static FlowPane ProgrammaAdvies(String name){
        FlowPane Aanrading=new FlowPane();

        List<Map<String, Object>> result = Connection.RunQuery(
                "SELECT m.Naam, e.Naam as lijktOp\n" +
                        "FROM Serie m\n" +
                        "JOIN Serie e\n" +
                        "ON m.LijktOp= e.SerieID\n" +
                        "WHERE m.Naam = '"+name+"';"
        );

        for(Map<String, Object> adviesVoorProgramma : result){
            VBox Advies=new VBox();
            Advies.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            adviesVoorProgramma.forEach((column, value) -> {
                Advies.getChildren().add(new Label(column + ": " + value));
            });
            Aanrading.getChildren().add(Advies);
        }
        return Aanrading;
    }
}
