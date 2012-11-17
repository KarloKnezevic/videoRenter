package hr.fer.zemris.videorenter.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Member extends Person {

	private static final long serialVersionUID = 3118032358547530152L;
	
	protected String memeberShipDate;
	@OneToMany
	protected Set<Review> reviews;
	@OneToMany
	protected Set<Rental> rentals;
	
	public String getMemeberShipDate() {
		return memeberShipDate;
	}
	
	public void setMemeberShipDate(String memeberShipDate) {
		this.memeberShipDate = memeberShipDate;
	}
	
	public Set<Review> getReviews() {
		return reviews;
	}
	
	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	public Set<Rental> getRentals() {
		return rentals;
	}
	
	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
	
	
}
