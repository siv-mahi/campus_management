package com.campus.service;
import com.campus.model.Student;

public class StudentService{
    //cslculate total marks
    public int calculateTotal(Student student){
        if(student.getMarks() == null){
            return 0;
        }
        int total=0;
        for(int marks: student.getMarks()){
            total+=marks;
        }
        return total;
    }

        //calculate average marks
        public double calculateAverage(Student student){
            if(student.getMarks() == null || student.getMarks().length == 0){
                return 0;
            }
            int total=calculateTotal(student);
            return (double)total/student.getMarks().length;
        }

        // find maximum marks
        public int findMax(Student student){
            if(student.getMarks() == null || student.getMarks().length == 0){
                return 0;
            }
            int max=student.getMarks()[0];
                for(int mark :student.getMarks() ){
                    if(mark>max){
                        max=mark;
                    }
                }
                return max;
            }
            public int findMin(Student student){
                if(student.getMarks() == null || student.getMarks().length == 0){
                    return 0;
                }
                int min=student.getMarks()[0];
                for(int mark :student.getMarks() ){
                    if(mark<min){
                        min=mark;
                    }
                }
                return min;
            }
            public char grade(Student student){
                int[] marks = student.getMarks();
                if(marks == null || marks.length == 0){
                    return 'F';
                }
                int total=calculateTotal(student);
                int average=(int) calculateAverage(student);
                if(average >= 90){
                    return 'A';
                } else if(average >= 80){
                    return 'B';
                } else if(average >= 70){
                    return 'C';
                } 
                else if(average >= 60){
                    return 'D';
                }
                else {
                    return 'F';
                }
            }

                // pass or fail
                public String passOrfail(Student student){
                    int[] marks = student.getMarks();
                    if(marks == null || marks.length == 0){
                        return "Fail";
                    }
                    int average=(int) calculateAverage(student);
                    if(average >= 40){
                        return "Pass";
                    }
                    else {
                        return "Fail";
                        }
                }

                    public void displayReportCard(Student student){
                System.out.println("Student ID: " + student.getStudentId());
                System.out.println("Student Name: " + student.getStudentName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Department: " + student.getDep());
                System.out.print("Marks: ");
                if(student.getMarks() != null){
                    for(int mark : student.getMarks()){
                        System.out.print(mark + " ");
                    }
                }
                System.out.println();
                System.out.println("Total Marks: " + calculateTotal(student));
                System.out.println("Average Marks: " + calculateAverage(student));
                System.out.println("Maximum Marks: " + findMax(student));
                System.out.println("Minimum Marks: " + findMin(student));
                System.out.println("Grade: " + grade(student));
                System.out.println("Result: " + passOrfail(student));
            }
    }
