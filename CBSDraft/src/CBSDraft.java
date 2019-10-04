CinemaBookingSystem——————————————————————————————————————

/**
 * Cinema booking system to manage and maintain theaters, shows, and bookings.
 *
 */
public class CinemaBookingSystem {

	//declaration of fields
	private ArrayList<Show> shows;
	private ArrayList<Theater> theaters;
	private ArrayList<SeatBooking> seatBookings;
	
	/**
	 * Gets the list of shows.
	 * 
	 * @return The list of shows.
	 */
	public ArrayList<Show> getShows() {
		
	}

	/**
	 * Gets the list of theaters.
	 * 
	 * @return The list of theaters.
	 */
	public ArrayList<Theater> getTheaters() {
		
	}

	/**
	 * Gets the list of seat bookings.
	 * 
	 * @return The list of seat bookings.
	 */
	public ArrayList<SeatBooking> getSeatBookings() {
		
	}
	
	/**
	 * Find a show by the user-given name.
	 * 
	 * @param showName The name of the show to be searched.
	 * @return The show/shows that correspond to the given name.
	 */
	public Show findShowByName(String showName) {
		
	}
	
	/**
	 * Find a show by a user-given date.
	 * 
	 * @param date The date of the show to be searched.
	 * @return The show/shows that correspond to the given date.
	 */
	public Show findShowByDate(DateAndTime date) {
			
	}
	
	/**
	 * Adds a show to the collection of shows.
	 */
	public void addShow() {
		
	}
	
	/**
	 * Adds a theater to the collection of theaters.
	 */
	public void addTheater() {
		
	}
	
	/**
	 * Books a new show based on a given show name and date.
	 * 
	 * @param showName The name of the show to be booked.
	 * @param date The date of the show to be booked.
	 */
	public void bookShow(String showName, DateAndTime date) {
		
	}
}

Theater—————————————————————————————————————————————

/**
 * Theater class responsible for creating and maintaining new theaters.
 */
public class Theater {
	
	//declaration of fields
	private int numRows;
	private int rowLength;
	private int theaterID;
	private ArrayList<Row> rows;

	/**
	 * Constructor for the class Theater.
	 * 
	 * @param theaterID The number of the theater.
	 * @param numRows The number of rows in the theater.
	 * @param rowLength The length of a row in the theater.
	 */
	public Theater(int theaterID, int numRows, int rowLength) {
		
	}

	/**
	 * Gets the number of rows in the theater.
	 * 
	 * @return The number of rows in the theater.
	 */
	public int getNumRows() {
		
	}

	/**
	 * Sets the number of rows in the theater.
	 * 
	 * @param numRows The number of rows in the theater.
	 */
	public void setNumRows(int numRows) {
		
	}

	/**
	 * Gets the length of a row in the theater.
	 * 
	 * @return The length of a row in the theater.
	 */
	public int getRowLength() {
		
	}

	/**
	 * Sets the length of a row in the theater.
	 * 
	 * @param rowLength The length of a row in the theater.
	 */
	public void setRowLength(int rowLength) {
		
	}

	/**
	 * Gets the ID of the theater.
	 * 
	 * @return The ID of the theater.
	 */
	public int getTheaterID() {
		
	}

	/**
	 * Sets the ID of the theater.
	 * 
	 * @param theaterID The ID of the theater.
	 */
	public void setTheaterID(int theaterID) {
		
	}

	/*
	 * Gets the number of rows in the theater.
	 * 
	 * @return rows The number of rows in the theater.
	 */
	public ArrayList<Row> getRows() {
		
	}

	/**
	 * Sets the number of rows in the theater.
	 * 
	 * @param rows The number of rows in the theater.
	 */
	public void setRows(ArrayList<Row> rows) {
		
	}
	
	 /**
	 * Method to convert Theater object to a string.
	 * 
	 * @param theater The theater object.
	 * @return The theater string.
	 */
	public String toString(Theater theater) {
		
	}
	
}

TheaterCollection—————————————————————————————————————————

/**
 * Manages theater information.
 */
public class TheaterCollection {

	/**
	 * Adds theater information into a .txt file 
	 * and stores the .txt file into a theater folder.
	 */
	public void addTheater() {
		
	}
}

Show——————————————————————————————————————————————

