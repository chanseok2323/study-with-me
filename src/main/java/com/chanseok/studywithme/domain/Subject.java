package com.chanseok.studywithme.domain;

import jakarta.persistence.*;

@Entity
public class Subject extends BaseEntity {

    @Id
    @Column(name = "subject_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "subject_name")
    private String name;

}
