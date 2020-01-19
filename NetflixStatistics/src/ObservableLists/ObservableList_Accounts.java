package ObservableLists;

import DatabaseConnectie.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservableList_Accounts {

    public static ObservableList ObservableList_Accounts(){
        ArrayList id = new ArrayList();

<<<<<<< HEAD

        List<Map<String, Object>> result = Connection.executeQuery("SELECT AccountID\n" +
=======
        List<Map<String, Object>> result = Connection.RunQuery("SELECT AccountID\n" +
>>>>>>> 104ae8338d985cf22d4d318818c34486b8ef5a52
                "FROM Account");


        for(Map<String, Object> resultaat :result){
            id.add(resultaat.get("AccountID"));
        }

        ObservableList<Integer> ObservableList_Accounts= FXCollections.observableArrayList(id);




        return  ObservableList_Accounts;
    }



}
