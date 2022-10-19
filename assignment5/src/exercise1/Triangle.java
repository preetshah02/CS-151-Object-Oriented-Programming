//package exercise1;
/**
 * This class calculates the area of the triangle
 * 
 * 
 * @author Preet LNU
 * @version 4-20-2022
 */
public class Triangle extends Shape{

    //variables
    private double height, width;

    //parameterized constructor
    public Triangle(double height, double width) {
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
        return "Triangle [height=" + height + ", width=" + width + "]";
    }

    //method to compute area
    @Override
    public double computeArea() {

        //calculate area
        double area = 0.5*height*width;
        return area;
    }
}