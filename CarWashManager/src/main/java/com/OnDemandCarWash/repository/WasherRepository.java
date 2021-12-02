package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.Washer;

public interface WasherRepository extends MongoRepository<Washer,Integer> {

}
