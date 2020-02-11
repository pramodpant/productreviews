package com.demo.product.beans;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_reviews")
public class Reviews {

	//@Id
	/*
	 * 
	 * { "id":"7",
    "prodName":"Nokia 250",
    "prodDesc":"Black, 4GB RAM, 32GB Storage",
    "prodPrice":"2000.00",
	"prodImage":"not available",
    "operatingSystem":"WIndows Pie",
    "memory":"2 GB RAM",
    "batteries":"1 Lithium ion batteries required. (included)"
}
	 * 
	 */
    private String productId;
	private String prodName;
	private String prodDesc;
	private String review_comments;
	
	private String prodImage;
	private String operatingSystem;
	private String prodPrice;
	private String memory;
	private String batteries;
	
	
	

	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getBatteries() {
		return batteries;
	}
	public void setBatteries(String batteries) {
		this.batteries = batteries;
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
	public String getReview_comments() {
		return review_comments;
	}
	public void setReview_comments(String review_comments) {
		this.review_comments = review_comments;
	}

   


}


