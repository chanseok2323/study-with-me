package com.chanseok.studywithme.domain;

import jakarta.persistence.*;

@Entity
public class Student extends BaseEntity {

    @Id
    @Column(name = "student_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @OneToOne
    @JoinColumn(name = "member_no")
    private Member member;
}
