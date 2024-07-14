package com.excelr.service;

import java.util.List;

import com.excelr.model.ElectricityBill;

public interface ElectricityBillService {
	
	public ElectricityBill saveBill(ElectricityBill electricity);
	public ElectricityBill updateBill(ElectricityBill electricity,int cid);
	public ElectricityBill getOneBill(int cid);
	public void deleteBill(int cid);
	public List<ElectricityBill> getAllBill();

}
