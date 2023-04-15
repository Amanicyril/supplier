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
public class supplier {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO.IDENTITY)
    private long id;

    @Column
    private String lastname;

    @Column
    private int age;
    @Column
    private  String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private  String firstname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
