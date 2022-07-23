package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
    //Map for storing Customers
    Map<String, Customer> customers = new HashMap<>();

    //method for adding customers to hashmap
    public void addCustomer(String email, String firstName, String lastName){
        customers.put(email,new Customer(firstName,lastName, email));
    }

    public Customer getCustomer(String customerEmail){
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers(){
        return customers.values();
    }




    @Override
    public String toString() {
        return super.toString();
    }
}
