package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;

import com.toystore.app.model.Products;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestProductPojo {

	@MockBean
	Products products;
	
	@Test
	public void testDefaultconstructor() {
		products = new Products();
		Object expectedObject = new Products();
		assertNotEquals(expectedObject, products);
	}
	
	
	@Test
	public void testProductname() {
		products = new Products(101,"woody", "plastictoy",10,299.0f);
		products.setProductname("Rex");
//		assertTrue(products.getProductname()=="Rex");
		assertEquals (true, products.getProductname()=="Rex");
	}
	
	@Test
	public void testproductname1() {
		products = new Products(101,"Rex", "plastictoy",10,299.0f);
		assertEquals("Rex", products.getProductname());
	}

	@Test
	public void testProductid() {
		products = new Products(101,"woody", "plastictoy",10,299.0f);
		products.setProductid(111);
		assertEquals (true, products.getProductid()==111);
	}
	
	@Test
	public void testProducttype() {
		products = new Products(101,"woody", "plastictoy",10,299.0f);
		products.setProducttype("softtoy");
		assertEquals (true, products.getProducttype()=="softtoy");
	}
	
	@Test
	public void testProductquantity() {
		products = new Products(101,"woody", "plastictoy",10,299.0f);
		products.setProductquantity(20);
		assertEquals (true, products.getProductquantity()==20);
	}
	
	@Test
	public void testProductprice() {
		products = new Products(101,"woody", "plastictoy",10,299.0f);
		products.setProductprice(500);
		assertEquals (true, products.getProductprice()==500);
	}
}
