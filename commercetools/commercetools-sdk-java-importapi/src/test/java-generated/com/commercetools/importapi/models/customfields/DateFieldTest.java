
package com.commercetools.importapi.models.customfields;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateFieldBuilder builder) {
        DateField dateField = builder.buildUnchecked();
        Assertions.assertThat(dateField).isInstanceOf(DateField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", DateField.builder().value(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void value() {
        DateField value = DateField.of();
        value.setValue(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
