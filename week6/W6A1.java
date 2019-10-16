
public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		
		int i = 2;
		int max = 30;
		boolean PN = true;
		
		while (i <= max) 
		{
			PN = true;
			for (int n = 2; n < i; n++)
			{
				if (i % n == 0) 
				{
					PN = false;
				}
				continue;
			}	
			if (PN == true)
				System.out.print(i+" ");
			i++;
		}
	}	
}



