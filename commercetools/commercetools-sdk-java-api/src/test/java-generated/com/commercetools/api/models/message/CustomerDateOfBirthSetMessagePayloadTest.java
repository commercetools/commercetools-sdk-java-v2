
package com.commercetools.api.models.message;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDateOfBirthSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDateOfBirthSetMessagePayloadBuilder builder) {
        CustomerDateOfBirthSetMessagePayload customerDateOfBirthSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerDateOfBirthSetMessagePayload)
                .isInstanceOf(CustomerDateOfBirthSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "dateOfBirth",
                CustomerDateOfBirthSetMessagePayload.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        CustomerDateOfBirthSetMessagePayload value = CustomerDateOfBirthSetMessagePayload.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
