package com.ironhack.labjavajparelandinhsolutions.repository;

import com.ironhack.labjavajparelandinhsolutions.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
