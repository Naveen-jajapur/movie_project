package com.cg.movie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description      It is an Entity class of Screen and is mapped with the  DataBase
 *                                       of table screen_tbl.
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/
@Entity
@Table(name="screen_tbl")
public class Screen {
	@Id
	@Column(name="screenId")
	private int screen_id;
	@ManyToOne
	@JoinColumn(name="theatreId")
	private Theatre theatre_id;
	@Column(name="screenName")
	private String screen_name;
	@Column(name="nrows")
	private int noOfRows;
	@Column(name="ncolumns")
	private int noOfColumns;
	@ManyToOne
	@JoinColumn(name="showId")
	private Show show_id;
	
	@OneToMany(mappedBy = "show_id")
	@JsonIgnore
	List<Show> listOfShows = new ArrayList<>();
	public Screen(int screen_id, Theatre theatre_id, String screen_name, int noOfRows, int noOfColumns, Show show_id) {
		super();
		this.screen_id = screen_id;
		this.theatre_id = theatre_id;
		this.screen_name = screen_name;
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;
		this.show_id = show_id;
	}
	public Screen() {
		super();
	}
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}
	public Theatre getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(Theatre theatre_id) {
		this.theatre_id = theatre_id;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public int getNoOfRows() {
		return noOfRows;
	}
	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}
	public int getNoOfColumns() {
		return noOfColumns;
	}
	public void setNoOfColumns(int noOfColumns) {
		this.noOfColumns = noOfColumns;
	}
	public Show getShow_id() {
		return show_id;
	}
	public void setShow_id(Show show_id) {
		this.show_id = show_id;
	}
	
	
	

}
