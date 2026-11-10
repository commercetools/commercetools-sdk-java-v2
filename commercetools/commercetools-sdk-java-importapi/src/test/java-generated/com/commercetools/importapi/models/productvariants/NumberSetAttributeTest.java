
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NumberSetAttributeBuilder builder) {
        NumberSetAttribute numberSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(numberSetAttribute).isInstanceOf(NumberSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", NumberSetAttribute.builder().value(Collections.singletonList(0.8275633)) } };
    }

    @Test
    public void value() {
        NumberSetAttribute value = NumberSetAttribute.of();
        value.setValue(Collections.singletonList(0.8275633));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(0.8275633));
    }
}
