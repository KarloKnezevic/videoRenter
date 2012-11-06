package hr.fer.zemris.videorenter.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Member extends Person {

	protected String password;
	protected String memeberShipDate;
	@OneToMany
	protected List<Review> review;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMemeberShipDate() {
		return memeberShipDate;
	}
	
	public void setMemeberShipDate(String memeberShipDate) {
		this.memeberShipDate = memeberShipDate;
	}
	
}
