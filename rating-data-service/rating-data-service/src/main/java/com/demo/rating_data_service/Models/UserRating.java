package com.demo.rating_data_service.Models;

import java.util.List;

public class UserRating {
	//private String userId;
	private List<Rating> ratings;
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public UserRating(List<Rating> ratings) {
		super();
		//this.userId = userId;
		this.ratings = ratings;
	}
	
}
