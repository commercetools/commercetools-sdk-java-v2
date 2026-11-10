
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SuggestionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SuggestionBuilder builder) {
        Suggestion suggestion = builder.buildUnchecked();
        Assertions.assertThat(suggestion).isInstanceOf(Suggestion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "text", Suggestion.builder().text("text") } };
    }

    @Test
    public void text() {
        Suggestion value = Suggestion.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }
}
