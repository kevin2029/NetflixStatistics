package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class WelcomeScene extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();



        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().add(new Button("Algemeen"));
        hBox.getChildren().add(new Button("Account"));

        hBox.setAlignment(Pos.CENTER);
        borderPane.setCenter(hBox);
        borderPane.setTop(new Label("Welkom bij NetflixStatistics. Wilt u statestieken in het algemeen bekijken of per account?"));



        Scene scene = new Scene(borderPane,500, 50);

        stage.setTitle("Welkom!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(WelcomeScene.class);
    }
}
