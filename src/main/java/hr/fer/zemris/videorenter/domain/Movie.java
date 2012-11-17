package hr.fer.zemris.videorenter.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie implements Serializable {
	
	private static final long serialVersionUID = 8777937546596905465L;
	
	@Id
	protected long id;
	protected long imdbId;
	protected String name; 
	protected String description;
	protected String posterURL;
	protected int copies;

	public long getImdbId() {
		return imdbId;
	}
	
	public long getId() {
		return id;
	}

	public void setImdbId(long imdbId) {
		this.imdbId = imdbId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPosterURL() {
		return posterURL;
	}
	
	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
}