package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;
import com.toystore.app.model.Cart;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestCartPojo {

	@MockBean
	Cart cart;
	
	@Test
	public void testCartid() {
		cart = new Cart(1,"Woody","softtoy", 2,299);
		cart.setCid(101);
		assertEquals (true, cart.getCid()==101);
	}
	
	@Test
	public void testCartProductName() {
		cart = new Cart(1,"Woody","softtoy", 2,299);
		cart.setCname("jessie");
		assertEquals (true, cart.getCname()=="jessie");
	}
	
	@Test
	public void testCartProductType() {
		cart = new Cart(1,"Woody","softtoy", 2,299);
		cart.setCtype("plastictoy");
		assertEquals (true, cart.getCtype()=="plastictoy");
	}
	
	@Test
	public void testCartProductQuantity() {
		cart = new Cart(1,"Woody","softtoy", 2,299);
		cart.setQuantity(1);
		assertEquals (true, cart.getQuantity()==1);
	}
	
	@Test
	public void testCartProductPrice() {
		cart = new Cart(1,"Woody","softtoy", 2,299);
		cart.setCprice(500);
		assertEquals (true, cart.getCprice()==500);
	}
	
	@Test
	public void testDefaultconstructor() {
		cart = new Cart();
		Object expectedObject = new Cart();
		assertNotEquals(expectedObject, cart);
	}
	
	
	
	
	@Test
	public void testconstructor() {
		cart = new Cart(1,"Woody","softtoy", 2,500);
		assertEquals(1,cart.getCid());
		assertEquals("Woody",cart.getCname());
		assertEquals("softtoy",cart.getCtype());
		assertEquals(2,cart.getQuantity());
		assertEquals(500, cart.getCprice());
		
		}
	
	
	

}
