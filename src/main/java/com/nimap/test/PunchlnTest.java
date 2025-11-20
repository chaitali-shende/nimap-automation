package com.nimap.test;

import com.nimap.pages.DashboardPage;

public class PunchlnTest {
	@Test
	public void verifyPunchInToast(){
	    DashboardPage dash = new DashboardPage(driver);
	    dash.clickPunchIn();

	    String toast = dash.getToastMessage();
	    Assert.assertEquals(toast, "Punch In Successful");
	}


}
