package studentenrollmentsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {

    // fields
    private String name;
    private String courseCode;
    private String teacherName;
    private List<Student> enrolledStudents;

    // constructor
    public Course(String name, String courseCode, String teacherName) {
        this.name = name;
        this.courseCode = courseCode;
        this.teacherName = teacherName;
        this.enrolledStudents = new ArrayList<>();
    }

    // behaviours
    public void enrollStudent(Student student){
        enrolledStudents.add(student);
        student.enrollCourse(this);
    }

    public void removeStudent(Student student){
        enrolledStudents.remove(student);
        student.dropCourse(this);
    }

    // getters / setters


    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                '}';

    }
}
