package com.model2.mvc.service.domain;

import java.sql.Date;


public class Product {
	
	private String imageFile;
	private String manufactureDay;
	private int price;
	private String prodDetail;
	private String prodName;
	private int prodNo;
	private Date regDate;
	private String proTranCode;
	private String regDateString;
	
	public Product(){
	}
	
	public String getProTranCode() {
		return proTranCode;
	}
	public void setProTranCode(String proTranCode) {
		this.proTranCode = proTranCode;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	public String getManufactureDay() {
		return manufactureDay;
	}
	public void setManufactureDay(String manufactureDay) {
		this.manufactureDay = manufactureDay;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	
	if(regDate !=null) {
		// JSON ==> Domain Object  Binding을 위해 추가된 부분
		this.setRegDateString( regDate.toString().split("-")[0]
												+"-"+ regDate.toString().split("-")[1]
												+ "-" +regDate.toString().split("-")[2] );
	}
	
}	

	// Override
	public String toString() {
		return "ProductVO : [imageFile]" + imageFile
				+ "[manufactureDay]" + manufactureDay+ "[price]" + price + "[prodDetail]" + prodDetail
				+ "[prodName]" + prodName + "[prodNo]" + prodNo;
	}	


	public String getRegDateString() {
		return regDateString;
	}
	
	public void setRegDateString(String regDateString) {
		this.regDateString = regDateString;
	}
}



