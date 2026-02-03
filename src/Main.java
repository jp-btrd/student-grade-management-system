import  java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;


        do {

            System.out.println("--- DASHBOARD ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("> ");
            choice = scn.nextInt();
            scn.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("--- ADD STUDENT ---");

                    System.out.print("Enter ID: ");
                    String id = scn.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scn.nextLine();

                    System.out.print("Enter Grade: ");
                    double grade = scn.nextDouble();
                    scn.nextLine();

                    Student student = new Student(id, name, grade);
                    manager.addStudent(student);
                    break;

                case 2:

                    manager.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    String searchID = scn.nextLine();
                    Student found = manager.findByStudentID(searchID);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    choice = 4;
                    System.out.println("Session Terminating..");
                    break;

                default:

                    System.out.println("Invalid choice, try again.");

            }

        }while (choice != 4);

        scn.close();


    }

}