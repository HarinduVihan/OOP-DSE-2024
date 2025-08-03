//AGGRIGATION

public class Aggregation
{
	public static void main(String[]args)
	{
	// create a product
	product p1 = new product(1,"pen","this red");
	
	//Create lineItem and add quantity of the products
	LineItem item1 = new LineItem(1,2,p1);
	}
	
}
class Product //part class
{
	private int id;
	private String name;
	private String description;
	
	public Product (int id, String name, String description)
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}
}

class LineItem //whole class
{ 
	private int id;
	private int quantity;
	private Product P;

	public LineItem(int id, int q, Product p)
	{
		this.id = id;
		this.quantity = q;
		this.p = p;
	}
}



	