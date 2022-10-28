package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.toystore.app.ToyStoreApplication;

import com.toystore.app.model.Feedback;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToyStoreApplication.class)
public class TestFeedbackPojo {

	
	@MockBean
	Feedback feedback;
	
	@Test
	public void testDefaultconstructor() {
		feedback = new Feedback();
		Object expectedObject = new Feedback();
		assertNotEquals(expectedObject, feedback);
	}
	
	@Test
	public void testFeedbackid() {
		feedback = new Feedback(1,"John","john@gmail.com","must buy products are here");
		feedback.setFid(101);
		assertEquals (true, feedback.getFid()==101);
	}
	
	@Test
	public void testName() {
		feedback = new Feedback(1,"John","john@gmail.com","must buy products are here");
		feedback.setName("Jessica");
		assertEquals (true, feedback.getName()=="Jessica");
	}
	
	@Test
	public void testMail() {
		feedback = new Feedback(1,"John","jessica@gmail.com","must buy products are here");
		feedback.setMail("john@gmail.com");
		assertEquals (true, feedback.getMail()=="john@gmail.com");
	}
	@Test
	public void testMessage() {
		feedback = new Feedback(1,"John","john@gmail.com","must buy products are here");
		feedback.setMessage("Good product Quality");
		assertEquals (true, feedback.getMessage()=="Good product Quality");
	}

}
