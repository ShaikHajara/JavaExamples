package com.java.examples1;

public class SetValues {

	GetterSetter GS;

	public SetValues() {
		GS = new GetterSetter();
		GS.setbankName("HDFC");
		GS.setcardNumber(1239231233);
		GS.setCustomerName("ABDC");
		GS.setID(2);

	}

	public GetterSetter setget() {
		return GS;
	}

}
