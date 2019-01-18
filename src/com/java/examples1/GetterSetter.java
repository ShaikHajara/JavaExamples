package com.java.examples1;

public class GetterSetter {

	public int id;
	public String customerName;
	private int cardNumber;
	private String bankName;

	public GetterSetter() {
		super();
	}

	public String getBankName() {
		return bankName;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getID() {
		return id;
	}

	public void setbankName(String name) {
		bankName = name;
	}

	public void setcardNumber(int cardNo) {
		cardNumber = cardNo;
	}

	public void setCustomerName(String name1) {
		customerName = name1;
	}

	public void setID(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GetterSetter [id=" + id + ", customerName=" + customerName + ", cardNumber=" + cardNumber
				+ ", bankName=" + bankName + "]";
	}

}
