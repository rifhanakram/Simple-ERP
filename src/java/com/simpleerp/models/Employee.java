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
    private Role role;
    
    @Column(name="task")
    private ArrayList<Task> tasks;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
