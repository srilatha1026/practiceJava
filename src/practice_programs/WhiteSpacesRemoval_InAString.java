package practice_programs;

public class WhiteSpacesRemoval_InAString {

	public static void main(String[] args) {
		String str_withwhitespaces = "hello how are you";
		String str_withoutspace = str_withwhitespaces.replaceAll(" ","");
		System.out.println(str_withoutspace);

		
	}

}
