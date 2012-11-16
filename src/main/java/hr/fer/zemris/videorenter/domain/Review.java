package hr.fer.zemris.videorenter.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	@ManyToOne
	protected Movie movie;
	@ManyToOne
	protected Member member;
	protected String title;
	protected String content;
	@Size(min = 1, max = 5)
	protected int rating;
	
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
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public long getId() {
		return id;
	}
	
}