
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomTokenizerTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomTokenizerBuilder builder) {
        CustomTokenizer customTokenizer = builder.buildUnchecked();
        Assertions.assertThat(customTokenizer).isInstanceOf(CustomTokenizer.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "inputs", CustomTokenizer.builder().inputs(Collections.singletonList("inputs")) } };
    }

    @Test
    public void inputs() {
        CustomTokenizer value = CustomTokenizer.of();
        value.setInputs(Collections.singletonList("inputs"));
        Assertions.assertThat(value.getInputs()).isEqualTo(Collections.singletonList("inputs"));
    }
}
