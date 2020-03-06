import java.util.Scanner;
class Asn01P01
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of M:-\n");
		int M = checkValidity(sc.nextInt());
		System.out.println("Enter the value of N:-\n");
		int N = checkValidity(sc.nextInt());
		int i, num = 0, c = 0, flag, digit = 0;
		for(i=M;i<=N;i++)
		{
			num = i;
			flag = 1;
			while(num > 0)
			{
				digit = num % 10;
				if((digit != 0) && (i % digit == 0))
					num = num / 10; 
				else
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
				System.out.println("\nNumber is :\t"+i);
			c++;
		}
		System.out.println("\nOperations :"+c+"\n-----------------------------------------------------------------------------------------------------------");
	}
  	static int checkValidity(int n){
    		int a = n;
    		while(a > 0){
			if(a % 10 == 0){
				System.out.println("\nDigit zero is invalid");
        			System.exit(0);
			}
			a /= 10;
		}
    		return n;
	}
}
