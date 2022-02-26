package dev.fm.test;

import dev.fm.Customer;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void givenCalculateAge_whenReturnCustomerAge_thenSucceed(){
        Customer customer = new Customer();
        customer.setBirthday(LocalDate.of(1983, Month.OCTOBER,1));

        Integer actual = customer.calculateAge();

        assertEquals(38, actual);
    }

}