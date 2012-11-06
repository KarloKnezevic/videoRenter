package hr.fer.zemris.videorenter.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	protected long id;
	protected long movieId;
	protected long memberId;
	protected String title;
	protected String content;
	protected int rating;

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
}