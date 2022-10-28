package com.example.demo;

import com.toystore.app.model.Response;




import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import com.fasterxml.jackson.databind.ObjectMapper;

import com.toystore.app.model.Products;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController1 {

	private MockMvc mockMvc;
	
	
	@Autowired
	private WebApplicationContext context;
	

	ObjectMapper om = new ObjectMapper();
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void addProductTest() throws Exception {
		Products products = new Products();
		
		products.setProductname("Woody");
		products.setProducttype("softtoy");
		products.setProductquantity(20);
		products.setProductprice(200.0f);
		String jsonRequest = om.writeValueAsString(products);
		MvcResult result = mockMvc.perform(post("/addproduct").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().is(302)).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
