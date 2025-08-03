import java.util.Scanner;
public class hw3{
	public static void main(String[]Args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int max = n1;
		if(n1 == n2 && n2 == n3){
			System.out.println("Numbers are equal");
			
		}else if(max < n2){
			max = n2;
			System.out.println("largest num is :" + max);
		}else if(max < n3){
			max = n3;
			System.out.println("largest num is :" + max);
		}
		
	}
}