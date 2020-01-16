package Functionaliteit.Printen.Series;

import DatabaseConnectie.Connection;
import javafx.scene.layout.FlowPane;

import java.util.List;
import java.util.Map;

public class Printen_Seizoenen {

    public static FlowPane AlleSeizoenen(){
        FlowPane AlleSeizoenen=new FlowPane();
        //for(Seizoen:Database){
        //VBox seizoen=new VBox();
        //Label TitelSerie=new Label(Querrie voor de titel van de serie te selecteren);
        //Label SeizoensNummer=new Label(Querrie voor de seizoensnummer te selecteren);
        //seizoen.getChildren().add(TitelSerie);
        //seizoen.getChildren().add(Seizoensnummer);
        //AlleSeizoenen.getChildren().add(seizoen);
        return AlleSeizoenen;
    }

    // naam serie en seizoens nmr

    List<Map<String, Object>> result = Connection.executeQuery(
            "SELECT Serie.Naam,Seizoen.Seizoensnummer\n" +
            "FROM Serie\n" +
            "JOIN Seizoen\n" +
            "ON Serie.SerieID = Seizoen.SerieID");
}
