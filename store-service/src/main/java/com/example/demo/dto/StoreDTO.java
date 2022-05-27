package com.example.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import common.beans.Store;

@Document(collection = "storeCollection")
public class StoreDTO extends Store {
	@Id
	private String storeId;
}
