
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeQuoteRequestStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeQuoteRequestStateChangeBuilder builder) {
        ChangeQuoteRequestStateChange changeQuoteRequestStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuoteRequestStateChange).isInstanceOf(ChangeQuoteRequestStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeQuoteRequestStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeQuoteRequestStateChange.builder()
                                .previousValue(
                                    com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted")) },
                new Object[] { "nextValue", ChangeQuoteRequestStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void change() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void nextValue() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
    }
}
