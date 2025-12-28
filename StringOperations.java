package Java1;

public class StringOperations {

	public static void main(String[] args) {
		

		        String str = "  Hello World Java  ";
		        String str2 = "Hello World Java";

		        // length()
		        System.out.println("Length: " + str.length());

		        // isEmpty()
		        System.out.println("Is Empty: " + str.isEmpty());

		        // charAt()
		        System.out.println("Character at index 2: " + str.charAt(2));

		        // toString()
		        StringBuffer sb = new StringBuffer("Java");
		        System.out.println("toString(): " + sb.toString());

		        // equals()
		        System.out.println("Equals: " + str.trim().equals(str2));

		        // compareTo()
		        System.out.println("CompareTo: " + str.trim().compareTo(str2));

		        // contains()
		        System.out.println("Contains 'World': " + str.contains("World"));

		        // indexOf()
		        System.out.println("IndexOf 'o': " + str.indexOf('o'));

		        // lastIndexOf()
		        System.out.println("LastIndexOf 'o': " + str.lastIndexOf('o'));

		        // startsWith()
		        System.out.println("StartsWith 'Hello': " + str.trim().startsWith("Hello"));

		        // endsWith()
		        System.out.println("EndsWith 'Java': " + str.trim().endsWith("Java"));

		        // matches()
		        System.out.println("Matches regex: " + str.trim().matches("[A-Za-z ]+"));

		        // substring()
		        System.out.println("Substring (0,5): " + str.substring(0, 5));

		        // toLowerCase()
		        System.out.println("Lowercase: " + str.toLowerCase());

		        // trim()
		        System.out.println("Trimmed: '" + str.trim() + "'");

		        // replace()
		        System.out.println("Replace Java with Programming: " +
		                str.replace("Java", "Programming"));

		        // split()
		        String[] words = str.trim().split(" ");
		        System.out.println("Split words:");
		        for (String word : words) {
		            System.out.println(word);
		        }

		        // join()
		        String joined = String.join("-", words);
		        System.out.println("Joined: " + joined);

		        // valueOf()
		        int num = 100;
		        String numStr = String.valueOf(num);
		        System.out.println("ValueOf int: " + numStr);
		    }
		


	}


