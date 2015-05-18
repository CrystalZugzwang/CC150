import java.util.Scanner;

public class Uniquechar1_1 {
	
	public static void main(String[] args) {
		System.out.println("Please input a string:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();		
		
		if (isUniqueChars(text)) {
			System.out.println("Unique!");
		}
		else {
			System.out.println("Not unique!");
		}
		sc.close();
	}

	public static boolean isUniqueChars(String str){
		if (str.length()>256) return false;
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length();i++) {
			int val=str.charAt(i);
			if (char_set[val]) return false;
			char_set[val]=true;
		}
		return true;		
	}
}
