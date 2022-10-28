package com.toystore.app.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.toystore.app.model.Products;
import com.toystore.app.service.ProductService;

@RestController
public class ProductController {

	@Autowired 
	ProductService productService;
	
	Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	Products products;
	ModelAndView mView;
	
	@GetMapping("/addproduct")
	public ModelAndView add() {
		mView = new ModelAndView();
		mView.setViewName("ProductAdd");
		return mView;
	}
	
	@PostMapping("/addproduct")
	public ModelAndView addproduct(@ModelAttribute Products products) {
		
		 mView = new ModelAndView();
		 productService.addproduct(products);
		logger.info("Product added successfully!!");
		mView.setViewName("redirect:/admin");
	//	mView.setViewName("index");
		return mView;
	}
	
	
	
	//delete product
	
	@GetMapping("/deleteproduct")
	public ModelAndView delete() {
		 mView = new ModelAndView();
		mView.setViewName("ProductDelete");
		return mView;
	}
	
	@PostMapping("/deleteproduct")
	public ModelAndView deleteproduct(@RequestParam int productid) {
		 mView = new ModelAndView();
		 productService.deleteproduct(productid);
		logger.info("Product deleted successfully!!");
		mView.setViewName("redirect:/admin");
		return mView;
	}
	
	@PostMapping("/deleterow/{productid}")
	public ModelAndView deleterow(@PathVariable int productid) {
		 mView = new ModelAndView();
		 productService.deleterow(productid);
		logger.info("Product deleted successfully!!");
		mView.setViewName("redirect:/viewdata");
		return mView;
	}
	
	
	//update product
	
	@GetMapping("/updateproduct")
	public ModelAndView update() {
		 mView = new ModelAndView();
		mView.setViewName("ProductUpdate");
		return mView;
	}
	
	@PostMapping("/updateproduct")
	public ModelAndView get1product(@RequestParam int productid) {
		 mView = new ModelAndView();
		 products = productService.get1product(productid);
		 logger.info("Product updated successfully!!");
		mView.addObject("products",products);
		mView.setViewName("ProductUpdate");
		return mView;
	}
	@PostMapping("/updateproduct1")
	public ModelAndView updateproduct1(@ModelAttribute Products products) {
		
		mView = new ModelAndView();
		productService.addproduct(products);
		logger.info("Redirect to ProductUpdate.jsp");
		mView.setViewName("redirect:/admin");
		return mView;
	}

	//view Products
	
	@GetMapping("/viewdata")
	public ModelAndView viewProducts() {
		mView= new ModelAndView();
		List<Products> products=productService.viewProducts();
		mView.addObject("products", products);
		mView.setViewName("ProductView");
		return mView;
	}

	
	//View all products
		@PostMapping("/getdata")
		public ModelAndView getdata(@PathVariable int productid) {
			mView = new ModelAndView();
			Optional<Products> products =productService.getdata(productid);
			mView.addObject("products", products);
			mView.setViewName("redirect:/updateproduct");
			return mView;
}

}
