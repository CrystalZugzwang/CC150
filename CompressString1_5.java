
public class CompressString1_5 {
	public static void main(String args[]) {
		System.out.println(compressString("abc"));
		System.out.println(compressString("aabc"));
		System.out.println(compressString("aabcccccaaa"));
	}
 
	/*
	 * Solution: Go through each character in the input string, compare it with
	 * the previous one, count the frequency and store in the result. Return the
	 * original string if the result length is no smaller than the length of the
	 * original string.
	 * 
	 * Time Complexity: O(n), Space Complexity: O(n)
	 * 
	 * @param input
	 * @return
	*/
	
	public static String compressString(String input) {
		// Optimization: if the length is no larger than 3 then we can't
		// compress it
		if (input == null || input.isEmpty() || input.length() <= 2) {
			return input;
		}
		// Count the frequency of this char
		char last = input.charAt(0);
		// Freq count of the last char
		int count = 1;
		// Use StringBuilder or StringBuffer time is O(n+k) where k is the
		// number of distinct char we
		// encounter (k<=n). If we use string, the time
		// complexity is O(n +k^2) makes O(n^2) time.
		StringBuilder result = new StringBuilder();
		for (int i = 1; i < input.length(); i++) {
			// Compare each character with the previous one and save the count
			if (input.charAt(i) == last) {
				count += 1;
			} else {
				// Encountered a different char, append it to the result
				result.append(last).append(count);
				last = input.charAt(i);
				count = 1;
				// If it cannot be compressed, means the result length is no
				// smaller
				// than the input, return the original input string
				if (result.length() >= input.length()) {
					return input;
				}
			}
		}
		// Don't forget the last pair
		result.append(last).append(count);
 
		return result.length() >= input.length() ? input : result.toString();
	}

}
