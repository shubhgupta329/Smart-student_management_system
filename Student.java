
import java.util.Date;

/**
 * Model class for Student entity
 */
public class Student {
    private int id;
    private String registrationNo;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String contact;
    private String email;
    private String course;
    private String enrollmentDate;
    private String status;
    private String address;
    private String guardianName;
    private String guardianContact;
    
    // Default constructor
    public Student() {
    }
    
    // Constructor with essential fields
    public Student(int id, String registrationNo, String name, String gender, 
                  String dateOfBirth, String contact, String email, 
                  String course, String enrollmentDate, String status) {
        this.id = id;
        this.registrationNo = registrationNo;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.email = email;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }
    
    // Full constructor
    public Student(int id, String registrationNo, String name, String gender, 
                  String dateOfBirth, String contact, String email, 
                  String course, String enrollmentDate, String status,
                  String address, String guardianName, String guardianContact) {
        this(id, registrationNo, name, gender, dateOfBirth, contact, email, course, enrollmentDate, status);
        this.address = address;
        this.guardianName = guardianName;
        this.guardianContact = guardianContact;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", registrationNo='" + registrationNo + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}