package Quazlat;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Quazlat extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane mainBP = new BorderPane();

        Label topLBL = new Label();
        topLBL.setText("WELCOME TO QUAZLAT!");
        topLBL.setAlignment(Pos.TOP_CENTER);

        mainBP.setTop(topLBL);
        stage.setTitle("Quazlat");
        stage.setScene(new Scene(mainBP));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
