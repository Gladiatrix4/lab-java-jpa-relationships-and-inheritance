package com.ironhack.labjavajparelandinhsolutions.model;

import jakarta.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contact_id")
    private int contact_id;

    private String company;

    private String title;

    @Embedded
    private Name name;

    public Contact() {
    }

    public Contact(String company, Name name, String title, int id) {
        this.company = company;
        this.name = name;
        this.title = title;
        this.contact_id = id;
    }

    public int getId() {
        return contact_id;
    }

    public void setId(int id) {
        this.contact_id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}