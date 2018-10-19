import java.util.Scanner;

class shapes
{
    public double height=10, width=10;

    public void calculateArea()
    {

        System.out.println("\nEnter 2 values: ");
        Scanner s = new Scanner(System.in);
        height = s.nextDouble();
        width = s.nextDouble();
    }

    public void display()
    {

    }
}

class Triangle extends shapes
{
    double area;
    public void calculateArea()
    {
        /*System.out.println("\nEnter 2 values: ");
        Scanner s = new Scanner(System.in);
        height = s.nextDouble();
        width = s.nextDouble();*/
        area = (height * width)/2;

    }

    public void display()
    {
        System.out.println("Area of Triangle is: "+area);
    }
}

class Rectangle extends shapes
{
    double area;
    public void calculateArea()
    {
        /*System.out.println("\nEnter 2 values: ");
        Scanner s = new Scanner(System.in);
        height = s.nextDouble();
        width = s.nextDouble();*/
        area = (height * width);

    }

    public void display()
    {
        System.out.println("Area of Rectangle is: "+area);
    }
}


public class inheritance
{
        public static void main(String[] args)
        {
            Triangle t = new Triangle();
            t.calculateArea();
            t.display();

            Rectangle r = new Rectangle();
            r.calculateArea();
            r.display();
        }

}



	
	
	
