package be03.som_soma.Model;

import java.time.LocalDate;

import be03.som_soma.Logic.IBooking;

public abstract class Booking implements IBooking {
    private int bookingId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(int bookingId, LocalDate startDate, LocalDate endDate) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
