package common.beans;

public class Store {
	private String storeId;
	private String name;
	private Address addressLine1;
	private long phoneNumber;
	private String email;

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(Address addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
