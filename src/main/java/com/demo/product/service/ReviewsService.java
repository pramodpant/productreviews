package com.demo.product.service;


import java.util.List;
import java.util.Optional;

import com.demo.product.beans.Reviews;;

public interface ReviewsService {
	
	void create(Reviews todo);
	
	List <Reviews> findAllReviewsById(String id);
	void removeById(String id);
	
	List <Reviews> findAllReviews();
}
