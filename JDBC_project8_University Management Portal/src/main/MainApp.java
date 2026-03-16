package main;



import java.util.Scanner;

import universtity_management_portal_controller.StudentController;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentController controller = new StudentController();

        while (true) {

            System.out.println("\n--- University Management Portal ---");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Delete Student");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Department:");
                    String dept = sc.nextLine();

                    System.out.println("Enter Email:");
                    String email = sc.nextLine();

                    controller.addStudent(name, dept, email);
                    break;

                case 2:
                    controller.displayStudents();
                    break;

                case 3:
                    System.out.println("Enter Student ID:");
                    int id = sc.nextInt();
                    controller.deleteStudent(id);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}