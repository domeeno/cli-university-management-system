package org.example.labtwo.behavior;

import org.example.labtwo.models.Faculty;
import org.example.labtwo.models.University;

import java.util.Objects;
import java.util.Scanner;

public class ApplicationLoop {

    private Scanner scanner;
    private University university;

    public ApplicationLoop() {
        this.scanner = new Scanner(System.in);
        this.university = new University();
    }


    public void run() {
        String command = "djsoadsa";

        while (!Objects.equals(command, "q")) {
            System.out.print("your command: ");
            command = scanner.nextLine();
            System.out.println(command);

            if (Objects.equals(command, "f")) {
                System.out.println("name: ");
                String nameOfFaculty = scanner.nextLine();
                System.out.println("abbrev: ");
                String abbrevOfFaculty = scanner.nextLine();
                System.out.println("field: ");
                String fieldOfFaculty = scanner.nextLine();

                Faculty faculty = new Faculty(nameOfFaculty, abbrevOfFaculty, fieldOfFaculty);
                this.university.addFaculty(faculty);
            } else if (command.equals("pf")) {
                System.out.println(this.university);
            }
        }

        scanner.close();
    }
}
