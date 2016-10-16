package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customers;

    public InMemoryCustomerRepository() {

        customers = new ArrayList<>();

        Customer alice = new Customer();
        alice.setCustomerId(111L);
        alice.setAddress("Address 1");
        alice.setName("Alice");
        alice.setNoOfOrdersMade(false);

        Customer bob = new Customer();
        bob.setCustomerId(222L);
        bob.setAddress("Address 2");
        bob.setName("Bob");
        bob.setNoOfOrdersMade(true);

        customers.add(alice);
        customers.add(bob);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

}
