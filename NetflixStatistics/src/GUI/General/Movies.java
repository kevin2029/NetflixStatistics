package GUI.General;



import GUI.WelcomeScene;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Movies extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        Button movie = new Button("Alle films");
        Button length = new Button("Langste tijdsduur");
        Button age = new Button("Films met leefttijdsindicatie onder 16");
        Button back = new Button("Terug");
        back.setOnAction((event) -> launch(WelcomeScene.class));



        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.getChildren().add(movie);
        hBox.getChildren().add(length);
        hBox.getChildren().add(age);
        hBox.getChildren().add(back);


        hBox.setAlignment(Pos.CENTER);


        borderPane.setTop(hBox);


        Scene scene = new Scene(borderPane, 500,300);

        stage.setTitle("Welkom!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(Movies.class);
    }
}
