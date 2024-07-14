package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.ElectricityBill;
import com.excelr.repo.ElectricityBillRepo;

  
@Service
public class ElectricityBillServiceImp implements ElectricityBillService {

	@Autowired private ElectricityBillRepo repo;
	@Override
	public ElectricityBill saveBill(ElectricityBill electricity) {
		int uni=0;
		double tot=0.0,sercharges=120.0;
		uni=(int) (electricity.getCur_reading()-electricity.getPre_reading());
		if(uni<250) {
			tot=uni*1.5;
		}
		else if(uni<=250 && uni>=500) {
			tot=uni*5.5;
		}
		else if(uni>500) {
			tot=uni*10.5;
		}
		electricity.setUnits(uni);
		electricity.setTotal_bill(tot);
		electricity.setService_charges(sercharges);
		return repo.save(electricity);
		 
	}
	@Override
	public ElectricityBill getOneBill(int cid) {
		ElectricityBill getoneRe=repo.findById(cid).get();
		return getoneRe;
	}
	
	@Override
	public List<ElectricityBill> getAllBill() {
		List<ElectricityBill> all=(List<ElectricityBill>) repo.findAll();
		return all;
	}

	@Override
	public void deleteBill(int cid) {
		repo.deleteById(cid);

	}
	@Override
	public ElectricityBill updateBill(ElectricityBill electricity, int cid) {
		ElectricityBill oldRecord=repo.findById(cid).get();
		int uni=0;
		double tot=0.0,sercharges=150.0;
		uni=(int) (electricity.getCur_reading()-electricity.getPre_reading());
		if(uni<250) {
			tot=uni*1.5;
		}
		else if(uni<=250 && uni>=500) {
			tot=uni*5.5;
		}
		else if(uni>500) {
			tot=uni*10.5;
		}
		oldRecord.setCname(electricity.getCname());
		oldRecord.setCur_reading(electricity.getCur_reading());
		oldRecord.setPre_reading(electricity.getPre_reading());
		oldRecord.setUnits(uni);
		oldRecord.setTotal_bill(tot);
		oldRecord.setService_charges(sercharges);
		return repo.save(oldRecord);
		 
	
	}

	

	

	

}
