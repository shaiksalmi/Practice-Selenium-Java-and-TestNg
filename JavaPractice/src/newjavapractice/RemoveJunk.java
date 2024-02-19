package newjavapractice;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "#&(&(HJJGVNGB!@#123abc";
		
		//Regular expression: [^a-zA-Z0-9]
		
		s =s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		

	}

}
