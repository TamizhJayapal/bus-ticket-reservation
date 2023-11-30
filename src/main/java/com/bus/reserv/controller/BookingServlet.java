package com.bus.reserv.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.bus.recerv.model.Booking;
import com.bus.recerv.model.Bus;
import com.bus.reserv.dao.BookingDao;
import com.bus.reserv.dao.BusDao;

@WebServlet("/")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BusDao busDao;
	BookingDao bookingDao;

	public BookingServlet() {
		super();
		busDao = new BusDao();
		bookingDao = new BookingDao();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		switch (action) {
		case "/buses":
			try {
				listBuses(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/bookings":
			try {
				listBookings(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/pass-info":
			try {
				showPassengerInfoForm(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break;
		case "/book":
			try {
				addBooking(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/cancel":
			try {
				cancelBooking(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			showBusForm(request, response);
			break;
		}
	}

	public void listBuses(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		System.out.println("entered in lists");
		List<Bus> buses = busDao.getAllBuses(request.getParameter("start-place"), request.getParameter("end-place"));
		System.out.println(buses.size());
		request.setAttribute("buses", buses);
		RequestDispatcher dispatcher = request.getRequestDispatcher("list-buses.jsp");
		dispatcher.forward(request, response);
	}

	public void listBookings(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		List<Booking> bookings = bookingDao.selectAllBookings(

				Integer.parseInt(request.getParameter("user_id")));
		request.setAttribute("bookings", bookings);
		RequestDispatcher dispatcher = request.getRequestDispatcher("list-bookings.jsp");
		dispatcher.forward(request, response);
	}

	public void addBooking(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		Booking booking = new Booking(request.getParameter("passenger-name"),
				Integer.parseInt(request.getParameter("passenger-age")),
				request.getParameter("passenger-gender").charAt(0), 
				Integer.parseInt(request.getParameter("bus-no")));

		bookingDao.insertBooking(booking);
		
		response.sendRedirect("show-ticket.jsp");
	}

	public void cancelBooking(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {

		bookingDao.deleteBooking(Integer.parseInt(request.getParameter("booking-id")));

		response.sendRedirect("/bookings");
	}

	public void showBusForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("select-form.jsp");
	}

	public void showPassengerInfoForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException, ClassNotFoundException, SQLException {
		Bus bus = busDao.selectBus(
			Integer.parseInt(request.getParameter("bus_no"))
					);
		request.setAttribute("bus",bus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("passenger-form.jsp");
		dispatcher.forward(request, response);
	}


}
