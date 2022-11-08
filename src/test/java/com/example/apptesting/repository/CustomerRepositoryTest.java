package com.example.apptesting.repository;

import com.example.apptesting.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    void itShouldFindByPhoneNumber() {
        // given
        // when
        // then
        System.out.println("HI");
    }

    @Test
    void itShouldSave() {

        // given
        Long id = 12L;
        Customer customer = new Customer(id, "Ali", "456465746854");

        // when
        repository.save(customer);

        // then
        Optional<Customer> optionalCustomer = repository.findById(id);
        assertThat(optionalCustomer)
                .isPresent()
                .hasValueSatisfying(c -> {
//                    assertThat(c.getId()).isEqualTo(id);
//                    assertThat(c.getName()).isEqualTo("Ali");
                    assertThat(c)
                            .usingRecursiveComparison()
                            .isEqualTo(customer);
                });
    }
}