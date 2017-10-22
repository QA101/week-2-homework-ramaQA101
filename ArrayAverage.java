import java.util.Scanner;
public class ArrayAverage {

	public static void main(String[] args) {
		int ArraySize=0,sum=0;
		double average=0.0;
		
		Scanner console=new Scanner(System.in);
		System.out.println("Please Enter size of an Array:");
		
		ArraySize=console.nextInt();
		
		int[] myArray=new int[ArraySize];
		System.out.println("Enter " + ArraySize+ " elements:");
		for(int i=0;i<ArraySize;i++)
		{
			myArray[i]=console.nextInt();
			sum=sum+myArray[i];
			
		}
		
		average=sum/ArraySize;
		System.out.println("Average is: "+ average);
		
		console.close();

	}

}
