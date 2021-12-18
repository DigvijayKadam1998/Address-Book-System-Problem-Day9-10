package com.bridgelabz.service;

import com.bridgelabz.model.CreateContact;
import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNumber;
	String email;
	
	Scanner scan = new Scanner(System.in);
	ArrayList<CreateContact> contactBook = new ArrayList<>();
	
	public void getContact() {
		System.out.println("How Many Contacts You Want To Add: ");
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			
		System.out.print(" Please enter the first name: ");
		firstName = scan.next();
		
		System.out.print(" Please enter the last name: ");
		lastName = scan.next();
		
		System.out.print(" Please enter the address: ");
		address = scan.next();
		
		System.out.print(" Please enter the city: ");
		city = scan.next();
		
		System.out.print(" Please enter the state: ");
		state = scan.next();
		
		System.out.print(" Please enter the zip: ");
		zip = scan.nextInt();
		
		System.out.print(" Please enter the phone number: ");
		phoneNumber = scan.nextInt();
		
		System.out.print(" Please enter the email: ");
		email = scan.next();
		System.out.println("\n");
		CreateContact createContact = new CreateContact(firstName,lastName,address,city,state,zip,phoneNumber,email);
		contactBook.add(createContact);
		}
	}

	public void display() {
		System.out.println("------Contacts in Addrees Book------");
		for (CreateContact person : contactBook) {
			System.out.println(person.toString());
		}
	}
	public static void main(String[] args) {
		System.out.println("------Welcome TO AddressBook------");
		AddContact addContact = new AddContact();
		addContact.getContact();
		addContact.display();
	}
}
