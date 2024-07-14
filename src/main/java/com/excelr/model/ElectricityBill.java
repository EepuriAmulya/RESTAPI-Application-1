package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ElectricityBill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private double cur_reading;
	private double pre_reading;	
	private double units;
	private double total_bill;
	private double service_charges;
	ElectricityBill() {
		super();
	}
	ElectricityBill(int cid, String cname, double cur_reading, double pre_reading, double units, double total_bill,
			double service_charges) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cur_reading = cur_reading;
		this.pre_reading = pre_reading;
		this.units = units;
		this.total_bill = total_bill;
		this.service_charges = service_charges;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCur_reading() {
		return cur_reading;
	}
	public void setCur_reading(double cur_reading) {
		this.cur_reading = cur_reading;
	}
	public double getPre_reading() {
		return pre_reading;
	}
	public void setPre_reading(double pre_reading) {
		this.pre_reading = pre_reading;
	}
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	public double getService_charges() {
		return service_charges;
	}
	public void setService_charges(double service_charges) {
		this.service_charges = service_charges;
	}
	@Override
	public String toString() {
		return "ElectricityBill [cid=" + cid + ", cname=" + cname + ", cur_reading=" + cur_reading + ", pre_reading="
				+ pre_reading + ", units=" + units + ", total_bill=" + total_bill + ", service_charges="
				+ service_charges + "]";
	}
	

}
