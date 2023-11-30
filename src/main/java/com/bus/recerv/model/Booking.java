package com.bus.recerv.model;

import java.util.*;

public class Booking {
	private int bookingId;
	private String passengerName;
	private int passengerAge;
	private char passengerGender;
	private int busNo;
	private String startPlace;
	private String endPlace;
	private Date bookingDate;

	public Booking() {
	}

	public Booking(String passengerName, int passengerAge, char passengerGender, int busNo) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.busNo = busNo;
	}

	public Booking(int bookingId, String passengerName, int passengerAge, char passengerGender, int busNo,
			String startPlace, String endPlace, Date bookingDate) {

		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.busNo = busNo;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.bookingDate = bookingDate;
	}

	public Booking(String passengerName, int passengerAge, char passengerGender, int busNo, String startPlace,
			String endPlace, Date bookingDate) {

		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.busNo = busNo;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.bookingDate = bookingDate;
	}

	public int getBooking_id() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public char getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(char passengerGender) {
		this.passengerGender = passengerGender;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

}
