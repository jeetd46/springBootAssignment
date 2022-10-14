package com.spring.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoadDetails {
	
	@Id
	private String shipperId;
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	private String comment;
	private String date;
	
	public LoadDetails(String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks,
			String weight, String comment, String shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	public LoadDetails() {
		super();
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public String getComment() {
		return comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
	
}
