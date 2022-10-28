package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.model.Products;
import com.toystore.app.repository.ProductRepository;
import com.toystore.app.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProductCntrlr {
	
	@Autowired
	ProductService productService;
	
	@MockBean
	ProductRepository productRepository;

//	@Test
//	public void TestSaveProduct() {
//		Products products = new Products(1, "woody", "softtoy",33,500 );
//		when(productRepository.save(products)).thenReturn(products);
//		assertEquals(products, productService.addproduct(products));
//	}
	
	@Test
	public void testviewdata() {
		
	}

}
