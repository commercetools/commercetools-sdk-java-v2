
package com.commercetools.importapi.models.customfields;

import java.time.LocalTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeSetFieldBuilder builder) {
        TimeSetField timeSetField = builder.buildUnchecked();
        Assertions.assertThat(timeSetField).isInstanceOf(TimeSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                TimeSetField.builder().value(Collections.singletonList(LocalTime.parse("12:00"))) } };
    }

    @Test
    public void value() {
        TimeSetField value = TimeSetField.of();
        value.setValue(Collections.singletonList(LocalTime.parse("12:00")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalTime.parse("12:00")));
    }
}
