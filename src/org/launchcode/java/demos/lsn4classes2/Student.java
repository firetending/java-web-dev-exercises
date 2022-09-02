package org.launchcode.java.demos.lsn4classes2;

import java.util.*;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public enum Grade {
        SENIOR("Senior",90),
         JUNIOR("Junior",60),
         SOPHOMORE("Sophomore",30),
         FRESHMAN("Freshman",0);

        private final String name;
        private final int minCredits;

        Grade(String name, int minCredits) {
            this.name = name;
            this.minCredits = minCredits;
        }

         public String getName() {
             return name;
         }

         public int getMinCredits() {
             return minCredits;
         }
     }

    public String getGradeLevel() {

        int credits = this.getNumberOfCredits();
        if (credits >= Grade.SENIOR.getMinCredits()) {
            return Grade.SENIOR.getName();
        } else if (credits >= Grade.JUNIOR.getMinCredits()) {
            return Grade.JUNIOR.getName();
        } else if (credits >= Grade.SOPHOMORE.getMinCredits()) {
            return Grade.SOPHOMORE.getName();
        } else if (credits >= Grade.FRESHMAN.getMinCredits()) {
            return Grade.FRESHMAN.getName();
        } else {
            return "no grade level";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // gpa = total quality score / total credits
        // class quality score = grade * credits

//        // get current field values
//        int currentCredits = this.getNumberOfCredits();
//        double currentGpa = this.getGpa();
//
//        // add course to totals, calc gpa
//        double newTotalQualityScore = (currentGpa * currentCredits) + (grade * courseCredits);
//        int newTotalCredits = currentCredits + courseCredits;
//        double newTotalGpa = newTotalQualityScore / newTotalCredits;
//
//        //update fields
//        this.setGpa(newTotalGpa);
//        this.setNumberOfCredits(newTotalCredits);

        double newTotalQualityScore = (this.gpa * this.numberOfCredits) + (grade * courseCredits);
        this.numberOfCredits += courseCredits;
        this.gpa = newTotalQualityScore/this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return (this.name
                +" (ID: "+this.studentId
                +", GPA: "+this.gpa
                +", Credits: "+this.numberOfCredits
                +")");
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        Student sally2 = new Student("Sally",1);
        System.out.println(sally.equals(sally2));
        ArrayList<Student> roster = new ArrayList<>();
        roster.add(sally);
        roster.add(sally2);
        Course bio = new Course("Biology",new Teacher("Jane","Goodall","BIO",80),roster);
        System.out.println(bio);
    }
}
