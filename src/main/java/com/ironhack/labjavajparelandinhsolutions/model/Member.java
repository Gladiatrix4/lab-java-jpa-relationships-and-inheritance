package com.ironhack.labjavajparelandinhsolutions.model;

import com.ironhack.labjavajparelandinhsolutions.enums.MemberStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id")
    private Long id;

    @Column(name="member_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="member_status")
    private MemberStatus memberStatus;

    @Column(name="renewal_date")
    private LocalDate renewalDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="division_id")
    private Division division;

    @OneToOne(mappedBy = "president")
    private Division divisionPresident;

    public Member(){
    }

    public Member(String name, MemberStatus memberStatus, LocalDate renewalDate, Division division, Division divisionPresident) {
        this.name = name;
        this.memberStatus = memberStatus;
        this.renewalDate = renewalDate;
        this.division = division;
        this.divisionPresident = divisionPresident;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Division getDivisionPresident() {
        return divisionPresident;
    }

    public void setDivisionPresident(Division divisionPresident) {
        this.divisionPresident = divisionPresident;
    }
}