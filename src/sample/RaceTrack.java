
package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 *
 * @author renel.desir001
 */
public class RaceTrack extends Application {

    private final double WINDOW_HEIGHT = 450.0;
    private final double WINDOW_WIDTH = 700.0;

    @Override
    public void start(Stage primaryStage) {
        // Blue sky background
        Rectangle background = new Rectangle();
        background.setWidth(800);
        background.setHeight(550);
        background.setFill(Color.rgb(12, 91, 157));

        // Horizon Arc
        Arc horizon = new Arc();
        horizon.setFill(Color.BLACK);
        horizon.setRadiusX(WINDOW_WIDTH/2.0);
        horizon.setRadiusY(1);
        horizon.setCenterX(WINDOW_WIDTH/2.0);
        horizon.setCenterY(100.0f);
        horizon.setStartAngle(0.0f);
        horizon.setLength(180.0f);
        horizon.setType(ArcType.OPEN);

        // Ground
        Arc ground = new Arc();
        ground.setFill(Color.rgb(177, 172, 168));
        ground.setStroke(Color.BLACK);
        ground.setStrokeType(StrokeType.OUTSIDE);
        ground.setStrokeWidth(2.0);
        ground.setCenterX(350.0f);
        ground.setCenterY(600.0f);
        ground.setLength(180.0f);
        ground.setType(ArcType.ROUND);
        ground.setRadiusX(850);
        ground.setRadiusY(525);


        // Lamp Post
        Group lampPost = new Group();

        // Post of the Lamp
        Rectangle rect1 = new Rectangle();
        rect1.setFill(Color.BLACK);
        rect1.setWidth(10.0f);
        rect1.setHeight(200.0f);
        rect1.setX(500);
        rect1.setY(115);

        // One of the rectangles resembling the lamp
        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.BLACK);
        rect2.setWidth(50.0f);
        rect2.setHeight(5.0f);
        rect2.setX(480);
        rect2.setY(115);

        // Another rectangle resembling the lamp
        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.BLACK);
        rect3.setWidth(50.0f);
        rect3.setHeight(5.0f);
        rect3.setX(480);
        rect3.setY(120);
        rect3.setRotate(-15.0f);

        // Rectangle in the middle of lamp post
        Rectangle rect4 = new Rectangle();
        rect4.setFill(Color.BLACK);
        rect4.setWidth(70.0f);
        rect4.setHeight(7.0f);
        rect4.setX(470);
        rect4.setY(195);
        rect4.setRotate(30.0f);

        // Rectangle near the bottom of lamp post
        Rectangle rect5 = new Rectangle();
        rect5.setFill(Color.BLACK);
        rect5.setWidth(50.0f);
        rect5.setHeight(5.0f);
        rect5.setX(480);
        rect5.setY(245);
        rect5.setRotate(-10.0f);

        // Ray of Light
        Polygon ray = new Polygon();
        ray.setFill(Color.rgb(240, 224, 85));
        ray.setOpacity(0.4);
        ray.getPoints().addAll(new Double[] {480.0, 115.0,
                440.0, 285.0,
                580.0, 285.0,
                530.0, 115.0});

        lampPost.getChildren().add(rect1);
        lampPost.getChildren().add(rect2);
        lampPost.getChildren().add(rect3);
        lampPost.getChildren().add(rect4);
        lampPost.getChildren().add(rect5);
        lampPost.getChildren().add(ray);

        lampPost.setTranslateY(125);
        Pane root = new Pane();
        root.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        root.getChildren().add(background);
        //root.getChildren().add(horizon);
        root.getChildren().add(ground);
        root.getChildren().add(lampPost);

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setTitle("RaceTrack Scene");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
