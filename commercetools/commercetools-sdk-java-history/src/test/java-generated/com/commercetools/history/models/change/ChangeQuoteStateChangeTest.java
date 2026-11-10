
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeQuoteStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeQuoteStateChangeBuilder builder) {
        ChangeQuoteStateChange changeQuoteStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuoteStateChange).isInstanceOf(ChangeQuoteStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeQuoteStateChange.builder().change("change") },
                new Object[] { "previousValue", ChangeQuoteStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { "nextValue", ChangeQuoteStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void change() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void nextValue() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }
}
