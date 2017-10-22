
public class ArrayCodingDouble {

	public static void main(String[] args) {
		double []a= {1.2, 2.5, 3.8, -12};
		
		System.out.println("Printing Array elements:");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("a["+i+"] :"+a[i]);
		}
		
		System.out.println("Now Printing in reverse:");
		
		for(int j=a.length-1;j>=0;j--)
		{
			
			System.out.println("a[" +j+"] :"+a[j]);
		}
		
	
		
		double product= a[0]*a[1]*a[2]*a[3];
		
		System.out.println("Product of all Array elements is:" +product);
		
		double average=product/4;
		
		System.out.println("Average of all Array elements is:" +average);

	}

}
