package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.model.CreateContact;

public class DeleteContact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zip;
	long phoneNumber;
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
		
		CreateContact contact = new CreateContact(firstName,lastName,address,city,state,zip,phoneNumber,email);
		contactBook.add(contact);
		}
	}

	public void display() {
		System.out.println("------Contacts in Addrees Book------");
		for (CreateContact person : contactBook) {
			System.out.println(person.toString());
		}
	}
	
	public void edit() {
		System.out.println("Enter Email Of Contact Person You Want To Edit: ");
		String firstName = scan.next();
		for (CreateContact person : contactBook) {
			if(firstName.equals(person.getFirstName())) {
				System.out.println("Select Option: "
						+ "1.firstName;"
						+ "	2.lastName;"
						+ "	3.address;"
						+ "	4.city;"
						+ "	5.state;"
						+ "	6.zip;"
						+ "	7.phoneNumber;");
				int ch = scan.nextInt();
				
				switch(ch) {
				case 1:
					System.out.print("Enter new first name :- ");
					String newFirstName = scan.next();
					person.setFirstName(newFirstName);
					System.out.println("First name is updated.");
					break;
					
				case 2:
					System.out.print("Enter new last name :- ");
					String newLastName = scan.next();
					person.setLastName(newLastName);
					System.out.println("Last name is updated.");
					break;
					
				case 3:
					System.out.print("Enter new Address :- ");
					String newAddress = scan.next();
					person.setAddress(newAddress);
					System.out.println("Address is updated.");
					break;
					
				case 4:
					System.out.print("Enter new city name :- ");
					String newCity = scan.next();
					person.setCity(newCity);
					System.out.println("City is updated.");
					break;
					
				case 5:
					System.out.print("Enter new state name :- ");
					String newState = scan.next();
					person.setState(newState);
					System.out.println("State is updated.");
					break;
					
				case 6:
					System.out.print("Enter new Zip code :- ");
					int newZip = scan.nextInt();
					person.setZip(newZip);
					System.out.println("Zip code is updated.");
					break;
					
				case 7:
					System.out.print("Enter new phone number :- ");
					long newPhone = scan.nextLong();
					person.setPhoneNumber(newPhone);
					System.out.println("Phone number is updated.");
					break;
	
				default:
					System.out.println("Please Enter Valid Choice!!!");	
				}
			}else {
				continue;
			}
		}
	}
	
	public void delete() {
		System.out.print("Enter First Name to Delete Contact:- ");
		String deleteByFirstName = scan.next();
		
		for(int i = 0; i < contactBook.size(); i++) {
			String Finding_firstName = contactBook.get(i).getFirstName();
			
			if(deleteByFirstName.equals(Finding_firstName)) {
				contactBook.remove(i);
				System.out.println("\nSelected contact deleted successfully.");
				break;
			}
			else {
				continue;
			}
		}
	}
	
	public void find() {
		System.out.print("Enter First Name to Find Contact:- ");
		String findByFirstName = scan.next();
		
		for(int i = 0; i < contactBook.size(); i++) {
			String Finding_firstName = contactBook.get(i).getFirstName();
			
			if(findByFirstName.equals(Finding_firstName)) {
				System.out.println("\n---Contatct Found---.");
				break;
			}
			else {
				System.out.println("\n---Contact Not Found---\n");
			}
		}
	}
}