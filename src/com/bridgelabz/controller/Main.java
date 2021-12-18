package com.bridgelabz.controller;

import java.util.Scanner;
import com.bridgelabz.service.EditContact;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------Welcome TO AddressBook------");
		EditContact editContact = new EditContact();
		
		System.out.println("1.Add\n2.Edit");
		System.out.print("Select Your Option: ");
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			editContact.getContact();
			editContact.display();
		case 2:
			editContact.edit();
			editContact.display();
		}
	}
}
