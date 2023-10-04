package view;


import java.util.List;
import java.util.Scanner;

import model.Contact;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
    }

    public int getChoice() {
        System.out.print("Enter selection: ");
        return getValidInput();
    }

    public Contact getInputContact() {
        System.out.println("-------- Add a Contact --------");
        System.out.print("Input Name: ");
        scanner.nextLine();
        String fullName = scanner.nextLine();
        System.out.print("Input Group: ");
        String group = scanner.nextLine();
        System.out.print("Input Address: ");
        String address = scanner.nextLine();
        String phone;
        do {
            System.out.println("Input phone: ");
            phone = scanner.nextLine();
        } while (!isValidPhone(phone));
    
        return new Contact(fullName, group, address, phone);
    }
    

    public int getInputDeleted() {
        System.out.println("------- Delete a Contact -------");
        System.out.print("Input ID to delete: ");
        return getValidInput();
    }

    public void displayContact(List<Contact> contactList) {
        System.out.println("\n--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-7s %-15s %-15s %-15s %-7s %-15s %-15s%n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
    
        for (Contact contact : contactList) {
            System.out.printf("%-7d %-15s %-15s %-15s %-7s %-15s %-15s%n",
                    contact.getId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }
    

    private int getValidInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\d{10}$|^\\d{3}-\\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4} x\\d{4}$|^\\d{3}-\\d{3}-\\d{4} ext\\d{4}$|^\\(\\d{3}\\)-\\d{3}-\\d{4}$|^\\d{3}\\.\\d{3}\\.\\d{4}$|^\\d{3} \\d{3} \\d{4}$");
    }
}