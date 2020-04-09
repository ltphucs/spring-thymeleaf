package com.cg.maven.tutorial.service.Implement;

import com.cg.maven.tutorial.model.Customer;
import com.cg.maven.tutorial.repository.CustomerRepository;
import com.cg.maven.tutorial.service.CustomerService;
import com.cg.maven.tutorial.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer object) {
        customerRepository.save(object);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void update(Customer object) {
        customerRepository.save(object);
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }
}
