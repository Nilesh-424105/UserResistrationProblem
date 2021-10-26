package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

	public static void main(String[] args) {

		// Creation Of Object
		UserRegistration user = new UserRegistration();
		// Regular Expression For First Name
		String regex = "^[A-Z]{1}[A-Za-z]{2,}";
		// Assign Regex in Pattern
		Pattern pattern = Pattern.compile(regex);
		// Match Regex and User Input
		Matcher matcher = pattern.matcher(user.inputMethod());
		// Result is in true and false
		boolean result = matcher.matches();
		// print result
		System.out.println("Your First Name Is : " + result);

	}
}