/**
 * Class to store show information and access show information.
 */
public class Show {

	//declaration of fields
	private String showStartingDate;
	private String showEndingDate;
	private String showName;
	private String showCategory;
	private String rating;
	private int theaterID;
	
	/**
	 * Constructor for the class Show.
	 * 
	 * @param showName The name of the show.
	 * @param theaterID The number of the theater.
	 * @param showStartingDate The starting date of the show.
	 * @param showEndingDate The ending date of the show.
	 * @param rating The rating of the show.
	 * @param showCategory The category of the show.
	 */
	public Show(String showName,  int theaterID, String showStartingDate, 
			String showEndingDate, String rating, String showCategory) {
		
	}

	/**
	 * Gets the start date of the show.
	 * 
	 * @return The start date of the show.
	 */
	public String getStartingDate() {
		
	}

	/**
	 * Sets the start date of the show.
	 * 
	 * @param showTimeStart The start date of the show.
	 */
	public void setStartingDate(String showStartingDate) {
		
	}

	/**
	 * Gets the end date of the show.
	 * 
	 * @return The end date of the show.
	 */
	public String getEndingDate() {
		
	}

	/**
	 * Sets the end date of the show.
	 * 
	 * @param showTimeEnd The end date of the show.
	 */
	public void setEndingDate(String showEndingDate) {
		
	}

	/**
	 * Gets the name of the show.
	 * 
	 * @return The name of the show.
	 */
	public String getShowName() {
		
	}

	/**
	 * Sets the name of the show.
	 * 
	 * @param showName The name of the show.
	 */
	public void setShowName(String showName) {
		
	}

	/**
	 * Gets the category of the show.
	 * 
	 * @return The category of the show.
	 */
	public String getShowCategory() {
		
	}
	
	/**
	 * Sets the category of the show.
	 * 
	 * @param showCategory The category of the show.
	 */
	public void setShowCategory(String showCategory) {
		
	}

	/**
	 * Gets the rating of the show.
	 * 
	 * @return The rating of the show.
	 */
	public String getRating() {
		
	}

	/**
	 * Sets the rating of the show.
	 * 
	 * @param rating The rating of the show.
	 */
	public void setRating(String rating) {
		
	}

	/**
	 * Gets the number of the theater.
	 * 
	 * @return The name of the theater.
	 */
	public int getTheaterID() {
		
	}

	/**
	 * Sets the number of the theater.
	 * 
	 * @param theaterID The name of the theater.
	 */
	public void setTheaterID(int theaterID) {
		
	}
	
	/**
	 * Method to convert DateAndTime object to a string.
	 * 
	 * @param date The date and time.
	 * @return The date and time string.
	 */
	public String toString(DateAndTime date) {
		
	}
}

ShowCollection——————————————————————————————————————————

/**
 * Manages show information.
 */
public class ShowCollection {

	/**
	 * Adds show information into a .txt file 
	 * and stores the .txt file into a show folder.
	 */
	public void addShow()
	{
		
	}
}

Customer—————————————————————————————————————————————

/**
 * Class to store customer name and information.
 */
public class Customer {
	
	//Declaration of fields
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	/**
	 * Constructor for the Customer class.
	 * 
	 * @param firstName The first name of the customer.
	 * @param lastName The last name of the customer.
	 * @param phoneNumber The phone number of the customer.
	 */
	public Customer(String firstName, String lastName, String phoneNumber) {
		
	}

	/**
	 * Gets the first name of the customer.
	 * 
	 * @return The first name of the customer.
	 */
	public String getFirstName() {
		
	}

	/**
	 * Sets the first name of the customer.
	 * 
	 * @param firstName The first name of the customer.
	 */
	public void setFirstName(String firstName) {
		
	}
	/**
	 * Gets the last name of the customer.
	 * 
	 * @return The last name of the customer.
	 */
	public String getLastName() {
	
	}
	
	/**
	 * Sets the last name of the customer.
	 * 
	 * @param lastName The last name of the customer.
	 */
	public void setLastName(String lastName) {
	
	}
	
	/**
	 * Gets the phone number of the customer.
	 * 
	 * @return The phone number of the customer.
	 */
	public String getPhoneNumber() {
		
	}

