
package com.commercetools.importapi.models.customfields;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DateTimeSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DateTimeSetFieldBuilder builder) {
        DateTimeSetField dateTimeSetField = builder.buildUnchecked();
        Assertions.assertThat(dateTimeSetField).isInstanceOf(DateTimeSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", DateTimeSetField.builder()
                .value(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z"))) } };
    }

    @Test
    public void value() {
        DateTimeSetField value = DateTimeSetField.of();
        value.setValue(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
    }
}
