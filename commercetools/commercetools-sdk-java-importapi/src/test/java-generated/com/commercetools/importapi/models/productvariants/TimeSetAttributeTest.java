
package com.commercetools.importapi.models.productvariants;

import java.time.LocalTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeSetAttributeBuilder builder) {
        TimeSetAttribute timeSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(timeSetAttribute).isInstanceOf(TimeSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value",
                TimeSetAttribute.builder().value(Collections.singletonList(LocalTime.parse("12:00"))) } };
    }

    @Test
    public void value() {
        TimeSetAttribute value = TimeSetAttribute.of();
        value.setValue(Collections.singletonList(LocalTime.parse("12:00")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalTime.parse("12:00")));
    }
}
