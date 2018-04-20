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

import static javafx.scene.paint.Color.*;


public class Main extends Application {

    @Override// overriding the start method in the application class
    public void start(Stage primaryStage) {
        //making sure the pane cant be resizeable
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        //creating a scene
        Pane pane = new Pane();
        //adding the following classes to the scene

        pane.getChildren().addAll(setStarryImage());
        pane.getChildren().addAll(Constellation());
        pane.getChildren().addAll(setBackgroundArc());
        /* pane.getChildren().addAll(ShowPolygon());*/
        pane.getChildren().addAll(setBackground());
        pane.getChildren().addAll(River());
        pane.getChildren().addAll(showEarth());
        pane.getChildren().addAll(setMoon());
        //pane.getChildren().addAll(Trunk());
        pane.getChildren().addAll(setMoon());
        //pane.getChildren().addAll(TopRoadBound());
        //pane.getChildren().addAll(BottomRoadBound());
        pane.getChildren().addAll(Road());
        pane.getChildren().addAll(LaneSeparator());
        pane.getChildren().addAll(lampPost());
        pane.getChildren().addAll(lampPost2());
        pane.getChildren().addAll(Tree1(), Tree2(), Tree3(), Tree4());

        primaryStage.setTitle("Race Track");
        primaryStage.setScene(new Scene(pane, 650, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

    // Sets the background for the scene.
    // Uses: Rectangle.
    public Rectangle setBackground() {
        //creating a rectangle
        Rectangle r = new Rectangle(0, 230, 680, 700);
        r.setFill(DARKOLIVEGREEN);
        return r;

    }

    // Sets the starry image for the scene.
    // Uses: Image and ImageView.
    public ImageView setStarryImage() {
        //loading the image
        Image image = new Image("stars5.gif");
        //displays ImageView the image as it is
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(382);
        imageView2.setFitWidth(680);
        return imageView2;
    }

    // Sets the Arc for the background.
    // Uses: Arc.
    public Arc setBackgroundArc() {
        //creating an arc
        Arc arc = new Arc(330, 310, 490, 110, 40, 239); // Create an arc
        //arc.setOpacity(0.8);
        arc.setStroke(Color.BLACK);
        arc.setStrokeWidth(3);
        arc.setFill(DARKOLIVEGREEN); // Set fill color
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

    // Creates a lamp post on the upper right.
    // Uses: 5 rectangles for the post and layers, and a Polygon
    // for the ray of light coming from the lamp.
    public Group lampPost() {
        Group lampPost = new Group();

        // Post of the lamp
        Rectangle rect1 = new Rectangle();
        rect1.setFill(Color.BLACK);
        rect1.setWidth(10.0f);
        rect1.setHeight(200.0f);
        rect1.setX(500);
        rect1.setY(115);

        // Top layer of the lamp
        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.BLACK);
        rect2.setWidth(50.0f);
        rect2.setHeight(5.0f);
        rect2.setX(480);
        rect2.setY(115);

        // Second layer of the lamp
        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.BLACK);
        rect3.setWidth(50.0f);
        rect3.setHeight(5.0f);
        rect3.setX(480);
        rect3.setY(120);
        rect3.setRotate(-15.0f);

        // Middle of lamp post
        Rectangle rect4 = new Rectangle();
        rect4.setFill(Color.BLACK);
        rect4.setWidth(70.0f);
        rect4.setHeight(7.0f);
        rect4.setX(470);
        rect4.setY(195);
        rect4.setRotate(30.0f);

        // Near bottom of lamp post
        Rectangle rect5 = new Rectangle();
        rect5.setFill(Color.BLACK);
        rect5.setWidth(50.0f);
        rect5.setHeight(5.0f);
        rect5.setX(480);
        rect5.setY(245);
        rect5.setRotate(-10.0f);

        // Ray of light coming from the lamp
        Polygon ray = new Polygon();
        ray.setFill(Color.rgb(240, 224, 85));
        ray.setOpacity(0.4);
        ray.getPoints().addAll(new Double[]{480.0, 115.0,
                440.0, 400.0,
                580.0, 400.0,
                530.0, 115.0});

        lampPost.getChildren().addAll(rect1, rect2, rect3, rect4, rect5, ray);
        return lampPost;
    }

    // Creates a lamp post on the lower left.
    // Uses: 5 rectangles for the post and layers, and a Polygon
    // for the ray of light coming from the lamp.
    public Group lampPost2() {
        Group lampPost = new Group();

        // Post of the lamp
        Rectangle rect1 = new Rectangle();
        rect1.setFill(Color.BLACK);
        rect1.setWidth(10.0f);
        rect1.setHeight(200.0f);
        rect1.setX(500);
        rect1.setY(115);

        // Top layer of the lamp
        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.BLACK);
        rect2.setWidth(50.0f);
        rect2.setHeight(5.0f);
        rect2.setX(480);
        rect2.setY(115);

        // Second layer of the lamp
        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.BLACK);
        rect3.setWidth(50.0f);
        rect3.setHeight(5.0f);
        rect3.setX(480);
        rect3.setY(120);
        rect3.setRotate(-15.0f);

        // Middle of lamp post
        Rectangle rect4 = new Rectangle();
        rect4.setFill(Color.BLACK);
        rect4.setWidth(70.0f);
        rect4.setHeight(7.0f);
        rect4.setX(470);
        rect4.setY(195);
        rect4.setRotate(30.0f);

        // Near bottom of lamp post
        Rectangle rect5 = new Rectangle();
        rect5.setFill(Color.BLACK);
        rect5.setWidth(50.0f);
        rect5.setHeight(5.0f);
        rect5.setX(480);
        rect5.setY(245);
        rect5.setRotate(-10.0f);

        // Ray of light coming from the lamp
        Polygon ray = new Polygon();
        ray.setFill(Color.rgb(240, 224, 85));
        ray.setOpacity(0.4);
        ray.getPoints().addAll(new Double[]{480.0, 115.0,
                440.0, 280.0,
                580.0, 280.0,
                530.0, 115.0});

        lampPost.getChildren().addAll(rect1, rect2, rect3, rect4, rect5, ray);
        lampPost.setTranslateX(-400);
        lampPost.setTranslateY(125);
        return lampPost;
    }

