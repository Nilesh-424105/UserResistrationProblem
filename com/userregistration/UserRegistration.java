package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

	// Create Input Method
	public String inputMethod() {

		// Take Input From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		// Assign User Input in Variable
		String firstName = sc.nextLine();
		return firstName;

	}

}
