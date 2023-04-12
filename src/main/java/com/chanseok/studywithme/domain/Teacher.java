package com.chanseok.studywithme.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Teacher extends BaseEntity {

    @Id
    @Column(name = "teacher_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @OneToOne
    @JoinColumn(name = "member_no")
    private Member member;

}
