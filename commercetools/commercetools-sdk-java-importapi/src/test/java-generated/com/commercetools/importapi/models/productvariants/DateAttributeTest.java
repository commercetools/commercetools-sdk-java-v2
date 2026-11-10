
package com.commercetools.importapi.models.productvariants;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateAttributeBuilder builder) {
        DateAttribute dateAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateAttribute).isInstanceOf(DateAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", DateAttribute.builder().value(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void value() {
        DateAttribute value = DateAttribute.of();
        value.setValue(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
