
package com.commercetools.importapi.models.productvariants;

import java.time.LocalTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimeAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TimeAttributeBuilder builder) {
        TimeAttribute timeAttribute = builder.buildUnchecked();
        Assertions.assertThat(timeAttribute).isInstanceOf(TimeAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", TimeAttribute.builder().value(LocalTime.parse("12:00")) } };
    }

    @Test
    public void value() {
        TimeAttribute value = TimeAttribute.of();
        value.setValue(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalTime.parse("12:00"));
    }
}
