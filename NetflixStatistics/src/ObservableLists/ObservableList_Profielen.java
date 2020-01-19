package ObservableLists;

import DatabaseConnectie.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservableList_Profielen {
    public static ObservableList ObservableList_Profielen(){


        ArrayList id = new ArrayList();

        List<Map<String, Object>> result = Connection.RunQuery("SELECT ProfielID\n" +
                "FROM Profiel");


        for(Map<String, Object> resultaat :result){
            id.add(resultaat);
        }

        ObservableList<Integer> ObservableList_Profielen= FXCollections.observableArrayList(id);


        return  ObservableList_Profielen;
    }
}
