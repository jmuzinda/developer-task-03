package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;

import java.util.List;
import java.util.Optional;

/**
 * Created by jmuzinda on 10/25/17.
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean registerCustomer(Customer customer) {
        if (customer != null) {
            if (customer.getFirstName() != null && customer.getFirstName().length() == 0) {
                throw new ValidationException("First name cannot be blank");
            }
            if (customer.getNationalId() != null && customer.getNationalId().length() < 5) {
                throw new ValidationException("National ID cannot be less than 5 characters");
            }
        }
        return true;
    }

    @Override
    public Optional<Customer> findCustomer(Long id) {
        return null;
    }

    @Override
    public List<Customer> filterByGradeOrSalary(String grade, Number salary, List<Customer> customerInputList) {
        return null;
    }
}
