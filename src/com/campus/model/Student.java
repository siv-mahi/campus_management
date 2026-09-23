package com.campus.model;

public class Student{
    // Encapsulation - daat hide
    //instance variable

    private int studentId;
    private String studentName;
    private int age;
    private String dep;
    private int[]marks;

    //static variables
    static int studentCount=0;

    //default constructor
    public Student(){
        studentCount++;
    }

    // parmeterized constructor

    public Student(int studentId, String studentName, int age, String dep, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.dep = dep;
        this.marks = marks;
        studentCount++;
    }

    //getter: to generate private variable values to public
    public int getStudentId() {
        return studentId;
    }   
    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }
    public String getDep() {
        return dep;
    }
    public int[] getMarks() {
        return marks;
    }

    //setter: update the private variable values to public
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }
    public void setAge(int age) {
        this.age = age;
    }   
    public void setDep(String dep) {
        this.dep = dep;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // instance method belongs to object

    public void displayStudentInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dep);
    }
    public void displaystudentInfo(boolean showMarks){
        displayStudentInfo();

        if(showMarks){
            System.out.println("Marks: " + java.util.Arrays.toString(marks));
        }


    }

    public static void displayStudentCount(){
        System.out.println("Total Students: " + studentCount);
    }

}