    // Creates a road.
    // Uses: 2 Arcs subtracted to create a curvy road.
    public Shape Road() {
        Arc arc = new Arc(330, 520, 700, 200, 0, 180); // Create an arc
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.SANDYBROWN);
        Arc arc2 = new Arc(330, 620, 700, 200, 0, 180); // Create an arc
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.SANDYBROWN);
        Shape shape = Shape.subtract(arc, arc2);
        shape.setFill(Color.SANDYBROWN);
        return shape;
    }

    // Creates lines that separate the lanes.
    // Uses: 4 Lines
    public Group LaneSeparator() {
        Group separators = new Group();


        Line line = new Line();
        line.setStrokeType(StrokeType.CENTERED);
        line.setStroke(Color.WHITE);
        line.setStrokeWidth(4);
        line.setRotate(-5);
        line.setStartX(50);
        line.setStartY(380);
        line.setEndX(150);
        line.setEndY(380);

        Line line2 = new Line();
        line2.setStrokeType(StrokeType.CENTERED);
        line2.setStroke(Color.WHITE);
        line2.setStrokeWidth(4);
        line2.setRotate(-2);
        line2.setStartX(200);
        line2.setStartY(373);
        line2.setEndX(300);
        line2.setEndY(373);

        Line line3 = new Line();
        line3.setStrokeType(StrokeType.CENTERED);
        line3.setStroke(Color.WHITE);
        line3.setStrokeWidth(4);
        line3.setRotate(2);
        line3.setStartX(400);
        line3.setStartY(373);
        line3.setEndX(500);
        line3.setEndY(373);

        Line line4 = new Line();
        line4.setStrokeType(StrokeType.CENTERED);
        line4.setStroke(Color.WHITE);
        line4.setStrokeWidth(4);
        line4.setRotate(6);
        line4.setStartX(600);
        line4.setStartY(390);
        line4.setEndX(700);
        line4.setEndY(390);

        separators.getChildren().addAll(line, line2, line3, line4);
        return separators;
    }

    // Creates a tree on the bottom left corner.
    // Uses: Rectangle for the base of the tree,
    // and Ellipse for the leaves.
    public Group Tree1() {
        Group tree = new Group();

        Rectangle rect = new Rectangle(); // base of the tree
        rect.setHeight(100);
        rect.setWidth(10);
        rect.setFill(SADDLEBROWN);
        rect.setX(100);
        rect.setY(530);

        Ellipse leaves = new Ellipse(); // leaves of the tree
        leaves.setRadiusX(35);
        leaves.setRadiusY(45);
        leaves.setCenterX(105);
        leaves.setCenterY(500);
        leaves.setFill(FORESTGREEN);

        tree.getChildren().add(rect);
        tree.getChildren().add(leaves);

        return tree;
    }

    // Creates a tree on the bottom right.
    // Uses: Rectangle for the base of the tree,
    // and Ellipse for the leaves.
    public Group Tree2() {
        Group tree = Tree1();

        tree.setTranslateX(400);
        tree.setTranslateY(-30);
        return tree;
    }

    // Creates a tree on the right.
    // Uses: Rectangle for the base of the tree,
    // and Ellipse for the leaves.
    public Group Tree3() {
        Group tree = Tree1();

        tree.setTranslateX(480);
        tree.setTranslateY(-100);
        return tree;
    }

    // Creates a tree near the middle (close to the river).
    // Uses: Rectangle for the base of the tree,
    // and Ellipse for the leaves.
    public Group Tree4() {
        Group tree = Tree1();

        tree.setTranslateX(280);
        tree.setTranslateY(-80);
        return tree;
    }

    // Creates a river.
    // Uses: 2 Arcs and a Shape resulted from subtracting and intersecting.
    public Shape River() {
        // Left bound of river
        Arc arc = new Arc(250, 675, 400, 350, 0, 200); // Create an arc
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.SANDYBROWN);
        arc.setRotate(-90);

        // Right bound of river
        Arc arc2 = new Arc(450, 675, 400, 350, 0, 200); // Create an arc
        arc2.setType(ArcType.OPEN);
        arc2.setFill(Color.SANDYBROWN);
        arc2.setRotate(-90);

        // River-like shape created by subtract arc2 from arc and interesting with the background.
        Shape shape = Shape.subtract(arc, arc2);
        shape = shape.intersect(shape, setBackground());
        shape.setFill(Color.rgb(59, 179, 208));
        shape.setTranslateX(150);
        shape.setTranslateY(-30);

        return shape;
    }

    public Group Constellation() {
        Group constellation = new Group();

        // Bottom part of constellation
        Polyline polyLine = new Polyline();
        polyLine.setStrokeType(StrokeType.CENTERED);
        polyLine.setStrokeWidth(3);
        polyLine.setStroke(Color.WHITE);
        polyLine.getPoints().addAll(new Double[] {200.0, 100.0,
                                                    275.0, 110.0,
                                                    325.0, 90.0,
                                                    400.0, 80.0});

        // Top part of constellation
        Polyline polyLine2 = new Polyline();
        polyLine2.setStrokeType(StrokeType.CENTERED);
        polyLine2.setStrokeWidth(3);
        polyLine2.setStroke(Color.WHITE);
        polyLine2.getPoints().addAll(new Double[] {200.0, 100.0,
                275.0, 60.0,
                325.0, 90.0});

        constellation.getChildren().addAll(polyLine, polyLine2);

        // Add stars to the points of the constellation
        for (int i = 0; i < polyLine.getPoints().size(); i += 2) {
            Circle star = new Circle();
            star.setFill(Color.WHITE);
            star.setRadius(5);
            star.setCenterX(polyLine.getPoints().get(i));
            star.setCenterY(polyLine.getPoints().get(i + 1));
            constellation.getChildren().add(star);
        }

        // The uppermost star on the constellation
        Circle star = new Circle();
        star.setFill(Color.WHITE);
        star.setRadius(5);
        star.setCenterX(275);
        star.setCenterY(60);
        constellation.getChildren().add(star);

        return constellation;
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









