//package exercise1;
/**
 * This class implements main(). In the body of the main() method instantiates an object of Shapes.
 * 
 * 
 * @author Preet LNU
 * @version 4-20-2022
 */
public class ShapeTest {

    //main method
    public static void main(String[] args) {
        //create Shapes object
        Shapes shapes = new Shapes();

        //add Shape to Shapes object
        shapes.add(new Triangle(5, 7));
        shapes.add(new Triangle(6, 8));
        shapes.add(new Circle(5));
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(12, 16));
        shapes.add(new Rectangle(4, 9));
        shapes.add(new Hexagon(4));
        shapes.add(new Hexagon(7));


        System.out.println("Shape with max Area: " + shapes.max().toString());
        System.out.println("Shape with min Area: " + shapes.min().toString());
        
      //call compute
        new Thread() {
            public void run() {
                shapes.compute();
            }
        }.start();

        System.out.println("\n");  // empty line between the thread outputs

        new Thread() {
            public void run() {
                shapes.compute();
            }
        }.start();

    }
}