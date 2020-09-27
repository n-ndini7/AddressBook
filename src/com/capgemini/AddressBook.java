package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	private String field;
	public static ContactInfo contact;
	private static Scanner sc;
	private static String addname;
	public static ArrayList<ContactInfo> Addbook;

	public AddressBook() {
		Addbook = new ArrayList<ContactInfo>();
	}

	public void addContact() {
		Addbook.add(contact);
	}

	public void contactshow() {
		for (ContactInfo fc : Addbook) {
			fc.show();
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		List<AddressBook> Directory = new ArrayList<AddressBook>();
		System.out.println("Enter no. of address books you want to maintain: ");
		int m = Integer.parseInt(sc.nextLine());
		while (m > 0) {
			AddressBook ab = new AddressBook();
			System.out.println("enter the name of the address book:");
			addname = sc.nextLine();
			System.out.println("enter the number of contacts you want to add into address book ");
			int n = Integer.parseInt(sc.nextLine());
			while (n > 0) {
				System.out.println("Enter new contact details");
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
				n--;
			}
			Directory.add(ab);
			m--;
		}
		for (AddressBook ad : Directory) {
			ad.contactshow();
		}

		System.out.println("Address book end reached.");

	}
}
