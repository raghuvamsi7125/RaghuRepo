package com.tr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tr.Inter.RepoInter;
import com.tr.Model.EmpData;

@Component("g")
public class GetDataClass {

	@Autowired
	private RepoInter ri;
	
	public Iterable<EmpData> GetData() {
		   Iterable<EmpData>i=ri.findAll();
		   return i;
	}
	
	public EmpData addEmp(EmpData ed) {
           EmpData ed1=ri.save(ed);
           return ed1;
	}
}