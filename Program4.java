public class Program4
{
  public static void main(String[]args)
   {
	Car c1 = new Car();
	c1.setBrand("Honda");
	c1.printBrand();
   }
}

//parent
class Vehicle
{
 // atributes
 protected String brand;
 
//method
 public void printBrand()
  {
	System.out.println("Brand : " + brand);
  }
}
//child
class Car extends Vehicle
{
 // atributes
 private String modelName;

 // method
 public void setBrand(String br)
  {
	brand = br;
  }

  public void printModel()
  {
	System.out.println("Model : " + modelName);
  }
}