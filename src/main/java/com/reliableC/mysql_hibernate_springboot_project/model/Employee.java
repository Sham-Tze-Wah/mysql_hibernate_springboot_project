package com.reliableC.mysql_hibernate_springboot_project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;


@Data //Equivalent to code, getter, setter and constructor and tostring, equals, hashcode
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //specifies the generation strategies for the values of primary keys
    private long id;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email", nullable=false)
    private String email;


}
