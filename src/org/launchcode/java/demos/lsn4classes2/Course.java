package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    public Course(String topic, Teacher instructor, ArrayList<Student> roster) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = roster;
    }

    @Override
    public String toString() {
        return ("Class: "+this.topic+"\n"
                +"Teacher: "+this.instructor.getLastName()+", "+this.instructor.getFirstName()+"\n"
                +"# of Students: "+this.enrolledStudents.size()
        );
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
