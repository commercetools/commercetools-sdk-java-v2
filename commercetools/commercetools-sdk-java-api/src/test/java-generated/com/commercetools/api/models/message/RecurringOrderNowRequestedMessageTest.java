
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderNowRequestedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderNowRequestedMessageBuilder builder) {
        RecurringOrderNowRequestedMessage recurringOrderNowRequestedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderNowRequestedMessage).isInstanceOf(RecurringOrderNowRequestedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "requestedAt",
                        RecurringOrderNowRequestedMessage.builder()
                                .requestedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "reason", RecurringOrderNowRequestedMessage.builder().reason("reason") } };
    }

    @Test
    public void requestedAt() {
        RecurringOrderNowRequestedMessage value = RecurringOrderNowRequestedMessage.of();
        value.setRequestedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getRequestedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void reason() {
        RecurringOrderNowRequestedMessage value = RecurringOrderNowRequestedMessage.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
