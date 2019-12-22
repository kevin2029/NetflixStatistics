package GUI.General;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HomeScreenGeneral extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();



        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().add(new Button("Films"));
        hBox.getChildren().add(new Button("Afleveringen"));

        hBox.setAlignment(Pos.CENTER);
        borderPane.setRight(new Button("terug"));
        borderPane.setCenter(hBox);
        borderPane.setTop(new Label("Wilt u de statistieken voor films of afleveringen zien?"));





        Scene scene = new Scene(borderPane);

        stage.setTitle("Welkom!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(HomeScreenGeneral.class);
    }
}
