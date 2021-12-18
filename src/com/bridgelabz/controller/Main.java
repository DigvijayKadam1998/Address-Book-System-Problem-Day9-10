package com.bridgelabz.controller;

import java.util.Scanner;
import com.bridgelabz.service.DeleteContact;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------Welcome TO AddressBook------");
		DeleteContact deleteContact = new DeleteContact();
		
		while(true) {
			System.out.println("1.Add\n2.Edit\n3.Delete\n4.Find");
			System.out.print("Select Your Option: ");
			int option = scan.nextInt();
		
			switch(option) {
			case 1:
				deleteContact.getContact();
				deleteContact.display();
				break;
			case 2:
				deleteContact.edit();
				deleteContact.display();
				break;
			case 3:
				deleteContact.delete();
				deleteContact.display();
				break;
			case 4:
				deleteContact.find();
				deleteContact.display();
				break;
			}
		}
	}
}
