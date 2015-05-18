// Ask the interviewer about details: are the characters case sensitive, 
// are the white space and special characters significant?

/*
	 * Assume the string falls under a certain encoding. 
	 * Check if the two strings have the same character count.
	 * Use an extra constant
	 * size array of integers to store the frequency of each character in str1,
	 * for each character in str2, minus the frequency array's value by 1. In
	 * the end, check if each element in the frequency array is 0, if not then
	 * str1 is not a permutation of str2. Time complexity O(n), Space complexity O(1)
*/
import java.util.Scanner;

public class IsPermutation1_3 {
	public static void main(String[] args) {
		System.out.println("Please input string1:");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		System.out.println("Please input string2:");
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.nextLine();
		if (ifPermutation(s1, s2)) {
			System.out.println("Is Permutation!");
		}
		else {
			System.out.println("Not Permutation!");
		}
        sc1.close();
        sc2.close();
	}	
	public static boolean ifPermutation(String str1, String str2) {
		// Check input
		if (str1 == null || str2 == null||str1.length() != str2.length()) {
			return false;
		}
	
		// For basic ASCII size is 128, extended ASCII 256, UNICODE16 is 65536
		int size = 256;
		int[] freqs = new int[size];
		
		// str1 and str2 are of the same length
		for (int i = 0; i < str1.length(); i++) {
			freqs[str1.charAt(i)] += 1;
			freqs[str2.charAt(i)] -= 1;
		}
		// Go through the frequency array, to see if every element is 0
		for (int i = 0; i < size; i++) {
			if (freqs[i] != 0) {
				return false;
			}
		}
		return true;
	}
}

