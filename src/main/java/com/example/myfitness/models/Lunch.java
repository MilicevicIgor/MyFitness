package com.example.myfitness.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lunch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String description;

    private Long userId;
    private String adminText;


    public Lunch() {

    }

    public Lunch( String description, Long userId, String adminText) {

        this.description = description;
        this.userId = userId;
        this.adminText = adminText;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAdminText() {
        return adminText;
    }

    public void setAdminText(String adminText) {
        this.adminText = adminText;
    }
}
