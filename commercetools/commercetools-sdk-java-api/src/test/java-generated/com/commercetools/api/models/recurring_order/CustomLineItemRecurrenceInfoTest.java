
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemRecurrenceInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemRecurrenceInfoBuilder builder) {
        CustomLineItemRecurrenceInfo customLineItemRecurrenceInfo = builder.buildUnchecked();
        Assertions.assertThat(customLineItemRecurrenceInfo).isInstanceOf(CustomLineItemRecurrenceInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicy",
                CustomLineItemRecurrenceInfo.builder()
                        .recurrencePolicy(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl()) } };
    }

    @Test
    public void recurrencePolicy() {
        CustomLineItemRecurrenceInfo value = CustomLineItemRecurrenceInfo.of();
        value.setRecurrencePolicy(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceImpl());
    }
}
