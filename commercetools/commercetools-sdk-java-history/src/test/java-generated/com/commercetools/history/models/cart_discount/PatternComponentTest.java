
package com.commercetools.history.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PatternComponentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PatternComponentBuilder builder) {
        PatternComponent patternComponent = builder.buildUnchecked();
        Assertions.assertThat(patternComponent).isInstanceOf(PatternComponent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", PatternComponent.builder().type("type") } };
    }

    @Test
    public void type() {
        PatternComponent value = PatternComponent.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
