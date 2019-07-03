package com.spring.example.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.spring.example.dto.FruitDTO;

@Repository
public class FruitDB {
	private List<FruitDTO> fruits;
	
	public FruitDB() {
		// TODO Auto-generated constructor stub
		this.fruits = new ArrayList<FruitDTO>();
		FruitDTO fruitDTO = new FruitDTO();
		fruitDTO.setName("apple");
		this.fruits.add(fruitDTO);
	}
	
	public void CREATE(FruitDTO fruitDTO) {
		this.fruits.add(fruitDTO);
	}
	
	public void DELETE(FruitDTO fruitDTO) {
		for(int i = 0 ; i < this.fruits.size(); i++) {
			if(fruits.get(i).getName() == fruitDTO.getName()) {
				fruits.remove(i);
			}
		}
	}
	public List<FruitDTO> SELECT(){
		return this.fruits;
	}
}
