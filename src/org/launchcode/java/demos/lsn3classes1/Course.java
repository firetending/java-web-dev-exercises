package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String title;
    private int courseID;
    private ArrayList<Student> roster;

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getCourseID() {
        return courseID;
    }

    private void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    private void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}
