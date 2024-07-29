package com.ict.day11;

public class Ex13 {
	private String title;
	private String review;
	int count;
	private boolean live;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public boolean isLive() {
		return live;
	}
	@Override
	public String toString() {
		return "singer: " + title + ", 리뷰: " + review;
	}
	
}
