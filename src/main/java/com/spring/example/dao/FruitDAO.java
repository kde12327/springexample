package com.spring.example.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.spring.example.db.FruitDB;
import com.spring.example.dto.FruitDTO;

@Repository
public class FruitDAO {
	
	FruitDB db;
	
	private static final Logger log = LoggerFactory.getLogger(FruitDAO.class);
	
	@Autowired
	public FruitDAO(FruitDB db) {
		// TODO Auto-generated constructor stub
		this.db = db;
	}
	
	public void fruitInsert(FruitDTO fruitDTO) {
		db.CREATE(fruitDTO);
	}
	public void fruitDelete(FruitDTO fruitDTO) {
		db.DELETE(fruitDTO);
	}
	public List<FruitDTO> fruitSelect() {
		List<FruitDTO> fruits = db.SELECT();
		if(fruits != null) {
			log.info("FruitDAO Log - {} fruits are selected including '{}' , etc.", fruits.size(), fruits.get(0).getName());
		}else {
			log.error("FruitDAO Log - Fruits aren't selected.");
		}
		return db.SELECT();
	}
}
