package controllers;

import models.*;
import java.util.*;
import java.util.List;

public class CustomerController {
    private List<CustomerModel> customerModel;
    private CustomerModel loggedInCustomer;

    public CustomerController() {
        customerModel = new ArrayList<>();
    }

    public void registerCustomer(String username, String password, String nomorHp, String alamat) {
        customerModel.add(new CustomerModel(username, password, nomorHp, alamat));
    }

    public boolean loginCustomer(String username, String password) {
        for (CustomerModel customer : customerModel) {
            if (customer.login(username, password)) {
                loggedInCustomer = customer;
                return true;
            }
        }
        return false;
    }

    public CustomerModel getLoggedInCustomer() {
        return loggedInCustomer;
    }
}