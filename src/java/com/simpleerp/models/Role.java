package com.simpleerp.models;

import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author DeleepaP
 */
@Entity
@Table(name="role")
public class Role {
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
