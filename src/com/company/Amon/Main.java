/*
Benton Amon
Exercise 9
Creates an abstract class of contact that then is extended into a phone and email contact.
Uses the contact() method for a custom display for either email or phone number.
 */

package com.company.Amon;


abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void contact();
}


class EmailContact extends Contact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    public void contact() {
        System.out.println("Emailing " + super.getName() + " at: " + email + " ...");
    }
}


class PhoneContact extends Contact {
    private String phoneNumber;

    public PhoneContact(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public void contact() {
        System.out.println("Calling " + super.getName() + " at: " + phoneNumber + " ...");
    }
}



public class Main {

    public static void main(String[] args) {
        EmailContact contact1 = new EmailContact("Joel", "software@cscc.edu");
        PhoneContact contact2 = new PhoneContact("Stephen", "614-123-4567");

        contact1.contact();
        contact2.contact();
    }
}
