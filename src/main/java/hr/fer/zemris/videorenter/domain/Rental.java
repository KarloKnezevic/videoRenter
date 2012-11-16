package hr.fer.zemris.videorenter.domain;

import javax.persistence.*;

@Entity
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	@ManyToOne
	protected Movie movie;
	@ManyToOne
	protected Member member;
	protected String rentalDate;
	protected boolean active;
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member = member;
	}
	
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
	
	public long getId() {
		return id;
	}
	
}