import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower implements Shape{
    Circle circle = new Circle();
   
    boolean moving;
    Point2D c;
    Point2D o;
    public Flower(Point2D point, Color color,boolean bool){
        o = point;
        c = point;
        this.moving=bool;
       
        circle.setCenterX(point.getX());
circle.setCenterY(point.getY());
circle.setRadius(10);
        circle.setFill(color);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(1);
        //setPosition(point);
    }

    @Override
    public boolean ContainsPoint(Point2D point) {   //See if the clicked point is within the circle
        // TODO Auto-generated method stub
        return circle.contains(point);
    }
    // Method used to fill color for circle
    public void setFill(Color color){                
        circle.setFill(color);
    }


    // Returns circle
    public Circle getCircle(){
        return circle;
    }
    // Move method implemented based on the drag
    @Override
    public void move(double X, double Y) {  
        // TODO Auto-generated method stub
        circle.setCenterX(circle.getCenterX()+X);
        circle.setCenterY(circle.getCenterY()+Y);
    }




}