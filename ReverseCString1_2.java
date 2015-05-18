import java.util.Scanner;

public class ReverseCString1_2 {
	public static void main(String[] args) {
	    System.out.println("Please input a string:");
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
        reverseCString(s);
        sc.close();
	}	
	public static void reverseCString(String str) {
	    char[] rev = new char[str.length()];
	    for (int i=str.length();i>0;i--){  
		rev[str.length()-i] = str.charAt(i-1);  
		System.out.print(rev[str.length()-i]);  
		} 		
	}
}
