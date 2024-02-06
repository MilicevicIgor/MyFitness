package com.example.myfitness.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exercises")
public class Exercises {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String youtubeLink;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }
}
