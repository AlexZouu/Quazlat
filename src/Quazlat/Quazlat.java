package Quazlat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

    private BorderPane mainBP = new BorderPane();       //Might not need to be global
    private BorderPane menuBP = new BorderPane();
    private BorderPane flashBP = new BorderPane();
    private StackPane mainCenterSP = new StackPane();
    private final Color CYAN = new Color(0.0667, 0.294, 0.373, 1);
    private final Color FOREST = new Color(0.101, 0.576, 0.435, 1);
    private final Color MINT = new Color(0.533, 0.831, 0.596, 1);
    private final Color PASTEL = new Color(0.776, 0.855, 0.749, 1);
    private final Color TAN = new Color(0.953, 0.914, 0.824, 1);
    private final Color BUT = new Color(0.412, 0.788, 0.494, 1);
    private final Background CYANBG = new Background(new BackgroundFill(CYAN, CornerRadii.EMPTY, Insets.EMPTY));
    private final Background FORESTBG = new Background(new BackgroundFill(FOREST, CornerRadii.EMPTY, Insets.EMPTY));
    private final Background MINTBG = new Background(new BackgroundFill(MINT, CornerRadii.EMPTY, Insets.EMPTY));
    private final Background PASTELBG = new Background(new BackgroundFill(PASTEL, CornerRadii.EMPTY, Insets.EMPTY));
    private final Background TANBG = new Background(new BackgroundFill(TAN, CornerRadii.EMPTY, Insets.EMPTY));
    private final Background BUTBG = new Background(new BackgroundFill(BUT, CornerRadii.EMPTY, Insets.EMPTY));

    private void initBP() {
        Text mainTopTXT = new Text();
        mainTopTXT.setText("Q U A Z L A T");
        mainTopTXT.setFont(Font.font("Courier New", FontWeight.EXTRA_BOLD, 60));

        StackPane mainTopSP = new StackPane(mainTopTXT);
        mainTopSP.setBackground(FORESTBG);
        mainTopSP.setMinHeight(100);
        mainTopSP.setMaxHeight(100);

        StackPane mainLeftSP = new StackPane();
        StackPane mainRightSP = new StackPane();
        mainLeftSP.setMinWidth(200);
        mainRightSP.setMinWidth(200);
        mainLeftSP.setBackground(PASTELBG);
        mainRightSP.setBackground(PASTELBG);
        mainBP.setLeft(mainLeftSP);
        mainBP.setRight(mainRightSP);

        mainCenterSP.setBackground(TANBG);

        mainBP.setTop(mainTopSP);


        Text test = new Text();
        test.setText("test");
        flashBP.setCenter(test);
        flashBP.setBackground(TANBG);


        GridPane menuButtonGP = new GridPane();
        Button flashBUT = new Button();
        flashBUT.setOnMouseClicked(event -> {
            flashBUT.setBackground(MINTBG);
            mainCenterSP.getChildren().clear();
            mainCenterSP.getChildren().add(flashBP);
        });
        flashBUT.setOnMouseEntered(event -> {
            flashBUT.setBackground(BUTBG);
        });
        flashBUT.setOnMouseExited(event -> {
            flashBUT.setBackground(MINTBG);
        });
        flashBUT.setText("FLASHCARDS");
        flashBUT.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 30));
        menuButtonGP.add(flashBUT, 0, 0);
        flashBUT.setBackground(MINTBG);
        flashBUT.setBorder(null);
        flashBUT.setMaxSize(300, 100);
        flashBUT.setMinSize(300, 100);
        menuBP.setCenter(menuButtonGP);
        menuBP.setBackground(TANBG);
        menuButtonGP.setAlignment(Pos.CENTER);

        mainCenterSP.getChildren().add(menuBP);
        mainBP.setCenter(mainCenterSP);
    }

    @Override
    public void start(Stage stage) {
        initBP();

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
