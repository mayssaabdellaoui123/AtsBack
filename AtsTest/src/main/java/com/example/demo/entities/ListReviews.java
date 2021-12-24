package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

public class ListReviews implements Serializable {
	List<Reviews> list ;

	public List<Reviews> getList() {
		return list;
	}

	public void setList(List<Reviews> list) {
		this.list = list;
	} 

	
}
