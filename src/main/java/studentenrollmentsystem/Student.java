package studentenrollmentsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // fields
    private String id;
    private String name;
    private Major major;
    private List<Course> enrolledCourses;

    // constructor
    public Student(String name,String id, Major major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course){
        if (enrolledCourses.contains(course)){
            throw new IllegalArgumentException("Student is already in this course");
        }enrolledCourses.add(course);
    }

    public void dropCourse(Course course){
        if (!enrolledCourses.contains(course)){
            throw new IllegalArgumentException("Student is not enrolled in this course");
        }
        enrolledCourses.remove(course);
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Major getMajor() {
        return major;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

}
