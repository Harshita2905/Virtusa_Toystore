package com.toystore.app.serviceImplementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toystore.app.model.Amount;
import com.toystore.app.model.Cart;
import com.toystore.app.model.CustomerDetails;
import com.toystore.app.model.Feedback;
import com.toystore.app.model.Products;
import com.toystore.app.repository.AmountRepository;
import com.toystore.app.repository.CartRepository;
import com.toystore.app.repository.CustomerDetailsRepository;
import com.toystore.app.repository.FeedbackRepository;
import com.toystore.app.repository.ProductRepository;
import com.toystore.app.service.CustomerService;
@Service
public class CustomerServiceImplementation implements CustomerService {

	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CustomerDetailsRepository cDetailsRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	AmountRepository amountRepository;
	
	
	

	public List<Products> placeorder() {
		
		return productRepository.findAll();
	}

	
	public Cart addToCart(int productid, int quantity) {
		Products products= productRepository.findById(productid).orElse(null);
		int newquantity =products.getProductquantity()-quantity;
		products.setProductquantity(newquantity);
		Cart cart =new Cart(products.getProductname(),products.getProducttype(),quantity,products.getProductprice()*quantity);
		return cartRepository.save(cart);
		
	}

	


}
