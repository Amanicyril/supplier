package com.amanicb.apps.rest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="suppliers")
public class  supplier {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private String first_name;

    @Column(name = "last_name")
    private  String last_name;

    @Column(name = "gender")
    private String gender;

    @Column (name="age")
    private int age;

    public long getId() {
        return id;
    }
}



