package com.demo.product.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.demo.product.beans.Reviews;


public interface ReviewsRepository extends MongoRepository<Reviews, String> {
   
	
	
	@Query(value="{ 'productId' : ?0 }")
	List<Reviews> findAllReviewsById(String id);
}
    
   
