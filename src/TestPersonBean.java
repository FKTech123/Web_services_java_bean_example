import java.io.*;
import java.util.Scanner;

public class TestPersonBean {

    private static final String FILENAME = "person.ser";

    public static void main(String[] args) {
        PersonBean person = new PersonBean();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Set first name");
            System.out.println("2. Set last name");
            System.out.println("3. Display name");
            System.out.println("4. Save person");
            System.out.println("5. Load person");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    person.setFirstName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter last name: ");
                    person.setLastName(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("First Name: " + person.getFirstName());
                    System.out.println("Last Name: " + person.getLastName());
                    break;
                case 4:
                    savePerson(person);
                    break;
                case 5:
                    person = loadPerson();
                    if (person != null) {
                        System.out.println("Person loaded successfully.");
                    } else {
                        System.out.println("Failed to load person.");
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private static void savePerson(PersonBean person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(person);
            System.out.println("Person saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PersonBean loadPerson() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (PersonBean) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
