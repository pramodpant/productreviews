package com.demo.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.product.beans.Reviews;
import com.demo.product.repo.ReviewsRepository;

@Service
public class ReviewServiceImplementation implements ReviewsService{

	 private final ReviewsRepository productRepository;
	 
	 @Autowired
	 ReviewServiceImplementation(ReviewsRepository productRepository) {
	        this.productRepository = productRepository;
	   }
	 
	@Override
	public void create(Reviews product) {
		productRepository.save(product);
		
	}

	@Override
	public List <Reviews> findAllReviewsById(String id) {
		// TODO Auto-generated method stub
		
		return productRepository.findAllReviewsById(id);
		
		
	}


	@Override
	public void removeById(String id) {
		// TODO Auto-generated met
		productRepository.deleteById(id);
	}
	
	public List <Reviews> findAllReviews() {
		
		return productRepository.findAll();
		
	}


}
