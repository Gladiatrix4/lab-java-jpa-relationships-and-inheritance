package com.ironhack.labjavajparelandinhsolutions.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="division_id")
    private Long id;

    @Column(name="division_name")
    private String name;

    @Column(name="division_district")
    private String district;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="association_id")
    private Association association;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="president_id")
    private Member president;

    @OneToMany(mappedBy = "division",fetch = FetchType.LAZY)
    private List<Member> members;

    public Division(){
    }

    public Division(String name, String district, Association association, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.association = association;
        this.president = president;
        this.members = members;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

}
