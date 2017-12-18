package com.project.project.Entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Person {

    protected String name;
    protected String lastname;
    protected String bloodType;
    protected Date birthday;
    protected String phoneNumber;
    protected String email; // CONVERTER TO DO
    protected String adress;
    protected Boolean isActive;

    protected Person(String name, String lastname, String bloodType, Date birthday, String phoneNumber,
                     String email, String adress,Boolean isActive) {
        this.name = name;
        this.lastname = lastname;
        this.bloodType = bloodType;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
        this.isActive = isActive;
    }

}
