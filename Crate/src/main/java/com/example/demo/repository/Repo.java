package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Userentity;

@Repository
public interface Repo extends JpaRepository<Userentity,Integer>{
	

}
