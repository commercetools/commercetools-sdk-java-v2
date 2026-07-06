
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemRecurrenceInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemRecurrenceInfoBuilder builder) {
        LineItemRecurrenceInfo lineItemRecurrenceInfo = builder.buildUnchecked();
        Assertions.assertThat(lineItemRecurrenceInfo).isInstanceOf(LineItemRecurrenceInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "recurrencePolicy",
                        LineItemRecurrenceInfo.builder()
                                .recurrencePolicy(
                                    new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl()) },
                new Object[] { "priceSelectionMode",
                        LineItemRecurrenceInfo.builder()
                                .priceSelectionMode(
                                    com.commercetools.history.models.common.PriceSelectionMode.findEnum("Fixed")) } };
    }

    @Test
    public void recurrencePolicy() {
        LineItemRecurrenceInfo value = LineItemRecurrenceInfo.of();
        value.setRecurrencePolicy(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
    }

    @Test
    public void priceSelectionMode() {
        LineItemRecurrenceInfo value = LineItemRecurrenceInfo.of();
        value.setPriceSelectionMode(com.commercetools.history.models.common.PriceSelectionMode.findEnum("Fixed"));
        Assertions.assertThat(value.getPriceSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.PriceSelectionMode.findEnum("Fixed"));
    }
}
