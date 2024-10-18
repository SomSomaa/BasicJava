package be03.som_soma.Logic;

import be03.som_soma.Repository.UserRepository;

public class BookingService {

    private UserRepository userRepository;

    public BookingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
