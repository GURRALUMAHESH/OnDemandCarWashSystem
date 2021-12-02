package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.CarManagement;

public interface CarManagementRepository extends MongoRepository<CarManagement,Integer> {

}
