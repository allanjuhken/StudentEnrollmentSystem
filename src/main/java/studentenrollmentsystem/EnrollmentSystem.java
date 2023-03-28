package studentenrollmentsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnrollmentSystem {

    // fields
    private List<Student> studentList; // All students
    private List<Course> courseList; // All courses

    // constructor
    public EnrollmentSystem() {
        this.studentList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    // behaviours
    public void addStudent(Student student) {
        if (this.studentList.contains(student)){
            throw new IllegalArgumentException("student with id: " + student.getId() + " already exists");
        }
        this.studentList.add(student);
    }

    public void removeStudent(Student student){
        this.studentList.remove(student);
    }

    public void addCourse(Course course) {
        if (this.courseList.contains(course)) {
            throw new IllegalArgumentException("course with code: " + course.getCourseCode() + " already exists");
        }
        this.courseList.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course){
        if (!this.studentList.contains(student)){
            throw new IllegalArgumentException("student with id:"  + student.getId() +  " does not exists");
        }
        if (!this.courseList.contains(course)){
            throw new IllegalArgumentException("Course with code:"  + course.getCourseCode() +  " does not exists");
        }
        course.enrollStudent(student);
        student.enrollCourse(course);
    }

    public List<Course> getCoursesForStudent(Student student) {
        return student.getEnrolledCourses();
    }

    public List<Student> getStudentsForCourse(Course course){
        return course.getEnrolledStudents();
    }
}
