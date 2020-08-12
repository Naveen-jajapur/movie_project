package com.cg.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/****************************************************************************************************
 *          @author          Naveen J
 *          Description      It is an Entity class of Seat and is mapped with the  DataBase
 *                                       of table seat_tbl.
 *          @version         1.0
 *          Created Date     05-AUG-2020
 ****************************************************************************************************/
@Entity
@Table(name="seat_tbl")
public class Seat {

	@Id
	@Column(name="seatId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
	@SequenceGenerator(name="mygen",sequenceName="seat_sequence",allocationSize=1)
	private int seat_id;
	@Column(name="seatStatus")
	private int seat_status;
	@Column(name="seatPrice")
	private float seat_price;
	public Seat(int seat_id, int seat_status, float seat_price) {
		super();
		this.seat_id = seat_id;
		this.seat_status = seat_status;
		this.seat_price = seat_price;
	}
	public Seat() {
		super();
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public int getSeat_status() {
		return seat_status;
	}
	public void setSeat_status(int seat_status) {
		this.seat_status = seat_status;
	}
	public float getSeat_price() {
		return seat_price;
	}
	public void setSeat_price(float seat_price) {
		this.seat_price = seat_price;
	}
	
	
}
