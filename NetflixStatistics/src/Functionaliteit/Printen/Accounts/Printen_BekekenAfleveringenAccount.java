package Functionaliteit.Printen.Accounts;
import DatabaseConnectie.Connection;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.Map;
//De bekeken afleveringen worden opgehaald voor het meegegeven account, vervolgens in een VBox gedaan en tot slot in een Flowpane.
public class Printen_BekekenAfleveringenAccount {
    public static FlowPane BekekenAfleveringenAccount(int AccountID){
        FlowPane BekekenAfleveringenAccount=new FlowPane();
        BekekenAfleveringenAccount.setAlignment(Pos.TOP_CENTER);
        BekekenAfleveringenAccount.setHgap(25);
        BekekenAfleveringenAccount.setVgap(25);

        List<Map<String, Object>> result = Connection.RunQuery(
                "SELECT Programma.Titel, Profiel.Profielnaam FROM Programma\n" +
                        "JOIN Aflevering\n" +
                        "ON Programma.ProgrammaID = Aflevering.ProgrammaID\n" +

                        "JOIN ProgrammaBekekenDoor\n" +
                        "ON Programma.ProgrammaID = ProgrammaBekekenDoor.ProgrammaID\n" +

                        "JOIN Profiel\n" +
                        "ON ProgrammaBekekenDoor.ProfielID = Profiel.ProfielID\n" +

                        "JOIN Account\n" +
                        "ON Profiel.AccountID = Account.AccountID\n" +

                        "WHERE Account.AccountID = '"+ AccountID + "';");

        for(Map<String, Object>  aflevering : result){
            VBox bekeken = new VBox();
            bekeken.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size: 20");
            aflevering.forEach((column, value) -> {
                bekeken.getChildren().add(new Label(column + ": " + value));
            });
            BekekenAfleveringenAccount.getChildren().add(bekeken);
        }
        return BekekenAfleveringenAccount;
    }
}
