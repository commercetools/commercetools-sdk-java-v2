
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BooleanSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BooleanSetFieldBuilder builder) {
        BooleanSetField booleanSetField = builder.buildUnchecked();
        Assertions.assertThat(booleanSetField).isInstanceOf(BooleanSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", BooleanSetField.builder().value(Collections.singletonList(true)) } };
    }

    @Test
    public void value() {
        BooleanSetField value = BooleanSetField.of();
        value.setValue(Collections.singletonList(true));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(true));
    }
}
