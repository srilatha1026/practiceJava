package practice_programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		//to find prime or not the number should be divisible only by itself
//		n=5 is prime . 5/(n-1)=5/4!=0, 5/3!=0,5/2!=0
		int n = 1000000001;
		int flag = 0;
//		 double m = Math.sqrt(n);
		if(n==0||n==1) 
		{
			System.out.println("Number not a prime");
		}else {
				for(int i=2;i<=n-1;i++) //for(int i=2;i<=m;i++)
					{
						int r=n%i;
						if(r==0) 
							{
								System.out.println("Number "+n+ "  not a prime");
								flag=1;
								break;
							}
					}
				if(flag==0)
					{
						System.out.println("Number "+n+ " is a prime");
					}
				}

}
}