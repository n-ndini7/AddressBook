package com.capgemini;
import java.util.Scanner;
import java.util.*;
public class AddressBook {
	//UC1 - create a contact in address book 
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
		AddressBook ab = new AddressBook();
		System.out.print("Enter first name: ");
		String fname= sc.nextLine();
		System.out.print("Enter last name: ");
		String lname= sc.nextLine();
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
		String email= sc.nextLine();
		contact = new ContactInfo(fname,lname,add,state,city,zip,phone,email);
		ab.addContact();
	}
}
