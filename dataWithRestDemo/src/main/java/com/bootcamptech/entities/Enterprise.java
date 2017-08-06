package com.bootcamptech.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Alok on 7/31/2017.
 */
@Entity
public class Enterprise {


    @Id @GeneratedValue
    long id;
    String name;
    String naturOfWork;
    @OneToMany(mappedBy = "enterpriseId")
    Set<Employee> employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaturOfWork() {
        return naturOfWork;
    }

    public void setNaturOfWork(String naturOfWork) {
        this.naturOfWork = naturOfWork;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}
