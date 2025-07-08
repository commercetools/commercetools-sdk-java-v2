
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemRecurrenceInfoDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemRecurrenceInfoDraftBuilder builder) {
        CustomLineItemRecurrenceInfoDraft customLineItemRecurrenceInfoDraft = builder.buildUnchecked();
        Assertions.assertThat(customLineItemRecurrenceInfoDraft).isInstanceOf(CustomLineItemRecurrenceInfoDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicy", CustomLineItemRecurrenceInfoDraft.builder()
                .recurrencePolicy(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) } };
    }

    @Test
    public void recurrencePolicy() {
        CustomLineItemRecurrenceInfoDraft value = CustomLineItemRecurrenceInfoDraft.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }
}
