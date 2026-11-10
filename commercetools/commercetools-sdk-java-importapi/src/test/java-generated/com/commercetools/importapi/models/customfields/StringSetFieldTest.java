
package com.commercetools.importapi.models.customfields;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StringSetFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StringSetFieldBuilder builder) {
        StringSetField stringSetField = builder.buildUnchecked();
        Assertions.assertThat(stringSetField).isInstanceOf(StringSetField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", StringSetField.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        StringSetField value = StringSetField.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
