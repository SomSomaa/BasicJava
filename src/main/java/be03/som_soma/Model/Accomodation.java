package be03.som_soma.Model;

import java.time.LocalDate;

public class Accomodation extends Booking {
    private String place;
    private Integer nights;
    private String mealType;

    public Accomodation(int bookingId, LocalDate startDate, LocalDate endDate, String place, Integer nights,
            String mealType) {
        super(bookingId, startDate, endDate);
        this.place = place;
        this.nights = nights;
        this.mealType = mealType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public void reserve() {
        System.out.println("A szállás helye: " + this.place + ", " + this.nights + " éjszakára, " + this.mealType
                + " ellátással.");

    }

}
