package com.ironhack.labjavajparelandinhsolutions.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Conference extends Event{
    @ManyToMany
    @JoinTable(
            name="conference_speakers",
            joinColumns = @JoinColumn(name="conference_id"),
            inverseJoinColumns = @JoinColumn(name="speaker_id")
    )
    private Set<Speaker> speakers;

    public Conference(Set<Speaker> speakers) {
        this.speakers = speakers;
    }
    public Conference(int duration, String title, LocalDate date, String location, Set<Guest> guests, Set<Speaker> speakers) {
        super(duration, title, date, location, guests);
        this.speakers = speakers;
    }

    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }
}
