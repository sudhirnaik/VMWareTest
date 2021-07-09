package com.vmware.cabservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cab {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;
    private String brand;
    private String yearOfModel;
    private boolean isBooked;
    private String Location;

    @Override
    public String toString() {
        return "Cab{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", yearOfModel='" + yearOfModel + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(String yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
