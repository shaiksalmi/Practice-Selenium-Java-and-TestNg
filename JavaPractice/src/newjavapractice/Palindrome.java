package newjavapractice;

public class Palindrome {

	
		
		public static void isPalindromeNumber(int num) {
		
		
		int r = 0;
		int sum =0;
		int t;
		t=num;
		
		while(num>0) {
			
			r=num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("Palindrome Number");
			oooo
		}
		
		else {
			
			System.out.println("Not A Palindrome Number");

		}
		}

		public static void main(String[] args) {

  isPalindromeNumber(151);

}
}
