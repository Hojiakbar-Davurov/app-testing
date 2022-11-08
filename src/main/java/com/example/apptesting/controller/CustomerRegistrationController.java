package com.example.apptesting.controller;

import com.example.apptesting.entity.Customer;
import com.example.apptesting.service.CustomerRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customer-registration")
public class CustomerRegistrationController {

    private final CustomerRegistrationService service;


    @GetMapping
    public Optional<Customer> getAll(@RequestParam String phoneNumber) {
        return service.registerNewCustomer(phoneNumber);
    }
//
//    @PutMapping
//    public Customer registerNewCustomer(@Valid @RequestBody CustomerRegistrationRequest request) {
//        Customer customer = service.registerNewCustomer(String.valueOf(request));
//        return customer;
//    }
}
