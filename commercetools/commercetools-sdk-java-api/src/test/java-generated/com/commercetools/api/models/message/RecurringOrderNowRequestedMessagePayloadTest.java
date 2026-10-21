
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderNowRequestedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderNowRequestedMessagePayloadBuilder builder) {
        RecurringOrderNowRequestedMessagePayload recurringOrderNowRequestedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderNowRequestedMessagePayload)
                .isInstanceOf(RecurringOrderNowRequestedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "requestedAt",
                        RecurringOrderNowRequestedMessagePayload.builder()
                                .requestedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "reason", RecurringOrderNowRequestedMessagePayload.builder().reason("reason") } };
    }

    @Test
    public void requestedAt() {
        RecurringOrderNowRequestedMessagePayload value = RecurringOrderNowRequestedMessagePayload.of();
        value.setRequestedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getRequestedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void reason() {
        RecurringOrderNowRequestedMessagePayload value = RecurringOrderNowRequestedMessagePayload.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
