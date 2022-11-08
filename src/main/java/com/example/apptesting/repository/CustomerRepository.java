package com.example.apptesting.repository;

import com.example.apptesting.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "select id, name, phone_number from customer " +
            "where phone_number = :phone_number",
            nativeQuery = true)
    Optional<Customer> findByPhoneNumber(@Param("phone_number") String phoneNumber);
}
