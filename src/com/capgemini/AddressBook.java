package com.capgemini;

import java.util.Scanner;
import java.util.*;

public class AddressBook {
	private static Scanner sc;
	private static String addname;
	String fname;
	String lname;
	String address;
	String city;
	String state;
	int zip;
	String phoneno;
	String email;
	public AddressBook(String fname, String lname, String address, String city, String state, int zip, String phoneno,
			String email) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phoneno = phoneno;
		this.email = email;
	}
	public String toString() {
		return "First name:" + fname + " |Last name: " + lname + " |Address: " + address + " |City: " + city
				+ " |State: " + state + " |ZIP: " + zip + " |Phoneno: " + phoneno + " |Email id : " + email;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		HashMap<String, ArrayList<AddressBook>> Directory = new HashMap<String, ArrayList<AddressBook>>();
		System.out.println("Enter no. of address books you want to maintain: ");
		int m = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < m; k++) {
			while (true) {
				System.out.println("enter the name of the address book:");
				addname = sc.nextLine();
				int flag = 0;
				for (Map.Entry<String, ArrayList<AddressBook>> entry : Directory.entrySet()) {
					if (entry.getKey().equals(addname)) {
						flag++;
					}
				}
				if (flag == 0) {
					break;
				} else {
					System.out.println("Address book name already exists !! Try another.");
				}
			}
			ArrayList<AddressBook> Addbook = new ArrayList<AddressBook>();
			System.out.println("enter the number of contacts you want to add into address book ");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
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
				AddressBook contact = new AddressBook(fname, lname, add, state, city, zip, phone, email);
				Addbook.add(contact);
			}
			Directory.put(addname, Addbook);
		}

		for (Map.Entry<String, ArrayList<AddressBook>> e : Directory.entrySet()) {
			System.out.println("Address book " + e.getKey() + " is :");
			System.out.println(e.getValue());
		}

	}
}
