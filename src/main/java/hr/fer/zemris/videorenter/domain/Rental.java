package hr.fer.zemris.videorenter.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rental {
	
	@Id
	protected long id;
	protected long movieId;
	protected long memberId;
	protected String rentalDate;
	protected boolean active;
	
	public String getRentalDate() {
		return rentalDate;
	}
	
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}