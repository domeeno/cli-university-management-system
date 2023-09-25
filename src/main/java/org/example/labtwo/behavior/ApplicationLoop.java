package org.example.labtwo.behavior;

import org.example.labtwo.models.Faculty;
import org.example.labtwo.models.University;

import java.util.ArrayList;
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
            command = this.takeUserInput();
            String[] commandList = command.split("/");

            switch (commandList[0]) {
                case "f":
                    this.addFaculty();
                    break;
                case "pf":
                    this.printFaculties();
                default:
                    System.out.println("Invalid command");
            }
        }

        System.out.println("Exiting program");

        scanner.close();
    }

    private String takeUserInput() {
        System.out.print("prompt> ");
        return this.scanner.nextLine();
    }

    private void printFaculties() {
        System.out.println(this.university);
    }

    private void addFaculty() {
        System.out.println("name: ");
        String nameOfFaculty = scanner.nextLine();
        System.out.println("abbrev: ");
        String abbrevOfFaculty = scanner.nextLine();
        System.out.println("field: ");
        String fieldOfFaculty = scanner.nextLine();

        Faculty faculty = new Faculty(nameOfFaculty, abbrevOfFaculty, fieldOfFaculty);
        this.university.addFaculty(faculty);
    }
}
