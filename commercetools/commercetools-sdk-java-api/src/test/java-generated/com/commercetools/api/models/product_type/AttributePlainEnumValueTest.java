
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributePlainEnumValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributePlainEnumValueBuilder builder) {
        AttributePlainEnumValue attributePlainEnumValue = builder.buildUnchecked();
        Assertions.assertThat(attributePlainEnumValue).isInstanceOf(AttributePlainEnumValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AttributePlainEnumValue.builder().key("key") },
                new Object[] { "label", AttributePlainEnumValue.builder().label("label") } };
    }

    @Test
    public void key() {
        AttributePlainEnumValue value = AttributePlainEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        AttributePlainEnumValue value = AttributePlainEnumValue.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
