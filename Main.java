package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Arc;

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


        primaryStage.setTitle("Race Track");
        primaryStage.setScene(new Scene(pane, 650, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

    public Rectangle setBackground() {
        //creating a rectangle
        Rectangle r = new Rectangle(0, 90, 680, 680);
        r.setFill(Color.LIGHTBLUE);
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
        Arc arc = new Arc(330, 170, 490, 110, 40, 239); // Create an arc
        //arc.setOpacity(0.8);
        arc.setStroke(Color.BLACK);
        arc.setFill(null);
        arc.setStrokeWidth(3);
        arc.setFill(Color.LIGHTBLUE); // Set fill color
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









