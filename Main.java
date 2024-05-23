import java.util.Scanner;

public class Main{
    public static void main(String[]args){
    //Enter code to run here
    //Create objects, call methods and print result
    //Circle myCircle = new Circle();
    Scanner radiusin = new Scanner(System.in);
    System.out.println("Enter the radius of the circle ");
    Scanner side1in = new Scanner(System.in);
    System.out.println("Enter the first side of the triangle ");
    Scanner side2in = new Scanner(System.in);
    System.out.println("Enter the second side of the triangle ");    
    Scanner side3in = new Scanner(System.in);
    System.out.println("Enter the third side of the triangle ");
    Scanner basein = new Scanner(System.in);
    System.out.println("Enter the base of the triangle ");
    Scanner heightin = new Scanner(System.in);
    System.out.println("Enter the height of the triangle ");
    
    double radiusobj = radiusin.nextDouble();
    int side1obj = side1in.nextInt();
    int side2obj = side2in.nextInt();
    int side3obj = side2in.nextInt();
    double baseobj = basein.nextDouble();
    double heightobj = heightin.nextDouble();
    
    
    double radius=radiusobj;//Inputs, connect to scanner later
    int side1=side1obj;
    int side2=side1obj;
    int side3=side3obj;
    double base=baseobj;
    double height=heightobj;
    
    //Fix later
    Circle myCircle = new Circle(radius);
    //Circle area = new Circle(radius).calculateArea;
    Triangle myTriangle = new Triangle(side1, side2, side3, base, height);
    //System.out.println("Area of circle"+Circle.calculateArea());
    System.out.println("Radius of circle "+radius);
    System.out.println("Area of circle "+myCircle.calculateArea());
    System.out.println("Perimeter of circle "+myCircle.calculatePerimeter());
    System.out.println("Area of triangle "+myTriangle.calculateArea());
    System.out.println("Perimeter of triangle "+myTriangle.calculatePerimeter());
    System.out.println(" ");
    
    
    
    
    }
}
