
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TextSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TextSetAttributeBuilder builder) {
        TextSetAttribute textSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(textSetAttribute).isInstanceOf(TextSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", TextSetAttribute.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        TextSetAttribute value = TextSetAttribute.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
