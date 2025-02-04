package arrayOperations;

import java.util.Scanner;

public class Palindrome {
	    public static boolean isPalindrome(String str) {
	        str = str.replaceAll("\\s", "").toLowerCase();
	        return str.equals(new StringBuilder(str).reverse().toString());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

	

