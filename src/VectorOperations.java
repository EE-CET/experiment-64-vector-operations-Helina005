import java.util.Vector;
import java.util.Scanner;

public class VectorOperations { // Ensure this matches your filename
    public static void main(String[] args) {
        Vector<String> students = new Vector<>();
        Scanner sc = new Scanner(System.in);

        // Keep running as long as there is input
        while (sc.hasNext()) {
            String input = sc.next();
            int choice;
            
            // Safety check to ensure the input is actually a number
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                continue; 
            }

            if (choice == 5) break;

            switch (choice) {
                case 1: // Add
                    if (sc.hasNext()) {
                        students.add(sc.next());
                        System.out.println("Added");
                    }
                    break;

                case 2: // Insert (Name then Index)
                    if (sc.hasNext()) {
                        String name = sc.next();
                        int idx = sc.nextInt();
                        // 1-based to 0-based conversion
                        students.add(idx - 1, name);
                        System.out.println("Inserted");
                    }
                    break;

                case 3: // Remove
                    if (sc.hasNext()) {
                        String nameToRemove = sc.next();
                        // .remove(Object) returns true if the element existed and was removed
                        if (students.remove(nameToRemove)) {
                            System.out.println("Removed");
                        }
                    }
                    break;

                case 4: // Display
                    System.out.println(students);
                    break;
            }
        }
        sc.close();
    }
}