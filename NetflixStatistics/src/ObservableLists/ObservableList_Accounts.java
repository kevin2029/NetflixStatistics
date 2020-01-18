package ObservableLists;

import DatabaseConnectie.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservableList_Accounts {

    public static ObservableList ObservableList_Accounts(){
        ArrayList id = new ArrayList();

        List<Map<String, Object>> result = Connection.executeQuery("SELECT AccountID\n" +
                "FROM Account");


        for(Map<String, Object> resultaat :result){
            id.add(resultaat);
        }

        ObservableList<Integer> ObservableList_Accounts= FXCollections.observableArrayList(id);


        return  ObservableList_Accounts;
    }



}
