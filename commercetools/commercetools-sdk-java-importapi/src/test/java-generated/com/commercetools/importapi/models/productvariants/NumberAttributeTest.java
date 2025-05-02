
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NumberAttributeBuilder builder) {
        NumberAttribute numberAttribute = builder.buildUnchecked();
        Assertions.assertThat(numberAttribute).isInstanceOf(NumberAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", NumberAttribute.builder().value(0.8275633) } };
    }

    @Test
    public void value() {
        NumberAttribute value = NumberAttribute.of();
        value.setValue(0.8275633);
        Assertions.assertThat(value.getValue()).isEqualTo(0.8275633);
    }
}
