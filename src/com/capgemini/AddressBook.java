package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	// UC5- Add multiple contacts into address book
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

	public void contactshow() {
		for (ContactInfo f : Addbook) {
			f.show();
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number of contacts you want to enter into Address book:");
		int n = Integer.parseInt(sc.nextLine());
		AddressBook ab = new AddressBook();
		while (n > 0) {
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
			n--;
		}
		ab.contactshow();
	}
}
