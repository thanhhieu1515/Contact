package controller;


import java.util.ArrayList;
import java.util.List;

import model.Contact;

public class ContactController {
    private List<Contact> contactList;

    public ContactController() {
        this.contactList = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        return contactList.add(contact);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public boolean deleteContact(int id) {
        for (Contact contact : contactList) {
            if (contact.getId() == id) {
                return contactList.remove(contact);
            }
        }
        return false;
    }
}