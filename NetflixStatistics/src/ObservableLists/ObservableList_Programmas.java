package ObservableLists;

import DatabaseConnectie.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservableList_Programmas {

    public static ObservableList ObservableList_Programmas(){



        ArrayList id = new ArrayList();

        List<Map<String, Object>> result = Connection.RunQuery("SELECT ProgrammaID\n" +
                "FROM Programma");


        for(Map<String, Object> resultaat :result){
            id.add(resultaat);
        }

        ObservableList<Integer>ObservableList_Programmas= FXCollections.observableArrayList(id);



        return ObservableList_Programmas;
    }
}
