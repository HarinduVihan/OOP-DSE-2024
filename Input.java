import java.util.Scanner;
public class Input
{
	public static void main(String[] args)
	{
	 int length, width,area = 0;
	 Scanner input = new Scanner(System.in);

	 System.out.println("Enter length :");
	 length = input.nextInt();
	 System.out.println("Enter width :");
	 width = input.nextInt();
	
		area = length * width;

		System.out.println("area = " + area);
	}
}