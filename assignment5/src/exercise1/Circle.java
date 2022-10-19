//package exercise1;

public class Circle  extends Shape{
	/**
	 * This class calculates the area of the Circle
	 * 
	 * 
	 * @author Preet LNU
	 * @version 4-20-2022
	 */
    //instance variable
    private double radius;

    //parameterized constructor
    public Circle(double radius) {
        super();
        this.radius = radius;
    }


    //getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    //method to compute area
    @Override
    public double computeArea() {

        //calculate area
        double area = Math.PI*radius*radius;
        
        return area;
        
    }
    
}