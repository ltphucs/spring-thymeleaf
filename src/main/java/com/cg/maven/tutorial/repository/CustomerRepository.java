package com.cg.maven.tutorial.repository;

import com.cg.maven.tutorial.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
