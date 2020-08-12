package com.cg.movie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description      It is an Entity class of Theatre and is mapped with the  DataBase
 *                                       of table THEATRE_TBL.
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/
@Entity
@Table(name="THEATRE_TBL")
public class Theatre {
	@Id
	@Column(name="THEATREID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
	@SequenceGenerator(name="mygen",sequenceName="theatre",allocationSize=1)
	private int theatre_id;
	
	@Column(name="THEATRENAME")
	private String theatre_name;
	
	@Column(name="THEATRECITY")
	private String theatre_city;
	
	@Column(name="MANAGERNAME")
	private String manager_name;
	
	@Column(name="MANAGERCONTACT")
	private String manager_contact;
	
	@ManyToOne
	@JoinColumn(name="MOVIEID")
	private Movie movie_id;
	
	@OneToMany(mappedBy = "movie_id")
	@JsonIgnore
	List<Movie> listOfMovies = new ArrayList<>();
	@OneToMany(mappedBy = "screen_id")
	@JsonIgnore
	List<Screen> listOfScreens = new ArrayList<>();
//	private Movie listOfMoviesMovie;
//	private Screen listOfScreens;

	public Theatre(int theatre_id, String theatre_name, String theatre_city, String manager_name,
			String manager_contact, Movie movie_id) {
		super();
		this.theatre_id = theatre_id;
		this.theatre_name = theatre_name;
		this.theatre_city = theatre_city;
		this.manager_name = manager_name;
		this.manager_contact = manager_contact;
		this.movie_id = movie_id;
	}

	public Theatre() {
		super();
	}

	public int getTheatre_id() {
		return theatre_id;
	}

	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public String getTheatre_city() {
		return theatre_city;
	}

	public void setTheatre_city(String theatre_city) {
		this.theatre_city = theatre_city;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getManager_contact() {
		return manager_contact;
	}

	public void setManager_contact(String manager_contact) {
		this.manager_contact = manager_contact;
	}

	public Movie getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Movie movie_id) {
		this.movie_id = movie_id;
	}
	
	
	
	
	

}
