class Triangle extends Shape{
    private double base;
    private double height;
    private double bh=base*height;
    
    private int side1;
    private int side2;
    private int side3;
    
    public Triangle(int side1, int side2, int side3, double base, double height){//Use to take arguments
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea(){
       double area=bh*0.5;
       int areaint = (int) area;
       //System.out.println("Area of triange"+area);
       return area;
    }
    
    @Override
    double calculatePerimeter(){
        double perimeter = side1+side2+side3;
        int perimeterint = (int) perimeter;
        //System.out.println("Perimeter of triangle"+perimeter);
        return perimeter;
    }
}

