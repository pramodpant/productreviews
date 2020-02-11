package com.demo;



import java.util.ArrayList;
import java.util.List;

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

import com.demo.product.beans.ReviewResponse;
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
	    public void create(@RequestBody Reviews reviews) {
		   System.out.println("Inserting for Product ID "+reviews.getProductId());
		   productServiceImplementation.create(reviews);
	    }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/show/{id}")
	    public List <ReviewResponse> getReview(@PathVariable String id) {
		    
		    List <ReviewResponse>  reviewComments = new ArrayList<ReviewResponse>(); 
		    
	        List<Reviews> reviews = productServiceImplementation.findAllReviewsById(id);
	        
	        for(int i=0;i<reviews.size();i++) {
	        	
	        	ReviewResponse reviewResponse = new ReviewResponse();
	        	System.out.println("product id ->"+reviews.get(i).getProductId());
	        	
	        	reviewResponse.setProdName(reviews.get(i).getProdName());
	        	reviewResponse.setProdDesc(reviews.get(i).getProdDesc());
	        	reviewResponse.setReview_comments(reviews.get(i).getReview_comments());
	        	reviewResponse.setProductId(reviews.get(i).getProductId());
	        	
	        	reviewComments.add(reviewResponse);
	        }
	        
	        
	        return reviewComments;
 
	        
	        
	    }
	
	 @RequestMapping(method=RequestMethod.GET, value="/greet/{name}")
	    public String greetMe(@PathVariable String name) {
	        return "hello "+name+" from v1";
	    }
	
	 	@ExceptionHandler
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public void handleTodoNotFound(Exception ex) {
	       System.out.println(ex.getMessage());
	}
	 	
}