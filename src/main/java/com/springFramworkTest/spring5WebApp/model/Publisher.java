package com.springFramworkTest.spring5WebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;
    private String adress;

    public Publisher(String companyName, String adress) {
        this.companyName = companyName;
        this.adress = adress;
    }

    public Publisher() {
    }

    public String getCompantName() {
        return companyName;
    }

    public void setCompantName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
