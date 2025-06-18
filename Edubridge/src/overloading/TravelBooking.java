package overloading;

public class TravelBooking {
	   void bookTicket(String busNumber, String date) {
	        System.out.println("Bus ticket booked. Bus No: " + busNumber + ", Date: " + date);
	    }

	    void bookTicket(String flightNumber, String date, String seatClass) {
	        System.out.println("Flight ticket booked. Flight No: " + flightNumber + ", Date: " + date + ", Class: " + seatClass);
	    }

	    void bookTicket(String trainNumber, String date, int coachNumber) {
	        System.out.println("Train ticket booked. Train No: " + trainNumber + ", Date: " + date + ", Coach No: " + coachNumber);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelBooking booking = new TravelBooking();

        booking.bookTicket("KA 1234", "02/05/2025");
        booking.bookTicket("AIR 123", "02/05/2025", "Business");
        booking.bookTicket("IRSTC 12345", "02/05/2025", 3);

	}

}
