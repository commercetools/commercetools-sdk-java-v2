
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NumberFieldBuilder builder) {
        NumberField numberField = builder.buildUnchecked();
        Assertions.assertThat(numberField).isInstanceOf(NumberField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", NumberField.builder().value(0.8275633) } };
    }

    @Test
    public void value() {
        NumberField value = NumberField.of();
        value.setValue(0.8275633);
        Assertions.assertThat(value.getValue()).isEqualTo(0.8275633);
    }
}
