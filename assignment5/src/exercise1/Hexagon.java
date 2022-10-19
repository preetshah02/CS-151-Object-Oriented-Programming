//package exercise1;
/**
 * This class calculates the area of the Hexagon
 * 
 * 
 * @author Preet LNU
 * @version 4-20-2022
 */
public class Hexagon extends Shape{
    //variable side of Hexagon
    private double side;

    //parameterized constructor
    public Hexagon(double side) {
        super();
        this.side = side;
    }
    //getter and setter
    public double getRadius() {
        return side;
    }
    public void setRadius(double side) {
        this.side = side;
    }

    //toString
    @Override
    public String toString() {
        return "Hexagon [side=" + side + "]";
    }
    //method to compute area
    @Override
    public double computeArea() {
        //calculate area
        double area = ((Math.sqrt(3)*3)/2)*side*side;
        return area;
    }
}