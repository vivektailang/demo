package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DemoTestEntity;

@Repository
public interface DemotTestDao extends CrudRepository<DemoTestEntity, String> {
	
}
