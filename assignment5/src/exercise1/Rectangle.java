//package exercise1;
/**
 * This class calculates the area of the Rectangle
 * 
 * 
 * @author Preet LNU
 * @version 4-20-2022
 */
public class Rectangle  extends Shape{

    //variables
    private double height, width;

    //parameterized constructor
    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }


    //getter and setter

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + "]";
    }

    //method to compute area
    @Override
    public double computeArea() {

        //calculate area
        double area = height * width;
        return area;
    }
}