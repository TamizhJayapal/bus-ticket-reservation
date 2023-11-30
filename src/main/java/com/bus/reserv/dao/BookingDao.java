package com.bus.reserv.dao;

import java.sql.*;
import java.util.*;

import com.bus.recerv.model.Booking;

public class BookingDao {
	public static final String SELECT_ALL_BOOKING = "SELECT * FROM BOOKING where user_id=?";
	public static final String INSERT_BOOKING = 
		"INSERT INTO BOOKING(passenger_name,passenger_age,passenger_gender,bus_no) VALUES(?,?,?,?)";
	public static final String DELETE_BOOKING = "delete FROM BOOKING where booking_id=?";

	public List<Booking> selectAllBookings(int user_id) throws SQLException, ClassNotFoundException {
		List<Booking> bookings = new ArrayList<>();
		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(SELECT_ALL_BOOKING);
		st.setInt(1, user_id);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Booking booking = new Booking();
			booking.setBookingId(rs.getInt("booking_id"));
			booking.setPassengerName(rs.getString("passenger_name"));
			booking.setPassengerAge(rs.getInt("passenger_age"));

			booking.setPassengerGender(rs.getString("passenger_gender").charAt(0));
			booking.setBusNo(rs.getInt("bus_no"));
			booking.setStartPlace(rs.getString("start_place"));
			booking.setEndPlace(rs.getString("end_place"));
			booking.setBookingDate(rs.getDate("booking_date"));

			bookings.add(booking);
		}
		return bookings;

	}

	public boolean insertBooking(Booking booking) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_BOOKING);
		st.setString(1, booking.getPassengerName());
		st.setInt(2, booking.getPassengerAge());
		st.setString(3, Character.toString(booking.getPassengerGender()));
		st.setInt(4, booking.getBusNo());
		int rows = st.executeUpdate();
		return rows > 1;
	}

	public boolean deleteBooking(int booking_id) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement st = con.prepareStatement(DELETE_BOOKING);
		st.setInt(1, booking_id);
		int rows = st.executeUpdate();
		return rows > 1;
	}

}
