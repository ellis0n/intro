public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of " + c1.getRadius()
                + " and area of " + c1.getArea());
        // Declare an instance of class circle called c2
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of " + c2.getRadius()
                + " and area of " + c2.getArea());


        Circle c3 = new Circle(3.0);
        System.out.println("The circle has radius of " + c3.getRadius()
                + " and area of " + c3.getArea());

        Circle c4 = new Circle(4.0, "blue");
        System.out.println("The circle has radius of " + c4.getRadius()
                + " and area of " + c4.getArea() + " and color of " + c4.getColor());

        // Private access: System.out.println(c1.radius);
        //



    }
}