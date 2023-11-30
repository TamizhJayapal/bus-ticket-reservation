package com.bus.recerv.model;

public class Bus {

	private int busNo;

	private String busType;

	private String serviceDay;

	private String busRoute;

	private String startPlace;

	private String endPlace;

	private String serviceStartTime;

	private int travelHours;

	private String seatCapasity;

	public Bus() {
	}

	public Bus(int busNo, String busType, String serviceDay, String busRoute, String startPlace, String endPlace,
			String serviceStartTime, int travelHours, String seatCapasity) {

		this.busNo = busNo;

		this.busType = busType;

		this.serviceDay = serviceDay;

		this.busRoute = busRoute;

		this.startPlace = startPlace;

		this.endPlace = endPlace;

		this.serviceStartTime = serviceStartTime;

		this.travelHours = travelHours;

		this.seatCapasity = seatCapasity;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getServiceDay() {
		return serviceDay;
	}

	public void setServiceDay(String serviceDay) {
		this.serviceDay = serviceDay;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
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

	public String getServiceStartTime() {
		return serviceStartTime;
	}

	public void setServiceStartTime(String serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

	public int getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(int travelHours) {
		this.travelHours = travelHours;
	}

	public String getSeatCapasity() {
		return seatCapasity;
	}

	public void setSeatCapasity(String seatCapasity) {
		this.seatCapasity = seatCapasity;
	}
}
