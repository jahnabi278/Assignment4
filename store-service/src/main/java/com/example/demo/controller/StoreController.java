package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StoreService;

import common.beans.Store;
import common.errormessages.ErrorMessages;
import common.result.Result;
import common.result.StoreCollectionsResult;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreService storeService;

	@PostMapping
	public Result createStore(@RequestBody Store store) {
		return storeService.saveStore(store);
	}

	@GetMapping("/{pinCode}")
	public StoreCollectionsResult getStores(@PathVariable String pinCode) {
		StoreCollectionsResult result = new StoreCollectionsResult();
		List<Store> listOfStores = storeService.getAll(pinCode);
		if (!listOfStores.isEmpty()) {
			result.setErrorCode(200);
			result.setErrorMessage(ErrorMessages.RETRIEVE_SUCCESSFUL);
			result.setListOfStores(listOfStores);
		} else {
			result.setErrorCode(404);
			result.setErrorMessage(ErrorMessages.NOT_FOUND);
			result.setListOfStores(null);
		}
		return result;
	}
}
