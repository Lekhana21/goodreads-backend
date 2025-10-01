package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; //primary key
	private String title;
	private String author;
	private String genre;
	private String rating;
	@Lob //for long texts
	private String description;
	@Lob //tells jpa to store it as TEXT in MYSQL
	private String image;
	
	public Book() {}
	
	public Book(String title, String author, String genre, String rating,String description, String image) {
		this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.image = image;
	}
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setGenre(String genre) {
	        this.genre = genre;
	}
	 public String getGenre() {
	        return genre;
	    }
	 
	 public String getRating() {
	        return rating;
	    }

	    public void setRating(String rating) {
	        this.rating = rating;
	    }
	 
	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }

}
