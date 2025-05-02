
package com.commercetools.importapi.models.customfields;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateTimeFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateTimeFieldBuilder builder) {
        DateTimeField dateTimeField = builder.buildUnchecked();
        Assertions.assertThat(dateTimeField).isInstanceOf(DateTimeField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", DateTimeField.builder().value(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void value() {
        DateTimeField value = DateTimeField.of();
        value.setValue(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValue()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
