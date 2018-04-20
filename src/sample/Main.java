package sample;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Paint;

import static javafx.scene.paint.Color.GRAY;


public class Main extends Application {

    @Override// overriding the start method in the application class
    public void start(Stage primaryStage) {
        //making sure the pane cant be resizeable
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        //creating a scene
        Pane pane = new Pane();
        //adding the following classes to the scene

        pane.getChildren().addAll(setImage());
        pane.getChildren().addAll(setArc());
        /* pane.getChildren().addAll(ShowPolygon());*/
        pane.getChildren().addAll(setBackground());
        pane.getChildren().addAll(showEarth());
        pane.getChildren().addAll(setMoon());
        //pane.getChildren().addAll(Trunk());
        pane.getChildren().addAll(lampPost());
        pane.getChildren().addAll(setMoon());
        //pane.getChildren().addAll(TopRoadBound());


        primaryStage.setTitle("Race Track");
        primaryStage.setScene(new Scene(pane, 650, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

    public Rectangle setBackground() {
        //creating a rectangle
        Rectangle r = new Rectangle(0, 230, 680, 700);
        r.setFill(GRAY);
        return r;

    }

    public ImageView setImage() {
        //loading the image
        Image image = new Image("stars5.gif");
        //displays ImageView the image as it is
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(382);
        imageView2.setFitWidth(680);
        return imageView2;
    }


    public Arc setArc() {
        //creating an arc
        Arc arc = new Arc(330, 310, 490, 110, 40, 239); // Create an arc
        //arc.setOpacity(0.8);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);
        arc.setStrokeWidth(3);
        arc.setFill(GRAY); // Set fill color
        arc.setType(ArcType.OPEN); // Set arc type
        return arc;
    }

    public Circle showEarth() {
        Circle earth = new Circle(80, 40, 30, Color.web("gray", 0.5));
        return earth;

    }


    public Circle setMoon() {

        int numMoons = 3;
        double distance = 100;

        Circle moon = null;
        for (int i = 0; i < numMoons; i++) {
            double angle = 2 * i * Math.PI / numMoons;
            double xOffset = distance * Math.cos(angle);
            double yOffset = distance * Math.sin(angle);
            double x = 330 + xOffset;
            double y = 170 + yOffset;
            moon = new Circle(70, 40, 30, Color.web("gray", 0.5));

      /*  Arc a2 = new Arc(330, 170, 490, 110, 40, 239);
        a2.setType(ArcType.OPEN);
        a2.setStroke(Color.RED);
        a2.setFill(Color.RED);
        //a2.setStrokeWidth(3);
        return a2;*/

        }
        return moon;
    }

    public Line Trunk() {
        Line line = new Line(100,10,10,110);
        line.setStroke(Color.rgb(132,84,34));
        line.setStrokeWidth(10);
        line.setSmooth(true);

        return line;
    }
    // Lamp Post
    public Group lampPost() {
        Group lampPost = new Group();
        lampPost.getChildren().addAll(PostofLamp(), resemblingLamp(), resemblingLamp2(), middleOfLampPost(), nearBottomofLampPost(), rayOfLight());
        return lampPost;

    }

    public Rectangle PostofLamp() {
        Rectangle rect1 = new Rectangle();
        rect1.setFill(Color.BLACK);
        rect1.setWidth(10.0f);
        rect1.setHeight(200.0f);
        rect1.setX(500);
        rect1.setY(115);
        return rect1;

    }
    public Rectangle resemblingLamp() {
        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.BLACK);
        rect2.setWidth(50.0f);
        rect2.setHeight(5.0f);
        rect2.setX(480);
        rect2.setY(115);
        return rect2;

    }
    public Rectangle resemblingLamp2() {
        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.BLACK);
        rect3.setWidth(50.0f);
        rect3.setHeight(5.0f);
        rect3.setX(480);
        rect3.setY(120);
        rect3.setRotate(-15.0f);
        return rect3;
    }

    public Rectangle middleOfLampPost() {
        Rectangle rect4 = new Rectangle();
        rect4.setFill(Color.BLACK);
        rect4.setWidth(70.0f);
        rect4.setHeight(7.0f);
        rect4.setX(470);
        rect4.setY(195);
        rect4.setRotate(30.0f);
        return rect4;

    }
    public Rectangle nearBottomofLampPost() {
        Rectangle rect5 = new Rectangle();
        rect5.setFill(Color.BLACK);
        rect5.setWidth(50.0f);
        rect5.setHeight(5.0f);
        rect5.setX(480);
        rect5.setY(245);
        rect5.setRotate(-10.0f);
        return rect5;

    }

    public Polygon rayOfLight(){
        Polygon ray = new Polygon();
        ray.setFill(Color.rgb(240, 224, 85));
        ray.setOpacity(0.4);
        ray.getPoints().addAll(new Double[] {480.0, 115.0,
                440.0, 285.0,
                580.0, 285.0,
                530.0, 115.0});
        return ray;

    }

    public Arc TopRoadBound() {
        Arc arc = new Arc(330, 310, 490, 5, 0, 180); // Create an arc
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.BLACK);
        return arc;
    }
}





   /* public Polygon ShowPolygon() {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();

        final double WIDTH = 100, HEIGHT = 100;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;
        //adds points to the polygon list
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
        }*/
     /*   return polygon;
    }
*/
    /*public Polyline ShowPolyline() {
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 10.0,
                10.0, 20.0 });

        return polyline;
    }*/









