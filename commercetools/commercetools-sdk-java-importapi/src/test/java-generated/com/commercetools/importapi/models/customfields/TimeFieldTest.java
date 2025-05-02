
package com.commercetools.importapi.models.customfields;

import java.time.LocalTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeFieldBuilder builder) {
        TimeField timeField = builder.buildUnchecked();
        Assertions.assertThat(timeField).isInstanceOf(TimeField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", TimeField.builder().value(LocalTime.parse("12:00")) } };
    }

    @Test
    public void value() {
        TimeField value = TimeField.of();
        value.setValue(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalTime.parse("12:00"));
    }
}
