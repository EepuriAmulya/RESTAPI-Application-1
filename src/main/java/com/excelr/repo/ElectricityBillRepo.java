package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.ElectricityBill;

@Repository
public interface ElectricityBillRepo extends CrudRepository<ElectricityBill, Integer> {

}
