
package com.commercetools.api.models.me;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetDateOfBirthActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetDateOfBirthActionBuilder builder) {
        MyCustomerSetDateOfBirthAction myCustomerSetDateOfBirthAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetDateOfBirthAction).isInstanceOf(MyCustomerSetDateOfBirthAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "dateOfBirth",
                MyCustomerSetDateOfBirthAction.builder().dateOfBirth(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void dateOfBirth() {
        MyCustomerSetDateOfBirthAction value = MyCustomerSetDateOfBirthAction.of();
        value.setDateOfBirth(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getDateOfBirth()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
