// Practical 2 - Student Marks using Arrays
package com.student;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nMarks of students....:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < 5; i++) {
            total += marks[i];
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];
        }

        double average = total / 5.0;
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);

        sc.close();
    }
}
