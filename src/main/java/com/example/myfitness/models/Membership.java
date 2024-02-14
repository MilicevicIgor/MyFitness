package com.example.myfitness.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Membership {



    @Id
    @GeneratedValue
    private Long id;
    private Date datumUplate;
    private double iznosUplate;
    private long id_usera;

    @ManyToOne
    private User student;


    // Konstruktor
    public Membership(Date datumUplate, double iznosUplate, long idUsera) {
        this.datumUplate = datumUplate;
        this.iznosUplate = iznosUplate;
        id_usera = idUsera;
    }

    public Membership() {
    }

    // Getteri i setteri

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Date getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Date datumUplate) {
        this.datumUplate = datumUplate;
    }

    public double getIznosUplate() {
        return iznosUplate;
    }

    public void setIznosUplate(double iznosUplate) {
        this.iznosUplate = iznosUplate;
    }
}
