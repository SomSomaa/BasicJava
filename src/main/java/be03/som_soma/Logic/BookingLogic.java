package be03.som_soma.Logic;

public class BookingLogic {
    private IBooking bookingInterface;

    public BookingLogic(IBooking bookingInterface) {
        this.bookingInterface = bookingInterface;
    }

    public void reserveBooking() {
        bookingInterface.reserve();
    }
}
