package com.example.apptesting.service;

import com.example.apptesting.entity.Customer;
import com.example.apptesting.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerRegistrationService {
    private final CustomerRepository repository;

    public Optional<Customer> registerNewCustomer(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber);
    }


}
