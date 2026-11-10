
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SuggestTokenizerTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SuggestTokenizerBuilder builder) {
        SuggestTokenizer suggestTokenizer = builder.buildUnchecked();
        Assertions.assertThat(suggestTokenizer).isInstanceOf(SuggestTokenizer.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", SuggestTokenizer.builder().type("type") } };
    }

    @Test
    public void type() {
        SuggestTokenizer value = SuggestTokenizer.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
