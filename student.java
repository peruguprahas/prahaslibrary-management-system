package com.anurag.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class student {

    @Id
    private String id; // Student ID / Roll Number
    private String name;
    private String email;
    private String department; // Department / Class
    private String phone;      // Phone Number
    private int activeLoans;
    private String accountStatus;

    // --- GETTERS AND SETTERS ---
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int getActiveLoans() { return activeLoans; }
    public void setActiveLoans(int activeLoans) { this.activeLoans = activeLoans; }

    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }
}
