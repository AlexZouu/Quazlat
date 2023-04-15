package Quazlat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Quazlat extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane mainBP = new BorderPane();

        Text mainTopTXT = new Text();
        mainTopTXT.setText("Q U A Z L A T");
        mainTopTXT.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, 60));

        StackPane mainTopSP = new StackPane(mainTopTXT);
        BackgroundFill bgFill = new BackgroundFill(Color.SALMON, CornerRadii.EMPTY, Insets.EMPTY);
        mainTopSP.setBackground(new Background(bgFill));
        mainTopSP.setMinHeight(100);
        mainTopSP.setMaxHeight(100);

        /*
        StackPane mainLeftSP = new StackPane();
        bgFill = new BackgroundFill(Color.INDIANRED, CornerRadii.EMPTY, Insets.EMPTY);
        mainLeftSP.setBackground(new Background(bgFill));
        mainLeftSP.setMinWidth(300);
        mainLeftSP.setMaxWidth(300);

        StackPane mainRightSP = new StackPane();
        mainRightSP.setBackground(new Background(bgFill));
        mainRightSP.setMinWidth(300);
        mainRightSP.setMaxWidth(300);
         */

        StackPane mainCenter = new StackPane();
        bgFill = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        mainCenter.setBackground(new Background(bgFill));

        mainBP.setTop(mainTopSP);
        //mainBP.setLeft(mainLeftSP);
        //mainBP.setRight(mainRightSP);
        mainBP.setCenter(mainCenter);
        stage.setTitle("Quazlat");
        stage.setMaximized(true);
        stage.setMinWidth(640);
        stage.setMinHeight(480);
        stage.setScene(new Scene(mainBP, 640, 480));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
