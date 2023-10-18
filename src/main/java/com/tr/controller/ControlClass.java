package com.tr.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tr.Model.EmpData;
import com.tr.service.GetDataClass;

@Controller
public class ControlClass {

	
	@Autowired
	private GetDataClass gdc;
	
	@RequestMapping("/")
	public String Get() {
		return "home";
	}
	
	public String GetData(Map<String,Object>m) {
	     Iterable<EmpData>i=gdc.GetData();
	     m.put("Val", i);
	     return "Data";
	}
	
	@RequestMapping("/getD")
	public String addData(Map<String,Object>map,@ModelAttribute("ed")EmpData ed) {
		 
		return "";	
		}
	
}
