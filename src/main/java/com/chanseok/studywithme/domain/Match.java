package com.chanseok.studywithme.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "matches")
public class Match extends BaseEntity {

    @Id
    @Column(name = "match_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne
    @JoinColumn(name = "teacher_no")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "student_no")
    private Student student;

}
