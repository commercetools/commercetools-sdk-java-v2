
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BooleanSetAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BooleanSetAttributeBuilder builder) {
        BooleanSetAttribute booleanSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(booleanSetAttribute).isInstanceOf(BooleanSetAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value", BooleanSetAttribute.builder().value(Collections.singletonList(true)) } };
    }

    @Test
    public void value() {
        BooleanSetAttribute value = BooleanSetAttribute.of();
        value.setValue(Collections.singletonList(true));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(true));
    }
}
