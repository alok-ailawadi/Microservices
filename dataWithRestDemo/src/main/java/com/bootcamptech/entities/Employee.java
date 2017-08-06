package com.bootcamptech.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Alok on 7/31/2017.
 */
@Entity
public class Employee {


    @Id
    @GeneratedValue
    long id;
    long enterpriseId;
    String firstName;
    String lastName;
    String designation;
    Date doj;
    @OneToMany(mappedBy = "employeeId")
    Set<ApplicationRole> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Set<ApplicationRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<ApplicationRole> roles) {
        this.roles = roles;
    }


}
