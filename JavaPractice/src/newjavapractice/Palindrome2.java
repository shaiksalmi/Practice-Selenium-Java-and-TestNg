package newjavapractice;

public class Palindrome2 {
	
	public  static void isPalindrome(int num) {
		
		int r = 0;
		
		int sum = 0;
		
		int t;
		
		t=num;
		
		while(num>0) {
			
			r=num%10; //get the remainder.
			
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("it's palindrome number");
		}
		
		else
		{
			
			System.out.println("it's not palindrome number");
		}
	}
	

	public static void main(String[] args) {
	
        isPalindrome(131);
        
        isPalindrome(139);
		
	}

}