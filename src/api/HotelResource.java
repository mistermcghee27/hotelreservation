package api;

import service.CustomerService;

public class HotelResource {

    private static HotelResource single_instance = null;

    private HotelResource() {
    }

    public static HotelResource getInstance() {
        if (single_instance == null) {
            single_instance = new HotelResource();
        }
        return getInstance();

    }
}