	/**
	 * Sets the phone number of the customer.
	 * 
	 * @param phoneNumber The phone number of the customer.
	 */
	public void setPhoneNumber(String phoneNumber) {
		
	}
	
	/**
	 * Method to convert Customer object to a string.
	 * 
	 * @param customer The customer object.
	 * @return The string of the customer object.
	 */
	public String toString(Customer customer) {
		
	}
	
}

CustomerCollection————————————————————————————————————————

/**
 * Manages customer information.
 */
public class CustomerCollection {

	/**
	 * Adds customer information into a .txt file 
	 * and stores the .txt file into a customer folder.
	 */
	public void addCustomer()
	{
		
	}
}

Row———————————————————————————————————————————————

/**
 * Class storing information regarding the rows in a theater.
 */
public class Row {
	
	//Declaration of fields
	private ArrayList<Seat> seats;
	private int rowNumber;
	private int rowLength;

	/**
	 * Constructor for the class Row.
	 */
	public Row(int rowNumber, int rowLength) {
		
	}

	/**
	 * Gets the number of seats.
	 * 
	 * @return The number of seats.
	 */
	public ArrayList<Seat> getSeats() {
		
	}

	/**
	 * Gets the row number.
	 * 
	 * @return The row number.
	 */
	public int getRowNumber() {
		
	}

	/**
	 * Sets the row number.
	 * 
	 * @param rowNumber The row number to be changed.
	 */
	public void setRowNumber(int rowNumber) {
	
	}

	/**
	 * Gets the length of the row.
	 * 
	 * @return The length of the row.
	 */
	public int getRowLength() {
		
	}

	/**
	 * Sets the length of the row.
	 * 
	 * @param rowLength The length of the row.
	 */
	public void setRowLength(int rowLength) {
		
	}
	
	/**
	 * Method to convert Row object to a string.
	 * 
	 * @param row The row object.
	 * @return The row object String.
	 */
	public String toString(Row row) {
	
	}
}

Seat———————————————————————————————————————————————

/**
 * Class to manage seats in a given row.
 */
public class Seat {

	//Declaration of fields
	private int rowNumber;
	private int seatNumber;
	private int totalOpenSeats;
	private Boolean status;
	private Customer customer;
	
	/**
	 * Constructor for the class Seat.
	 * @param rowNumber The number of rows.
	 * @param seatNumber The number of seats.
	 */
	public Seat(int rowNumber, int seatNumber) {
		
	}
	
	/**
	 * Gets the row number for the seat.
	 * 
	 * @return The row number for the seat.
	 */
	public int getRowNumber() {
		
	}

	/**
	 * Sets the row number for the seat.
	 * 
	 * @param rowNumber The row number for the seat.
	 */
	public void setRowNumber(int rowNumber) {
		
	}

	/**
	 * Gets the number of the seat.
	 * 
	 * @return The number of the seat.
	 */
	public int getSeatNumber() {
		
	}

	/**
	 * Sets the number of the seat.
	 * 
	 * @param seatNumber The number of the seat.
	 */
	public void setSeatNumber(int seatNumber) {
		
	}

	/**
	 * Gets the total open number of seats.
	 * 
	 * @return The total open number of seats.
	 */
	public int getTotalOpenSeats() {
		
	}

	/**
	 * Sets the total open number of Seats.
	 * 
	 * @param totalOpenSeats The total open number of seats.
	 */
	public void setTotalOpenSeats(int totalOpenSeats) {
		
	}

	/**
	 * Gets the status of an open/closed seat.
	 * 
	 * @return The status of an open/closed seat.
	 */
	public Boolean getStatus() {
		
	}

	/**
	 * Sets the status of an open/closed seat.
	 * 
	 * @param status The status of an open/closed seat.
	 */
	public void setStatus(Boolean status) {
		
	}

	/**
	 * Gets the customer object for the seat.
	 * 
	 * @return The customer object for the seat.
	 */
	public Customer getCustomer() {
		
	}

	/**
	 * Sets the customer object for the seat.
	 * 
	 * @param customer The customer object for the seat.
	 */
	public void setCustomer(Customer customer) {
	
	}

	/**
	 * Method to convert Seat object to a string.
	 * 
	 * @param seat The Seat object.
	 * @return The Seat object String.
	 */
	public String toString(Seat seat) {
	
	}
}

