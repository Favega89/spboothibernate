package com.project.project.Entities;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="clients")
public class Client extends Person implements Serializable{

    private int id;
    private int idrate;
    private Date firstClassDate;
    private Date lastClassDate;

    public Client(String name, String lastname, String bloodType, Date birthday, String phoneNumber, String email, String adress, Boolean isActive,int id, int idrate, Date firstClassDate, Date lastClassDate) {
        super(name, lastname, bloodType, birthday, phoneNumber, email, adress, isActive);
        this.setId(id);
        this.idrate=idrate;
        this.setFirstClassDate(firstClassDate);
        this.setLastClassDate(lastClassDate);
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable=false,unique = true, name= "id")
    public int getId() {
        return id;
    }

    @Column(name="idrate", nullable=false)
    public int getIdRate() {
        return this.idrate;
    }

    @Column(name="firstClass", nullable=false)
    public Date getFirstClassDate() {
        return firstClassDate;
    }

    @Column(name="lastClass", nullable=false)
    public Date getLastClassDate() {
        return lastClassDate;
    }

    @Column(name="status", nullable=false)
    public Boolean getIsActive() {
        return isActive;
    }


    // super getters
    @Column(name="firstName", nullable=false)
    public String getName() {
        return super.name;
    }

    @Column(name="lastName" ,nullable=false)
    public String getLastname() {
        return super.lastname;
    }

    @Column(name="bloodtype", nullable=false)
    public String getBloodType() {
        return super.bloodType;
    }

    @Column(name="birthdayDate",nullable = false)
    public Date getBirthday() {
        return super.birthday;
    }

    @Column(name="phoneNumber")
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Column(name="email")
    public String getEmail() {
        return super.email;
    }

    @Column(name="adress")
    public String getAdress() {
        return super.adress;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setIdRate(int idrate) {
        this.idrate = idrate;
    }

    public void setFirstClassDate(Date firstClassDate) {
        this.firstClassDate = firstClassDate;
    }

    public void setLastClassDate(Date lastClassDate) {
        this.lastClassDate = lastClassDate;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setLastname(String lastname) {
        super.lastname = lastname;
    }

    public void setBloodtype(String bloodtype) {
        super.bloodType = bloodtype;
    }

    public void setBirthday(Date birthday) {
        super.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        super.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public void setAdress(String adress) {
        super.adress = adress;
    }

    public void setActive(Boolean status) {
        super.isActive = status;
    }

}
