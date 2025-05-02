
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NumberSetFieldBuilder builder) {
        NumberSetField numberSetField = builder.buildUnchecked();
        Assertions.assertThat(numberSetField).isInstanceOf(NumberSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", NumberSetField.builder().value(Collections.singletonList(0.8275633)) } };
    }

    @Test
    public void value() {
        NumberSetField value = NumberSetField.of();
        value.setValue(Collections.singletonList(0.8275633));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(0.8275633));
    }
}
