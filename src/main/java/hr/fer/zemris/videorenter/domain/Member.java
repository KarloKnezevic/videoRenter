package hr.fer.zemris.videorenter.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Member extends Person {

	protected String memeberShipDate;
	@OneToMany
	protected List<Review> review;
	@OneToMany
	protected List<Rental> rentals;
	
	public String getMemeberShipDate() {
		return memeberShipDate;
	}
	
	public void setMemeberShipDate(String memeberShipDate) {
		this.memeberShipDate = memeberShipDate;
	}
	
	public List<Review> getReview() {
		return review;
	}
	
	public void setReview(List<Review> review) {
		this.review = review;
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}
	
	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	
	
}
