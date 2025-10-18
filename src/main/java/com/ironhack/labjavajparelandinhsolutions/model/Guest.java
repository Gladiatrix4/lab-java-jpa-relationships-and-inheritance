package com.ironhack.labjavajparelandinhsolutions.model;

import com.ironhack.labjavajparelandinhsolutions.enums.GuestStatus;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="guest_id")
    private Long id;

    @Column(name="guest_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="guest_status")
    private GuestStatus gueststatus;

    @ManyToMany (mappedBy = "guests")
    private Set<Event> events;

    public Guest(){
    }

    public Guest(String name, GuestStatus gueststatus, Set<Event> events) {
        this.name = name;
        this.gueststatus = gueststatus;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getGueststatus() {
        return gueststatus;
    }

    public void setGueststatus(GuestStatus gueststatus) {
        this.gueststatus = gueststatus;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
}
