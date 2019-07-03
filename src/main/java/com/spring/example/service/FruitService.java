package com.spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.dao.FruitDAO;
import com.spring.example.dto.FruitDTO;

@Service
public class FruitService {
	
	FruitDAO dao;
	
	@Autowired
	public FruitService(FruitDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	
	public void fruitRegister(FruitDTO fruitDTO) {
		dao.fruitInsert(fruitDTO);
	}
	
	public void fruitRemove(FruitDTO fruitDTO) {
		dao.fruitDelete(fruitDTO);
	}
	
	public List<FruitDTO> fruitSearch() {
		return dao.fruitSelect();
	}
}
