public class Overriding
{ 
  public static void main(String[]args)
   {
	Shape s1 = new Shape();
        Shape c1 = new circle(7);
        Shape r1 = new rectangle(10,5);
	
	s1.calcArea();
	c1.calcArea();
	r1.calcArea(); 
	
   }
}

class Shape
{
  public void calcArea()
  {
    System.out.println("Shape has an Area");
  }
}

class circle extends Shape
{   
   private int radius;
  
   public circle(int r)
  {
   radius = r;
  }

   public void calcArea()
  {
    System.out.println("area of circle" + 3.14* radius* radius);
  }
}

class rectangle extends Shape
{
   private int length;
   private int width;

   public rectangle(int l, int w)
  {
    length = l;
    width = w;

  }

   public void calcArea()
  {
    System.out.println("area of rectangle" + length * width );
  }
}


  