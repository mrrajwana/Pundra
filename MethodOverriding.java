 package JavaAsignment;

class Shape {
    void area() { System.out.println("Calculating area of a shape"); }
}

class Circle extends Shape {
    @Override
    void area() { System.out.println("Area of Circle = π * r^2"); } // Overriding method
}

class Rectangle extends Shape {
    @Override
    void area() { System.out.println("Area of Rectangle = length * width"); } // Overriding method
}

class MathUtils {
    double power(int base, int exponent) { return Math.pow(base, exponent); }           
    double power(double base, int exponent) { return Math.pow(base, exponent); }          
    double power(int base, double exponent) { return Math.pow(base, exponent); }       
}

public class Over {
    public static void main(String[] args) {
 
        Shape myShape = new Shape();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();
        myShape.area();     
        myCircle.area();     
        myRectangle.area();  


        MathUtils math = new MathUtils();
        System.out.println(math.power(2, 3));       
        System.out.println(math.power(2.5, 3));      
        System.out.println(math.power(2, 2.5));      
    }
}