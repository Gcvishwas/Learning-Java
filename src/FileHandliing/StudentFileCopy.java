package FileHandliing;
import java.io.*;
import java.util.Scanner;

public class StudentFileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Take input and write to std.txt
            FileWriter fw = new FileWriter("std.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            String age = sc.nextLine();

            System.out.print("Enter Grade: ");
            String grade = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            bw.write("Name: " + name + "\n");
            bw.write("Age: " + age + "\n");
            bw.write("Grade: " + grade + "\n");
            bw.write("Contact: " + contact + "\n");

            bw.close();

            // Step 2: Copy content from std.txt to std1.txt
            BufferedReader reader = new BufferedReader(new FileReader("std.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("std1.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            // Step 3: Display content of std1.txt
            System.out.println("\n--- Contents of std1.txt ---");
            BufferedReader display = new BufferedReader(new FileReader("std1.txt"));
            while ((line = display.readLine()) != null) {
                System.out.println(line);
            }
            display.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}
