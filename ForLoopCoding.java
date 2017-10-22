
public class ForLoopCoding {
	public static void main(String[] args)
	
	{
		/*Pattern1*/
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		/*Pattern2*/
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" 2 ");
			}
			System.out.println();
		}
		
		/*Pattern3*/
		
		for(int i=0;i<8;i+=2)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" $ ");
			}
			System.out.println();
				
				
		}
		
		/*Pattern4*/
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" * *");
			}
			System.out.println();
		}
		
		/*Pattern5*/
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ j);
			}
			System.out.println();
		}
		
		/*Pattern6*/
		System.out.println();
		for(int i=3;i<=7;i+=2)	
		{
			for(int j=1;j<=i;j++)
			{
					
				System.out.print(" "+ j);
			}
			System.out.println();
			
		}
		
		/*Pattern7*/
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" "+ j);
			}
			System.out.println();
		}
		
		
		
		
	}

}
