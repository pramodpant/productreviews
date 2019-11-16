package com.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.product.beans.Reviews;
import com.demo.product.service.ReviewsService;


@SpringBootApplication
@RestController
@RequestMapping("/reviews")
public class ReviewApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	
	@Autowired	
	ReviewsService productServiceImplementation;
	 
	 
	 @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, value="/submit")
	    public void create(@RequestBody Reviews product) {
		 productServiceImplementation.create(product);
	    }
	
	 
	
	 @RequestMapping(method=RequestMethod.GET, value="/show/{id}")
	    public List <Reviews> getReview(@PathVariable String id) {
	        return productServiceImplementation.findAllReviewsById(id);
	    }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/remove/{id}")
	    public void remove(@PathVariable String id) {
	         productServiceImplementation.removeById(id);
	    }
	 
	 	@ExceptionHandler
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public void handleTodoNotFound(Exception ex) {
	       System.out.println(ex.getMessage());
	}
	 	
}