package com.nit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.spring.Emplyoee;

@Service 
public class EmplyoeeService {
        
        
        @Autowired
        private EmpRepository repository;

        public void insertEmp(List<EmplyoeeEntity> emp){
                repository.saveAll(emp);
        }

        
        public  void getEmplyoeeAge(int age){
                
        List<EmplyoeeEntity> num =  repository.findByAgeIs(age);
        for(EmplyoeeEntity agee : num){
                System.out.println(agee);
        }
        }

        public void getAgeBetween(int start,int end){
                List<EmplyoeeEntity> emp =repository.findByAgeBetween(start, end);

                for(EmplyoeeEntity age: emp){
                        System.out.println(age);
                }
        }
        public void findDesignationBy(String s1,String s2){
               List<EmplyoeeEntity> list = repository.findByDesignationOrDesignation(s1, s2);
                 
               for(EmplyoeeEntity name: list){

                System.out.println(name);
               }
        
        }

}
