
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumSetAttributeBuilder builder) {
        EnumSetAttribute enumSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(enumSetAttribute).isInstanceOf(EnumSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", EnumSetAttribute.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        EnumSetAttribute value = EnumSetAttribute.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
