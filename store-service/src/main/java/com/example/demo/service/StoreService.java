package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.StoreMongoRepository;

import common.beans.Store;
import common.errormessages.ErrorMessages;
import common.result.Result;

@Service
public class StoreService {
	@Autowired
	StoreMongoRepository repo;

	public Result saveStore(Store store) {
		repo.save(store);
		return new Result(200, ErrorMessages.SAVE_SUCCESSFUL);
	}

	public List<Store> getAll(String pinCode) {
		return repo.findByPinCode(pinCode);
	}

}
