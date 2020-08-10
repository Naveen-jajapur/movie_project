package com.cg.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="movie_table")
public class Movie {
	
	@Id
	@Column(name="MOVIEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
	@SequenceGenerator(name="mygen",sequenceName="movie_sequence",allocationSize=1)
	private int movie_id;
	@Column(name="MOVIENAME")
	private String movie_name;
	@Column(name="MOVIEGENRE")
	private String movie_genre;
	@Column(name="MOVIEDIRECTOR")
	private String movie_director;
	@Column(name="MOVIELENGTH")
	private int movie_length;
	@Column(name="MOVIERELEASEDATE")
	private String releaseDate;
//	private String[] languages;
	public Movie(int movie_id, String movie_name, String movie_genre, String movie_director, int movie_length,
			String releaseDate) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_genre = movie_genre;
		this.movie_director = movie_director;
		this.movie_length = movie_length;
		this.releaseDate = releaseDate;
//		this.languages = languages;
	}
	
	public Movie() {
		super();
	}
	public int getMovie_id() {
		return movie_id;
	}
//	public String[] getLanguages() {
//		return languages;
//	}
//
//	public void setLanguages(String[] languages) {
//		this.languages = languages;
//	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getMovie_director() {
		return movie_director;
	}
	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}
	public int getMovie_length() {
		return movie_length;
	}
	public void setMovie_length(int movie_length) {
		this.movie_length = movie_length;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	

}
