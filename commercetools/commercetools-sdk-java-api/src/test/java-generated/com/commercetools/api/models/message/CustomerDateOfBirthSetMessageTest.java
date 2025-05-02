
package com.commercetools.api.models.message;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDateOfBirthSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDateOfBirthSetMessageBuilder builder) {
        CustomerDateOfBirthSetMessage customerDateOfBirthSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerDateOfBirthSetMessage).isInstanceOf(CustomerDateOfBirthSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "dateOfBirth",
                CustomerDateOfBirthSetMessage.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        CustomerDateOfBirthSetMessage value = CustomerDateOfBirthSetMessage.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
