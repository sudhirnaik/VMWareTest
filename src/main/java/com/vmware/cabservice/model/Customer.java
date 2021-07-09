package com.vmware.cabservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;
    private String name;


    protected Customer() {}
}
