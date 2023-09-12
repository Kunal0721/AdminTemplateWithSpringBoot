package com.springboot.Admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Admin.model.VehicleModel;
import com.springboot.Admin.repository.VehicleModelRepository;

@Service
public class VehicleModelService {
	
	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	//Get All VehicleModels
	public List<VehicleModel> findAll(){
		return vehicleModelRepository.findAll();
	}	
	
	//Get VehicleModel By Id
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
	}	
	
	//Delete VehicleModel
	public void delete(int id) {
		vehicleModelRepository.deleteById(id);
	}
	
	//Update VehicleModel
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}

}
