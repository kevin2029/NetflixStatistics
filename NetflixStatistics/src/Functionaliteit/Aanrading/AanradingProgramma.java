package Functionaliteit.Aanrading;

import DatabaseConnectie.Connection;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Map;

public class AanradingProgramma {

    public static FlowPane ProgrammaAdvies(){
        FlowPane Aanrading=new FlowPane();
        VBox Advies=new VBox();

        List<Map<String, Object>> result = Connection.executeQuery(
                "SELECT m.Naam, e.Naam as lijktOp\n" +
                        "FROM Serie m\n" +
                        "JOIN Serie e\n" +
                        "ON m.LijktOp= e.SerieID;"
        );

        for(Map<String, Object> advies:result){
            Label programmaAdvies=new Label(advies.toString());
            Advies.getChildren().add(programmaAdvies);
            Aanrading.getChildren().add(Advies);
        }

        return Aanrading;
    }
}
