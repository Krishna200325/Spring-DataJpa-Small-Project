package com.nit;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Emplyoee")
@Data
public class EmplyoeeEntity {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int age;
    private int salary;
    private String address;
    private String designation;
}