SeatBooking————————————————————————————————————————————

/**
 * Class to handle the booking of seats.
 */
public class SeatBooking {

	//Declaration of fields
	private String customerLastName;
	private Show showName;
	private HashMap<String, ArrayList> reservedSeats;
	
	/**
	 * Constructor for the SeatBooking class, books seats.
	 * 
	 * @param customerLastName The last name of the customer.
	 * @param showName The name of the show to be booked.
	 * @param seats The seats reserved in the theater.
	 */
	public SeatBooking(String customerLastName, Show showName, 
			ArrayList<Seat> seats) {
		
	}
	
	/**
	 * Gets the customer's last name.
	 * 
	 * @return The customer's last name.
	 */
	public String getCustomerLastName() {
		
	}

	/**
	 * Sets the customer's last name.
	 * 
	 * @param customerLastName the customer's last name.
	 */
	public void setCustomerLastName(String customerLastName) {
		
	}

	/**
	 * Gets the name of the show.
	 * 
	 * @return The name of the show.
	 */
	public Show getShowName() {
	
	}

	/**
	 * Sets the name of the show.
	 * 
	 * @param showName The name of the show.
	 */
	public void setShowName(Show showName) {
		
	}

	/**
	 * Gets the list of reserved Seats.
	 * 
	 * @return The list of reserved Seats.
	 */
	public HashMap<String, ArrayList> getReservedSeats() {
		
	}

	/**
	 * Method to convert SeatBooking object to a string.
	 * 
	 * @param booking The SeatBooking object.
	 * @return The SeatBooking object String.
	 */
	public String toString(SeatBooking booking) {
		
	}
}

DateAndTime———————————————————————————————————————————

/**
 * Class to store date and time of a given movie.
 */
public class DateAndTime {

	private Show showName;
	private DateAndTime date;
	private DateAndTime startTime;
	private DateAndTime endTime;
	private DateAndTime showDuration;
	private ArrayList<DateAndTime> times;
	
	/**
	 * Constructor for the class DateAndTime.
	 * 
	 * @param showName The name of the show.
	 * @param date The date of the show.
	 * @param startTime The start time of the show.
	 * @param endTime The end time of the show.
	 */
	public DateAndTime(String showName, String date, String startTime, String endTime) {
		
	}

	/**
	 * Gets the name of the show.
	 * 
	 * @return The name of the show.
	 */
	public Show getShowName() {
		
	}
	
	/**
	 * Sets the name of the show.
	 * 
	 * @param showName The name of the show.
	 */
	public void setShowName(Show showName) {
		
	}

	/**
	 * Gets the date and time of the show.
	 * @return The date and time of the show.
	 */
	public DateAndTime getDate() {
		
	}

	/**
	 * Sets the date and time of the show.
	 * 
	 * @param date The date and time of the show.
	 */
	public void setDate(DateAndTime date) {
		
	}

	/**
	 * Gets the start time of the show.
	 * 
	 * @return The start time of the show.
	 */
	public DateAndTime getStartTime() {
		
	}

	/**
	 * Sets the start time of the show.
	 * 
	 * @param startTime The start time of the show.
	 */
	public void setStartTime(DateAndTime startTime) {
		
	}

	/**
	 * Gets the end time of the show.
	 * 
	 * @return The end time of the show.
	 */
	public DateAndTime getEndTime() {
		
	}

	/**
	 * Sets the end time of the show.
	 * 
	 * @param endTime The end time of the show.
	 */
	public void setEndTime(DateAndTime endTime) {
		
	}

	/**
	 * Gets the duration of the show.
	 * 
	 * @return The duration of the show.
	 */
	public DateAndTime getShowDuration() {
		
	}

	/**
	 * Sets the duration of the show.
	 * 
	 * @param showDuration The duration of the show.
	 */
	public void setShowDuration(DateAndTime showDuration) {
		
	}

	/**
	 * Gets all show times.
	 * 
	 * @return All show times.
	 */
	public ArrayList<DateAndTime> getTimes() {
		
	}

	/**
	 * Method to convert DateAndTime object to a string.
	 * 
	 * @param date The DateAndTime object.
	 * @return The DateAndTime object String.
	 */
	public String toString(DateAndTime date) {
		
	}
	
}