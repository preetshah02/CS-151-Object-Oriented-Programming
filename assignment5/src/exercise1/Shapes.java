//package exercise1;

/**
 * @author Preet LNU
 * @version 04-20-2022
 * This class has a private ArrayList attribute that can contain shapes
 */
import java.util.ArrayList;

public class Shapes 
{
    //ArrayList of Shape
    private ArrayList<Shape> shapeList;
    //parameterized constructor
    public Shapes() 
    {
        this.shapeList = new ArrayList<Shape>();
    }
    //getter and setter
    public ArrayList<Shape> getShapeList()
    {
        return shapeList;
    }
    public void setShapeList(ArrayList<Shape> shapeList)
    {
        this.shapeList = shapeList;
    }
    //add a Shape to ArrayList
    public void add(Shape s) 
    {
        shapeList.add(s);
    }
    //remove a Shape from ArrayList
    public void remove(Shape s) 
    {
        shapeList.remove(s);
    }
    //compute all areas and print
    public synchronized void compute()
    {
        //iterate ArrayList
        for(Shape s : shapeList){
            //start thread to call compute
            System.out.println("Area of the shape is: " + s.computeArea());
        }
        System.out.println();
    }
    public Shape max()
    {
        double maxArea = 0;
        Shape maxShape = null;
        // iterate ArrayList
        for (Shape shape : shapeList) 
        {
            // check for shape having max area
            if (shape.computeArea() > maxArea) 
            {
                maxArea = shape.computeArea();
                maxShape = shape;
            }
        }
        return maxShape;
    }
    public Shape min() 
    {
        double minArea = 100000;
        Shape minShape = null;
        // iterate ArrayList
        for (Shape shape : shapeList) 
        {
            // check for shape having min area
            if (shape.computeArea() < minArea) 
            {
                minArea = shape.computeArea();
                minShape = shape;
            }
        }
        return minShape;
    }
}