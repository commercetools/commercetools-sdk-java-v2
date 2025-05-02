
package com.commercetools.importapi.models.productvariants;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BooleanAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BooleanAttributeBuilder builder) {
        BooleanAttribute booleanAttribute = builder.buildUnchecked();
        Assertions.assertThat(booleanAttribute).isInstanceOf(BooleanAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", BooleanAttribute.builder().value(true) } };
    }

    @Test
    public void value() {
        BooleanAttribute value = BooleanAttribute.of();
        value.setValue(true);
        Assertions.assertThat(value.getValue()).isEqualTo(true);
    }
}
