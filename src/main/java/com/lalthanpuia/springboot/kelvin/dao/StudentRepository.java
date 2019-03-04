package com.lalthanpuia.springboot.kelvin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalthanpuia.springboot.kelvin.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	  List<StudentEntity> findByStandard(String standard);
	  
}





//@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
//@Column(name="id")
//private int id;
//
//@NotEmpty(message="Name field should not be empty")
//@Size(min=2,max=20,message="Length should be in between 2 to 10")
//@Column(name="first_name")
//private String firstName;
//
//@NotEmpty(message="Name field should not be empty")
//@Size(min=2,max=20,message="Length should be in between 2 to 10")
//@Column(name="last_name")
//private String lastName;