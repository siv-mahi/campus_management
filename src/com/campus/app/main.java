package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inputs from users 
        System.out.println("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int Age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Department: ");
        String department = sc.next();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

    
    int [] marks = new int[n];
    System.out.println("enter the marks of "+ n + " subjects: ");
    for(int i=0;i<n;i++){
        marks[i]=sc.nextInt();
    }
    Student student = new Student(studentId, studentName, Age, department, marks);
    StudentService studentService = new StudentService();
    studentService.displayReportCard(student);
    sc.close();


    }
}