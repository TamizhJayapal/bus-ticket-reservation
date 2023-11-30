package com.bus.reserv.dao;

import java.sql.*;
import java.util.*;

import com.bus.recerv.model.Bus;

public class BusDao {
	private static final String SELECT_ALL_BUSES = "Select * from bus where start_place = ? and end_place=?";
	private static final String SELECT_CAPACITY = "Select capacity from bus where bus_no= ?";
	private static final String SELECT_BUS = "Select * from bus where bus_no=?";

	public List<Bus> getAllBuses(String startPlace, String endPlace) throws SQLException, ClassNotFoundException {
		
		List<Bus> buses = new ArrayList<>();
		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(SELECT_ALL_BUSES);
		st.setString(1, startPlace);
		st.setString(2, endPlace);

		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Bus bus = new Bus();
			bus.setBusNo(rs.getInt("bus_no"));
			bus.setBusType(rs.getString("bus_type"));

			bus.setServiceDay(rs.getString("service_day"));
			bus.setBusRoute(rs.getString("bus_route"));
			bus.setStartPlace(rs.getString("start_place"));
			bus.setEndPlace(rs.getString("end_place"));
			bus.setServiceStartTime(rs.getString("service_start_time"));
			bus.setTravelHours(rs.getInt("travel_hours"));
			bus.setSeatCapasity(rs.getString("seat_capsity"));
			buses.add(bus);
		}
		return buses;

	}

	public Bus selectBus(int busNo) throws SQLException, ClassNotFoundException {

		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(SELECT_BUS);
		st.setInt(1, busNo);
		ResultSet rs = st.executeQuery();

		rs.next();
		Bus bus = new Bus();
		bus.setBusNo(rs.getInt("bus_no"));
		bus.setBusType(rs.getString("bus_type"));

		bus.setServiceDay(rs.getString("service_day"));
		bus.setBusRoute(rs.getString("bus_route"));
		bus.setStartPlace(rs.getString("start_place"));
		bus.setEndPlace(rs.getString("end_place"));
		bus.setServiceStartTime(rs.getString("service_start_time"));
		bus.setTravelHours(rs.getInt("travel_hours"));
		bus.setSeatCapasity(rs.getString("seat_capsity"));

		return bus;

	}

	public int getCapacity(int busNo) throws SQLException, ClassNotFoundException {
		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(SELECT_CAPACITY);
		st.setInt(1, busNo);
		ResultSet rs = st.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

}
