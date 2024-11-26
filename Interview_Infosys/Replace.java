
class Replace {
	public static void main(String[] args) {
		// Instantiate the string
		String str = "Mr John Smith   ";

		// Trim the given string
		str = str.trim();

		// Replace All space (unicode is \\s) to %20
		str = str.replaceAll("\\s", "%20");

		
		// Display the result
		System.out.println(str);
	}
}


// This code is contributed by Susobhan Akhuli

// Hello It's 26-11-2024
