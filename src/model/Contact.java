package model;


public class Contact {
    private static int lastID = 0;
    private int id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String firstName;
    private String lastName;

    public Contact(String fullName, String group, String address, String phone) {
        this.id = ++lastID;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        String[] names = fullName.split(" ");
        if (names.length >= 2) {
            this.firstName = names[0];
            this.lastName = names[names.length - 1];
        }
    }

    public int getLastID() {
        return this.lastID;
    }

    public void setLastID(int lastID) {
        this.lastID = lastID;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}