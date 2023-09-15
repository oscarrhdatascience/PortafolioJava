/*
University Management System Description:

This university management system allows the registration of students and courses, assignment of administrative roles, and handling of various aspects of the academic process. Students can make tuition payments and receive notifications. Courses have a maximum capacity for students and are assigned a professor and a schedule. Moreover, roles can be assigned to administrators to control access and functions within the system.

Integrated Concepts:

    Object-Oriented Programming (OOP)
    Encapsulation
    Lists and ArrayLists
    Hashmaps/Dictionaries
    Flow Control (Conditional structures and loops)
    Class Relationships
    Dynamic Data Modification
    Data Filtering and Searching
    Data Integrity Checks (e.g., checking the maximum number of students for a course)
    Role-Based Access Control (RBAC) (basic representation via admin roles)
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String studentId;
    private HashMap<Course, Double> grades;
    private double tuitionFees;
    private double paidAmount;

    // Constructor
    public Student(String name, String studentId, double tuitionFees) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFees = tuitionFees;
        this.grades = new HashMap<>();
        this.paidAmount = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public HashMap<Course, Double> getGrades() {
        return grades;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void payTuition(double amount) {
        this.paidAmount += amount;
        sendNotification("Payment received: " + amount);
    }

    public void sendNotification(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}

class Course {
    private String courseId;
    private String courseName;
    private int maxStudents;
    private List<Student> enrolledStudents;
    private String professor;
    private String schedule;
    private double fee;

    // Constructor
    public Course(String courseId, String courseName, int maxStudents, String professor, String schedule, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
        this.professor = professor;
        this.schedule = schedule;
        this.fee = fee;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean enrollStudent(Student student) {
        if(enrolledStudents.size() < maxStudents) {
            enrolledStudents.add(student);
            return true;
        } else {
            return false;
        }
    }
}

class University {
    private List<Student> students;
    private List<Course> courses;
    private Map<String, String> adminRoles;  // AdminID -> Role 

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        adminRoles = new HashMap<>();
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String studentId) {
        for(Student s : students) {
            if(s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String courseId) {
        for(Course c : courses) {
            if(c.getCourseId().equals(courseId)) {
                return c;
            }
        }
        return null;
    }

    public void assignAdminRole(String adminId, String role) {
        adminRoles.put(adminId, role);
    }

    public String getAdminRole(String adminId) {
        return adminRoles.get(adminId);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Test the system here
    }
}
