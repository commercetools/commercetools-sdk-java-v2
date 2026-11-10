
package com.commercetools.importapi.models.customfields;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BooleanFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BooleanFieldBuilder builder) {
        BooleanField booleanField = builder.buildUnchecked();
        Assertions.assertThat(booleanField).isInstanceOf(BooleanField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", BooleanField.builder().value(true) } };
    }

    @Test
    public void value() {
        BooleanField value = BooleanField.of();
        value.setValue(true);
        Assertions.assertThat(value.getValue()).isEqualTo(true);
    }
}
