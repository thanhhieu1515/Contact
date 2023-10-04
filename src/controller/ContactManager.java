package controller;


import java.util.List;

import model.Contact;
import view.View;

public class ContactManager {
    private ContactController controller;
    private View view;

    public ContactManager(ContactController controller, View view) {
        this.controller = controller;
        this.view = view;
    }
    
    public void run() {
        while (true) {
            view.displayMenu();
            int choice = view.getChoice();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContact();
                    break;
                case 3:
                    deleteContact();
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please input again.");
            }
        }
    }

    public void addContact() {
        Contact contact = view.getInputContact();
        if (controller.addContact(contact)) {
            System.out.println("Successful");
        } else {
            System.out.println("Failed to add contact.");
        }
    }

    public void displayContact() {
        List<Contact> ContactList = controller.getContactList();
        view.displayContact(ContactList);
    }

    public void deleteContact() {
        int deleteID = view.getInputDeleted();
        if (controller.deleteContact(deleteID)) {
            System.out.println("Successful");
        } else {
            System.out.println("Contact not found.");
        }
    }


}