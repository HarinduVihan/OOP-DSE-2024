import java.util.Scanner;
public class OddEvenCount
{
 public static void main(String[]args)
  {
    int temp;
    int oddCount = 0;
    int evenCount = 0;
    Scanner input = new Scanner(System.in);

    for(int i=1;i<=10;i++)
     {
	System.out.println(i+". Enter a number");
	temp = input.nextInt();

	if(temp % 2 == 1)
	{
	  oddCount ++;
	}
	
	else
	{
	  evenCount ++;
	}
      }
  
     System.out.println("Even :" + evenCount);
     System.out.println("Odd :" + oddCount);
   }
}