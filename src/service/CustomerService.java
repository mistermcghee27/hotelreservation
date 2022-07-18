package service;

import model.Customer;

import java.util.Collection;

public class CustomerService {

    // Static Variable reference of single_instance
    private static CustomerService single_instance = null;

    //private constructor restricting class to itself
    private CustomerService(){}

    // Static method to create instance of CustomerService
    public static CustomerService getInstance(){
        if (single_instance == null) {
            single_instance = new CustomerService();
        }
        return getInstance();
    }

    public void addCustomer(String email, String firstName, String lastName){}

    public Customer getCustomer(String customerEmail){
        return getCustomer(customerEmail);
    }

    public Collection<Customer> getAllCustomers(){
        return getAllCustomers();
    }

}
