package com.cg.movie.entity;

import java.time.LocalDate;
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
@Entity
@Table(name="show_tbl")
public class Show {
	
	@Id
	@Column(name="showId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
	@SequenceGenerator(name="mygen",sequenceName="show_seq",allocationSize=1)
	private int show_id;
	
	
	@Column(name="theatreId")
	private int theatre_id;
	@Column(name="movieName")
	private String movie_name;
	@Column(name="showName")
	private String show_name;
	@Column(name="showStartTime")
	private LocalDate show_start_time;
	@Column(name="showEndTime")
	private LocalDate show_end_time;
	@ManyToOne
	@JoinColumn(name="seatId")
	private Seat seat_id;
	
	@OneToMany(mappedBy = "seat_id")
	@JsonIgnore
	List<Seat> listOfSeats = new ArrayList<>();
	public Show(int show_id, int theatre_id, String movie_name, String show_name, LocalDate show_start_time,
			LocalDate show_end_time, Seat seat_id) {
		super();
		this.show_id = show_id;
		this.theatre_id = theatre_id;
		this.movie_name = movie_name;
		this.show_name = show_name;
		this.show_start_time = show_start_time;
		this.show_end_time = show_end_time;
		this.seat_id = seat_id;
	}
	public Show() {
		super();
	}
	public int getShow_id() {
		return show_id;
	}
	public void setShow_id(int show_id) {
		this.show_id = show_id;
	}
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getShow_name() {
		return show_name;
	}
	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}
	public LocalDate getShow_start_time() {
		return show_start_time;
	}
	public void setShow_start_time(LocalDate show_start_time) {
		this.show_start_time = show_start_time;
	}
	public LocalDate getShow_end_time() {
		return show_end_time;
	}
	public void setShow_end_time(LocalDate show_end_time) {
		this.show_end_time = show_end_time;
	}
	public Seat getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(Seat seat_id) {
		this.seat_id = seat_id;
	}
	
	
	
	

}
