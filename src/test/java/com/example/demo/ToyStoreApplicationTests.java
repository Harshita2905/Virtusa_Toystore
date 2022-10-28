package com.example.demo;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.toystore.app.ToyStoreApplication;
import com.toystore.app.model.Products;
import com.toystore.app.model.Response;
import com.toystore.app.repository.ProductRepository;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class ToyStoreApplicationTests {
	
	
private MockMvc mockMvc;
	
	
	@Autowired
	private WebApplicationContext context;
	
	@MockBean
	ProductRepository productRepository;
	
	ObjectMapper om = new ObjectMapper();
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	
	@Test
	public void addProductTest() throws Exception {
		Products products = new Products();
//		//products.setProductid(101);
		products.setProductname("Woody");
		products.setProducttype("softtoy");
		products.setProductquantity(20);
		products.setProductprice(200.0f);
//		Products products = new Products(101,"Rex", "plastictoy",10,299.0f);
		String jsonRequest = om.writeValueAsString(products);
		MvcResult result = mockMvc.perform(post("/addproduct").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().is(200)).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}
}
