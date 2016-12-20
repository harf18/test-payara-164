package fr.lescrous.test.model;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class Students {


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ssZ")
    private Date dueDate;
    private String lastName;
    private String firstName;
    private String email;
    private String secondaryEmail;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ssZ")
    private Date birthDate;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;

        Students students = (Students) o;

        if (dueDate != null ? !dueDate.equals(students.dueDate) : students.dueDate != null) return false;
        if (lastName != null ? !lastName.equals(students.lastName) : students.lastName != null) return false;
        if (firstName != null ? !firstName.equals(students.firstName) : students.firstName != null) return false;
        if (email != null ? !email.equals(students.email) : students.email != null) return false;
        if (secondaryEmail != null ? !secondaryEmail.equals(students.secondaryEmail) : students.secondaryEmail != null) return false;
        return birthDate != null ? birthDate.equals(students.birthDate) : students.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = dueDate != null ? dueDate.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (secondaryEmail != null ? secondaryEmail.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Students{" +
                "dueDate=" + dueDate +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", secondaryEmail='" + secondaryEmail + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
