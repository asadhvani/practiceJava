
class Circle extends Shape{
    private double radius;
    public Circle(double radius){//Use to take argument
        this.radius=radius;
    }
    double sqradius=radius*radius;
    double radius2=2*radius;
    
    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    
    @Override
    double calculatePerimeter(){
        double perimeter=Math.PI*radius*2;
        //System.out.println("Perimeter of circle"+perimeter);
        return perimeter;
    }
}
