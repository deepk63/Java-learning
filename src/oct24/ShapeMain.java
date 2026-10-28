package oct24;

public class ShapeMain {

    public static void main(String[] args) {

        Shape shape1 = new Shape();

//        System.out.println("Area of Square = " + shape1.calculateArea(2));
//
//        System.out.println("Area of Rectangle = " + shape1.calculateArea(3, 4));

        shape1.print("Rectangle");
        shape1.print(123);
        shape1.print(12.5);

    }
}
