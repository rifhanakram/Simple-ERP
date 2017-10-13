package com.simpleerp.models;

import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author DeleepaP
 */
@Entity
@Table(name="task")
public class Task {
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="description")
    private String description;
    
    @Column(name="employee")
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
