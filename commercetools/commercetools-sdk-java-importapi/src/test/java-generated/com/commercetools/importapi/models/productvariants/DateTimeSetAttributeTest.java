
package com.commercetools.importapi.models.productvariants;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateTimeSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateTimeSetAttributeBuilder builder) {
        DateTimeSetAttribute dateTimeSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateTimeSetAttribute).isInstanceOf(DateTimeSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", DateTimeSetAttribute.builder()
                .value(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z"))) } };
    }

    @Test
    public void value() {
        DateTimeSetAttribute value = DateTimeSetAttribute.of();
        value.setValue(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
    }
}
