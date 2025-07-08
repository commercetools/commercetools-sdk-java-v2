
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemRecurrenceInfoDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemRecurrenceInfoDraftBuilder builder) {
        LineItemRecurrenceInfoDraft lineItemRecurrenceInfoDraft = builder.buildUnchecked();
        Assertions.assertThat(lineItemRecurrenceInfoDraft).isInstanceOf(LineItemRecurrenceInfoDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicy", LineItemRecurrenceInfoDraft.builder()
                .recurrencePolicy(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) },
                new Object[] { "priceSelectionMode", LineItemRecurrenceInfoDraft.builder()
                        .priceSelectionMode(
                            com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed")) } };
    }

    @Test
    public void recurrencePolicy() {
        LineItemRecurrenceInfoDraft value = LineItemRecurrenceInfoDraft.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }

    @Test
    public void priceSelectionMode() {
        LineItemRecurrenceInfoDraft value = LineItemRecurrenceInfoDraft.of();
        value.setPriceSelectionMode(com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed"));
        Assertions.assertThat(value.getPriceSelectionMode())
                .isEqualTo(com.commercetools.api.models.recurring_order.PriceSelectionMode.findEnum("Fixed"));
    }
}
