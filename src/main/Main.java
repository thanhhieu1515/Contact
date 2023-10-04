package main;
import controller.ContactController;
import controller.ContactManager;
import view.View;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        View view = new View();
        ContactManager manager = new ContactManager(controller, view);
        manager.run();
    }
}