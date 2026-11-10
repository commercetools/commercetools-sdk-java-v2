
package com.commercetools.api.models.recurring_order;

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
        return new Object[][] { new Object[] { "recurrencePolicy", LineItemRecurrenceInfo.builder()
                .recurrencePolicy(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl()) },
                new Object[] { "priceSelectionMode", LineItemRecurrenceInfo.builder()
                        .priceSelectionMode(
                            com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed")) } };
    }

    @Test
    public void recurrencePolicy() {
        LineItemRecurrenceInfo value = LineItemRecurrenceInfo.of();
        value.setRecurrencePolicy(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
    }

    @Test
    public void priceSelectionMode() {
        LineItemRecurrenceInfo value = LineItemRecurrenceInfo.of();
        value.setPriceSelectionMode(com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed"));
        Assertions.assertThat(value.getPriceSelectionMode())
                .isEqualTo(com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed"));
    }
}
