package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	// UC2 - Add a new contact in address book
	private static String c;
	private static boolean choice;
	public static ContactInfo contact;
	private static Scanner sc;
	ArrayList<ContactInfo> Addbook;

	public AddressBook() {
		Addbook = new ArrayList<ContactInfo>();
	}

	public void addContact() {
		Addbook.add(contact);
		System.out.println("Contact Added successfully!!");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		choice = true;
		while (choice) {
			AddressBook ab = new AddressBook();
			System.out.println("Enter new contact details!");
			System.out.print("Enter first name: ");
			String fname = sc.nextLine();
			System.out.print("Enter last name: ");
			String lname = sc.nextLine();
			System.out.print("Enter Address: ");
			String add = sc.nextLine();
			System.out.print("Enter State: ");
			String state = sc.nextLine();
			System.out.print("Enter city: ");
			String city = sc.nextLine();
			System.out.print("Enter ZIP: ");
			int zip = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Phone no: ");
			String phone = sc.nextLine();
			System.out.print("Enter email: ");
			String email = sc.nextLine();
			contact = new ContactInfo(fname, lname, add, state, city, zip, phone, email);
			ab.addContact();
			System.out.println("Do you wish to add new contact (yes/no)? ");
			c = sc.nextLine();
			if (c.equals("yes")) {
				choice = true;
			} else {
				choice = false;
				System.out.println("Thankyou!!");
				break;
			}
		}

	}
}
