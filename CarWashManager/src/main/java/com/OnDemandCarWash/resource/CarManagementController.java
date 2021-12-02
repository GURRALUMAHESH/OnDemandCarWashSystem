package com.OnDemandCarWash.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.CarManagement;
import com.OnDemandCarWash.repository.CarManagementRepository;

//To Manage the cars
@RestController
public class CarManagementController {
	
//To add new cars
	@Autowired
	private CarManagementRepository repository;
	
	@PostMapping("/addCar")
	public int saveBook(@RequestBody CarManagement car) {
		repository.save(car);
		return car.getId();
	}
	
//To find car
	@GetMapping("/findSingleCar/{id}")
	public Optional<CarManagement> getCar(@PathVariable int id){
		return repository.findById(id);
	}
	
//To remove the car
	@DeleteMapping("/deleteCar/{id}")
	public String deleteCar(@PathVariable int id) {
		repository.deleteById(id);
		return "car deleted with id: " +id;
	}
	
//To display all cars
	@GetMapping("/findAllCars")
	public List<CarManagement> getBooks(){
		return repository.findAll();
	}
}
