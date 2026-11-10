
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumSetFieldBuilder builder) {
        EnumSetField enumSetField = builder.buildUnchecked();
        Assertions.assertThat(enumSetField).isInstanceOf(EnumSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", EnumSetField.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        EnumSetField value = EnumSetField.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
