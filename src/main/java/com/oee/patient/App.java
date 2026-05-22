package com.oee.patient;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PATIENT REGISTRATION SYSTEM =====");

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        System.out.println("\n===== PATIENT DETAILS =====");

        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println("Doctor Name  : " + doctor);

        System.out.println("\nPatient Registered Successfully!");

        sc.close();
    }
}
