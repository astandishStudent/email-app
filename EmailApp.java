package emailApp;

import javax.swing.JOptionPane;

public class EmailApp {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog("First name: ");
		String lastName = JOptionPane.showInputDialog("Last name: ");
		Email em1 = new Email(firstName, lastName);

		System.out.println(em1.showInfo());
	}
}
