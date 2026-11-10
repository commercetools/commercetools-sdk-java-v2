
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumValueBuilder builder) {
        EnumValue enumValue = builder.buildUnchecked();
        Assertions.assertThat(enumValue).isInstanceOf(EnumValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", EnumValue.builder().key("key") },
                new Object[] { "label", EnumValue.builder().label("label") } };
    }

    @Test
    public void key() {
        EnumValue value = EnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        EnumValue value = EnumValue.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
