package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;
import com.toystore.app.model.Amount;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestAmountPojo {

	@MockBean 
	Amount amount;
	
	@Test
	public void testDefaultconstructor() {
		amount = new Amount();
		Object expectedObject = new Amount();
		assertNotEquals(expectedObject, amount);
	}
	
	@Test
	public void testAmountid() {
		amount = new Amount(1,1000);
		amount.setAid(101);
		assertEquals (true, amount.getAid()==101);
	}
	
	@Test
	public void testAmount() {
		amount = new Amount(1,1000);
		amount.setAmount(amount.getAmount()+2500);
		assertEquals (true, amount.getAmount()==3500);
	}

}
