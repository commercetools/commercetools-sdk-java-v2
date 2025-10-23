
package com.commercetools.history.models.common;

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
        return new Object[][] { new Object[] { "recurrencePolicy", CustomLineItemRecurrenceInfo.builder()
                .recurrencePolicy(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl()) } };
    }

    @Test
    public void recurrencePolicy() {
        CustomLineItemRecurrenceInfo value = CustomLineItemRecurrenceInfo.of();
        value.setRecurrencePolicy(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.history.models.common.RecurrencePolicyReferenceImpl());
    }
}
