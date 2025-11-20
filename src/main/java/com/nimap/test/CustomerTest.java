package com.nimap.test;

import com.nimap.pages.AddCustomerPage;

public class CustomerTest {
	@Test(dataProvider="customerData")
	public void addCustomer(String name, String mobile, String email){
	    AddCustomerPage ac = new AddCustomerPage(driver);
	    ac.addCustomer(name, mobile, email);
	}

	@DataProvider
	public Object[][] customerData(){
	    return new Object[][] {
	        {"Ravi Sharma", "9876543210", "ravi@gmail.com"},
	        {"Pooja Singh", "9999988888", "pooja@yahoo.com"}
	    };
	}


}
