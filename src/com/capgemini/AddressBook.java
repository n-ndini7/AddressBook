package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	// UC3 - edit the contact details and update it.
	private String field;
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
	}

	public void editContact(String name) {
		for (ContactInfo c : Addbook) {
			if (c.getFname().equals(name)) {
				System.out.println("Contact found!!");
				System.out.println("Enter the field you want to edit: ");
				field = sc.nextLine();
				switch (field) {
				case "fname":
					System.out.println("Enter the new first name: ");
					c.setFname(sc.nextLine());
					break;
				case "lname":
					System.out.println("Enter the new last name: ");
					c.setLname(sc.nextLine());
					break;
				case "address":
					System.out.println("Enter the new address: ");
					c.setAddress(sc.nextLine());
					break;
				case "state":
					System.out.println("Enter the new state: ");
					c.setState(sc.nextLine());
					break;
				case "city":
					System.out.println("Enter the new city: ");
					c.setCity(sc.nextLine());
					break;
				case "zip":
					System.out.println("Enter the new ZIP: ");
					c.setZip(Integer.parseInt(sc.nextLine()));
					break;
				case "phoneno":
					System.out.println("Enter the new phone no.: ");
					c.setPhoneno(sc.nextLine());
					break;
				case "email":
					System.out.println("Enter the new email: ");
					c.setEmail(sc.nextLine());
					break;
				default:
					System.out.println("No such field exists!!! ");
					break;
				}
				System.out.println("Contact edited successfully!!");
				System.out.println("The updated contact is :");
				c.show();
				break;
			}

		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		choice = true;
		while (choice) {
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
			System.out.print("Enter phone no: ");
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
				//System.out.println("Thankyou!!");
				break;
			}
		}
		System.out.println("Enter the first name of the contact you want to edit : ");
		String first = sc.nextLine();
		ab.editContact(first);
	}
}
