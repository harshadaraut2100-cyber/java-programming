import java.util.Scanner;
class SumOfEvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num =sc.nextInt();
		int evensum=0;
		int oddsum=0;
		while(num!=0)
		{
		 int ld = (num%10);
		 if(ld%2==0)
			{
			 evensum = evensum + ld;
			}
		else
			{
			oddsum = oddsum + ld;
			}
			num=num/10;
		}
		System.out.println("Even digits count :"+evensum);
		System.out.println("Odd digits count :"+oddsum);
	}
}
