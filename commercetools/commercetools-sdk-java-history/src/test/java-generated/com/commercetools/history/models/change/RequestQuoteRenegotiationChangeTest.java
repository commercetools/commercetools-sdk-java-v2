
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RequestQuoteRenegotiationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RequestQuoteRenegotiationChangeBuilder builder) {
        RequestQuoteRenegotiationChange requestQuoteRenegotiationChange = builder.buildUnchecked();
        Assertions.assertThat(requestQuoteRenegotiationChange).isInstanceOf(RequestQuoteRenegotiationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RequestQuoteRenegotiationChange.builder().change("change") },
                new Object[] { "previousValue", RequestQuoteRenegotiationChange.builder()
                        .previousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { "nextValue",
                        RequestQuoteRenegotiationChange.builder()
                                .nextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { "buyerComment",
                        RequestQuoteRenegotiationChange.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void change() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void nextValue() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void buyerComment() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
