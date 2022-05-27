package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import common.beans.Store;

@Repository
public interface StoreMongoRepository extends MongoRepository<Store, String> {
	@Query("{addressLine1.pinCode:?0}")
	List<Store> findByPinCode(String pinCode);
}
