package com.simpleerp.models;

import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author DeleepaP
 */
@Entity
@Table(name="employee")
public class Employee {
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="role")
    private Object role;
    
    @Column(name="task")
    private ArrayList<Object> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public ArrayList<Object> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Object> tasks) {
        this.tasks = tasks;
    }
}
