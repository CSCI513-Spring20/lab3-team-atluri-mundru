import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
// Flower bed class implementing shape interface
public class FlowerBed implements Shape{
// List of leaf nodes
    List<Shape> inShape = new ArrayList<Shape>();
    int height;
    int width;
    Point2D topLeft = null;
    Rectangle rect = new Rectangle();
    private Color rectangleColor;
    Point2D origin;

    public FlowerBed(Point2D point, int height, int width){
        this.origin = point;
        this.height = height;
        this.width = width;
        topLeft = point;
        rect.setHeight(height);
        rect.setWidth(width);
        rect.setX(topLeft.getX());
        rect.setY(topLeft.getY());
        rect.setFill(Color.OLIVE);
        rect.setStrokeWidth(5);
        setLineColor(Color.BLACK);
        //setPosition(topLeft);
    }

    public void setLineColor(Color color) {
        rectangleColor = color;
        rect.setStroke(rectangleColor);
    }

    @Override
    public boolean ContainsPoint(Point2D point) {
        // TODO Auto-generated method stub
        boolean inRectangle = (point.getX() >= rect.getX() && point.getX() <= rect.getX()+rect.getWidth()
                && point.getY()>= rect.getY() && point.getY() <= rect.getY()+rect.getHeight());
        return inRectangle;

    }


    // Method for adding child to flower bed
    public void addChild(Shape e){          
        inShape.add(e);
    }
    // Method for removing children from flower bed
    public void removeChild(Shape shape){  
        if(inShape.contains(shape)){
            inShape.remove(shape);
        }
    }

    public void resetChildren(){          
        inShape = new ArrayList<Shape>();
    }


    // Method for returning rectangle
    public Rectangle getRectangle() {          
        // TODO Auto-generated method stub
        return rect;
    }


    // Move method for flowerbed
//@Override
public void move(double X, double Y) {
// TODO Auto-generated method stub
rect.setX(rect.getX()+X);
        rect.setY(rect.getY()+Y);
        for(Shape shape: inShape){
            shape.move(X, Y);

}

}
}
