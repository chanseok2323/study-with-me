package com.chanseok.studywithme.domain;

import jakarta.persistence.*;

@Entity
public class SubjectItem extends BaseEntity {

    @Id
    @Column(name = "subject_item_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "subject_item_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "subject_no")
    private Subject subject;

}
