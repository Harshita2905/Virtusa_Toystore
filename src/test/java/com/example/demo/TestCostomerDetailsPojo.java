package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;

import com.toystore.app.model.CustomerDetails;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestCostomerDetailsPojo {

	
	@MockBean
	CustomerDetails cDetails;
	
	@Test
	public void testDefaultconstructor() {
		cDetails = new CustomerDetails();
		Object expectedObject = new CustomerDetails();
		assertNotEquals(expectedObject, cDetails);
	}
	
	@Test
	public void testCustomerid() {
		cDetails = new CustomerDetails(1,"John", 1234567890,"john@oksbi");
		cDetails.setCid(101);
		assertEquals (true, cDetails.getCid()==101);
	}
	
	@Test
	public void testCustomerName() {
		cDetails = new CustomerDetails(1,"John", 1234567890,"john@oksbi");
		cDetails.setName("jessica");
		assertEquals (true, cDetails.getName()=="jessica");
	}

	@Test
	public void testCustomerPhno() {
		cDetails = new CustomerDetails(1,"John", 1234567890,"john@oksbi");
		cDetails.setPhno(1176543210);
		assertEquals (true, cDetails.getPhno()==1176543210);
	}
	
	@Test
	public void testCustomerUPi() {
		cDetails = new CustomerDetails(1,"John", 1234567890,"jessica@oksbi");
		cDetails.setUpi("john@oksbi");
		assertEquals (true, cDetails.getUpi()=="john@oksbi");
	}


}
