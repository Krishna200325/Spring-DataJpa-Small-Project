package com.nit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.spring.Emplyoee;

@Repository 
public interface EmpRepository extends  JpaRepository<EmplyoeeEntity,Integer> {


        List<EmplyoeeEntity> findByAgeIs(int age);

        List<EmplyoeeEntity>findByAgeBetween(int start ,int end);

        List<EmplyoeeEntity> findByDesignationOrDesignation(String s1,String s2);
        

}
