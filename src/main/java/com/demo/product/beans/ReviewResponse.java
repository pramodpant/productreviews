package com.demo.product.beans;

public class ReviewResponse {
	
	
	 private String productId;
     private String prodName;
     private String prodDesc;
	 private String review_comments;

	public String getReview_comments() {
		return review_comments;
	}

	public void setReview_comments(String review_comments) {
		this.review_comments = review_comments;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	
	

}
