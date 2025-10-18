package com.ironhack.labjavajparelandinhsolutions.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Exhibition extends Event{
    public Exhibition(int duration, String title, LocalDate date, String location, Set<Guest> guests) {
        super(duration, title, date, location, guests);
    }

    public Exhibition() {
    }
}
