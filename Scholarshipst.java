package com.campus.model;

public class Scholarshipst extends Student {
    private double scholarshipPercentage;

    public Scholarshipst(int studentId, String studentName, int age, String dep, int[] marks, double scholarshipPercentage) {
        super(studentId, studentName, age, dep, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    @Override
    public void studentType() {
        System.out.println("This is a scholarship student.");
    }

    @Override
    public void generatereport() {
        System.out.println("scholarship student report");
    }
}
