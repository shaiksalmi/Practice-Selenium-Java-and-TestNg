package newjavapractice;

public class ReverseInt {

	public static void main(String[] args) {
		
		//1.Using alog
		
		long num = 12345;
		long rev = 0;
		
		while(num!=0) {
			
			rev = rev * 10 + num % 10;
			num = num /10;
		}
		System.out.println("Reverse num is::"+ rev);
		
		
		//2. Using StringBuffer method:
		
		long num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
		

	}

}
