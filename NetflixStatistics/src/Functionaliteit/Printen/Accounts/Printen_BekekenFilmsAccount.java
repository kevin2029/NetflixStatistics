package Functionaliteit.Printen.Accounts;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;
//De bekeken films worden opgehaald voor het meegegeven account, vervolgens in een VBox gedaan en tot slot in een Flowpane.
public class Printen_BekekenFilmsAccount {
    public static FlowPane BekekenFilmsAccount(int AccountID){
        FlowPane BekekenFilmsAccount=new FlowPane();
        BekekenFilmsAccount.setAlignment(Pos.TOP_CENTER);
        BekekenFilmsAccount.setHgap(50);
        BekekenFilmsAccount.setVgap(50);

        List<Map<String, Object>> result = Connection.RunQuery(
                "SELECT Programma.Titel, Profiel.Profielnaam FROM Programma\n" +
                        "JOIN Film\n" +
                        "ON Programma.ProgrammaID = Film.ProgrammaID" +

                        "JOIN ProgrammaBekekenDoor\n" +
                        "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +

                        "JOIN Profiel\n" +
                        "ON ProgrammaBekekenDoor.ProfielID = Profiel.ProfielID\n" +

                        "JOIN Account\n" +
                        "ON Profiel.AccountID = Account.AccountID\n" +

                        "WHERE Account.AccountID = '"+ AccountID + "';");

        for(Map<String, Object>  aflevering : result){
            VBox bekekenFilm = new VBox();
            bekekenFilm.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            aflevering.forEach((column, value) -> {
                bekekenFilm.getChildren().add(new Label(column + ": " + value));
            });
            BekekenFilmsAccount.getChildren().add(bekekenFilm);
        }
        return BekekenFilmsAccount;
    }
}
