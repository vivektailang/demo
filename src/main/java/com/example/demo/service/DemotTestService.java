package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemotTestDao;
import com.example.demo.entity.DemoTestEntity;

@Service
public class DemotTestService {
	@Autowired
	private DemotTestDao demotTestDao;
	
	public List<DemoTestEntity> getDemoTestRecords() {
		List<DemoTestEntity> results = new ArrayList<>();
		
		Iterable<DemoTestEntity> itrDemo = this.demotTestDao.findAll();
		
		for (DemoTestEntity demoTestEntity : itrDemo) {
			results.add(demoTestEntity);
		}
		
		return results;
	}
	
}
