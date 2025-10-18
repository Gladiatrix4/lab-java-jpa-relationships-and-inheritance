package com.ironhack.labjavajparelandinhsolutions.repository;

import com.ironhack.labjavajparelandinhsolutions.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
