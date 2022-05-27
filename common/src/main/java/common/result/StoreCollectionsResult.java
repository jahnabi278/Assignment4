package common.result;

import java.util.List;

import common.beans.Store;

public class StoreCollectionsResult extends Result {

	private List<Store> listOfStores;

	public List<Store> getListOfStores() {
		return listOfStores;
	}

	public void setListOfStores(List<Store> listOfStores) {
		this.listOfStores = listOfStores;
	}

}
