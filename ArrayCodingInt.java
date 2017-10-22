
public class ArrayCodingInt {

	public static void main(String[] args) {
		int [] array1= {10,20,30,40};
		System.out.println("Printing an array");
		
		for(int i=0;i<array1.length;i++) {
		System.out.println("array1["+i+"] =" + array1[i]);
		}
		
		System.out.println("Now printing in reverse");
		
		
		for(int j=array1.length-1;j>=0;j--) {
		
			System.out.println("array1["+j+"] =" + array1[j]);
			
		}
		
		int product=array1[0]*array1[1]*array1[2]*array1[3];
		System.out.println("Product of all elements is: " +product);
		
			
		}
		}
	


