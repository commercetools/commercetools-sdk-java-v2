
package com.commercetools.api.models.customer;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetDateOfBirthActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetDateOfBirthActionBuilder builder) {
        CustomerSetDateOfBirthAction customerSetDateOfBirthAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDateOfBirthAction).isInstanceOf(CustomerSetDateOfBirthAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "dateOfBirth",
                CustomerSetDateOfBirthAction.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        CustomerSetDateOfBirthAction value = CustomerSetDateOfBirthAction.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
