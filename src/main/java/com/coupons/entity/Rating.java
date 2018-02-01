package com.coupons.entity;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Rating {
	
	@Id
	private int RatingId;
	
	private int upvotes;
	
	private int downvotes;

	public int getRatingId() {
		return RatingId;
	}

	public void setRatingId(int ratingId) {
		RatingId = ratingId;
	}

	public int getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}

	public int getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}
	
	

}
