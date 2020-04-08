package com.cg.maven.tutorial.service;

import com.cg.maven.tutorial.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements IService<Customer> {

    private  static Map<Integer,Customer> customers;
    static {
        customers= new HashMap<>();
        customers.put(1,new Customer(1l,"John doe","john@test.com","USA"));
        customers.put(2,new Customer(2l,"Bill","john2@test.com","CN"));
        customers.put(3,new Customer(3l,"Alex doe","john3@test.com","UK"));
        customers.put(4,new Customer(4l,"Rose doe","john4@test.com","Fr"));
        customers.put(5,new Customer(5l,"Adam doe","john5@test.com","VN"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer object) {
        customers.put((int)object.getId(),object);
    }

    @Override
    public Customer findById(long id) {
        return customers.get(id);
    }

    @Override
    public void update(Customer object) {
        customers.put((int)object.getId(),object);
    }

    @Override
    public void delete(long id) {
        customers.remove(id);
    }
}
