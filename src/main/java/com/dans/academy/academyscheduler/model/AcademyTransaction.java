package com.dans.academy.academyscheduler.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "academy_transaction")
public class AcademyTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int academy_id;

    @Column(name = "source")
    private String source;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "created_by")
    private String created_by;

}
