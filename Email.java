package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 100;
	private int defaultPasswordLength = 12;
	private String alternateEmail;

	// create constructor, retrieve firstName, lastName //
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department, return department //

		this.department = setDepartment();

		// Call a method asking for a random password //

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password: " + password);

		// Combine elements to generate a email //

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
	}

	// ask for department //

	private String setDepartment() {
		System.out.println("Please enter your department:\n1 for Sales\n2 for Development\n3 for Accounting\n0");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "development";
		} else if (depChoice == 3) {
			return "accounting";
		} else { return ""; }
	}

	// generate a random password //

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			// for-loop iterates for random character in //
			// passwordSet for set length. ////////////////
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set mailbox capacity

	public void setEmailCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set alternate email

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() { return mailboxCapacity; }

	public String getAlternateEmail() { return alternateEmail; }

	public String getPassword() { return password; }

	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}

}
