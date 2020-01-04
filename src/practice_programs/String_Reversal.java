package practice_programs;




public class String_Reversal {

	public static void main(String[] args) {
		
		String str = "Hello how are you";
		//String required_output = "uoy era woh olleh";
		int LengthOfString = str.length();
		//char charAt= name.charAt(LengthOfString-1);
		//System.out.println(charAt);
		
		 String str1 = "";
		for(int i=LengthOfString-1;i>=0;i--) {
			str1=str1+str.charAt(i);
				}
		System.out.println("The reverse string is:" + str1);
	}

}
