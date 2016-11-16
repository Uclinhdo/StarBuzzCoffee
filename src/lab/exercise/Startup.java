package lab.exercise;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        // do output for decorated shapes here...
        Shape circle1 = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle with red border");
        circle.draw();
        circle1.draw();
        
        Shape rectangle1 = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle with red border");
        rectangle.draw();
        rectangle1.draw();
    }
}
