import java.util.ArrayList;
import java.util.Scanner;

public class BooksListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to the Book Manager📋");

        while (running) {
            System.out.println("\nChoose one of the following options");
            System.out.println("1.Add a book");
            System.out.println("2. Show books");
            System.out.println("3.Delete a book");
            System.out.println("4. Exet");

            System.out.print("Enter 👉   ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print(" Type the name of the book you want to add 📝");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("✅ The book has been added");
                    break;
                case 2:
                    System.out.println(" Book list 📌 ");
                    if (tasks.isEmpty()) {
                        System.out.println("👔here are no books currently ");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Enter the number of the book you want to delete ❌ ");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("The book has been deleted 🗑️");
                    } else {
                        System.out.println("Invalid number");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("The program has been exited👋");
                    break;
                default:
                    System.out.println("Incorrect choice, try again");
            }
        }

        scanner.close();
    }
}
