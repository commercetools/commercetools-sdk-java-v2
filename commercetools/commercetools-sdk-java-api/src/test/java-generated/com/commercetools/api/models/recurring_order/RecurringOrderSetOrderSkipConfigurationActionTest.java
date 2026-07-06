
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetOrderSkipConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetOrderSkipConfigurationActionBuilder builder) {
        RecurringOrderSetOrderSkipConfigurationAction recurringOrderSetOrderSkipConfigurationAction = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderSetOrderSkipConfigurationAction)
                .isInstanceOf(RecurringOrderSetOrderSkipConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "skipConfigurationInputDraft",
                        RecurringOrderSetOrderSkipConfigurationAction.builder()
                                .skipConfigurationInputDraft(
                                    new com.commercetools.api.models.recurring_order.SkipConfigurationDraftImpl()) },
                new Object[] { "updatedExpiresAt", RecurringOrderSetOrderSkipConfigurationAction.builder()
                        .updatedExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void skipConfigurationInputDraft() {
        RecurringOrderSetOrderSkipConfigurationAction value = RecurringOrderSetOrderSkipConfigurationAction.of();
        value.setSkipConfigurationInputDraft(
            new com.commercetools.api.models.recurring_order.SkipConfigurationDraftImpl());
        Assertions.assertThat(value.getSkipConfigurationInputDraft())
                .isEqualTo(new com.commercetools.api.models.recurring_order.SkipConfigurationDraftImpl());
    }

    @Test
    public void updatedExpiresAt() {
        RecurringOrderSetOrderSkipConfigurationAction value = RecurringOrderSetOrderSkipConfigurationAction.of();
        value.setUpdatedExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getUpdatedExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
