
package com.commercetools.importapi.models.productvariants;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateTimeAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateTimeAttributeBuilder builder) {
        DateTimeAttribute dateTimeAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateTimeAttribute).isInstanceOf(DateTimeAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", DateTimeAttribute.builder().value(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void value() {
        DateTimeAttribute value = DateTimeAttribute.of();
        value.setValue(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValue()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
