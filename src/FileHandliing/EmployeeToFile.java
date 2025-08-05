package FileHandliing;

import java.io.*;
import java.util.Scanner;

public class EmployeeToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("Emp.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            String dob = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            bw.write("ID: " + id + "\n");
            bw.write("Name: " + name + "\n");
            bw.write("Address: " + address + "\n");
            bw.write("DOB: " + dob + "\n");
            bw.write("Phone: " + phone + "\n");

            bw.close();

            // Reading and displaying contents
            System.out.println("\n--- Contents of Emp.txt ---");
            BufferedReader br = new BufferedReader(new FileReader("Emp.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}
