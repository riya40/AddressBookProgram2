package com.bl.adp;

import java.util.Scanner;
import java.util.List;

public class AddressBook {
    public static void main(String args[]) {
        /* address book welcome message */
        System.out.println("Welcome to address book program");

        AddressBook addressBook= new AddressBook();
        addressBook.addcontactdetails();

    }

        public void addcontactdetails() {
            Contacts contactPerson = new Contacts();
            System.out.println("enter the details");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter first name");
            contactPerson.firstname = scanner.next();
            System.out.println("enter last name");
            contactPerson.lastname = scanner.next();
            System.out.println("enter address");
            contactPerson.address = scanner.next();
            System.out.println("enter city");
            contactPerson.city = scanner.next();
            System.out.println("enter state");
            contactPerson.state = scanner.next();
            System.out.println("enter pin code");
            contactPerson.pincode = scanner.nextInt();
            System.out.println("enter mobile number");
            contactPerson.phonenumber = scanner.nextInt();
            System.out.println("enter email id");
            contactPerson.email = scanner.next();

            ContactDetails contacts = new ContactDetails();
            contacts.add(contactPerson);
            List contact=contacts.printdetails();
            PrintDetails printdetails=new PrintDetails();
            printdetails.print(contact);


        }
    }

