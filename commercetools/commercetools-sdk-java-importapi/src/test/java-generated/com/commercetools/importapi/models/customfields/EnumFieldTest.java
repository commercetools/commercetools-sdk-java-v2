
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumFieldBuilder builder) {
        EnumField enumField = builder.buildUnchecked();
        Assertions.assertThat(enumField).isInstanceOf(EnumField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", EnumField.builder().value("value") } };
    }

    @Test
    public void value() {
        EnumField value = EnumField.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
