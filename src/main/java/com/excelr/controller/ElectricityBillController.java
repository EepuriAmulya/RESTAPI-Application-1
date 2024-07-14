package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.ElectricityBill;
import com.excelr.service.ElectricityBillService;


@RestController
public class ElectricityBillController {

	@Autowired private ElectricityBillService service;
	
	@PostMapping("/save")
	public String saveData(@RequestBody ElectricityBill electricity) {
		
		ElectricityBill savebilldata=service.saveBill(electricity);
		String message=null;
		if(savebilldata!=null) {
			message="Data Saved Succesfully...";
		}
		else {
			message="Data Not Saved....";
		}		
		return message;
		
	}	
	@GetMapping("getone/{cid}")
	public ElectricityBill getOneRecord(@PathVariable int cid) {
		ElectricityBill getone=service.getOneBill(cid);
		return getone;
	
	}
	
	@GetMapping("getall")
	public List<ElectricityBill> getAllRecords() {
		List<ElectricityBill> getall=service.getAllBill();
		return getall;
	}
	
	@DeleteMapping("delete/{cid}")
	public void deleteRecord(@PathVariable int cid) {
		service.deleteBill(cid);
	}
	
	@PutMapping("update/{cid}")
	public ElectricityBill updaterecord(@RequestBody ElectricityBill electricity,@PathVariable int cid) {
		ElectricityBill update=service.updateBill(electricity, cid);
		return update;
	}
}
