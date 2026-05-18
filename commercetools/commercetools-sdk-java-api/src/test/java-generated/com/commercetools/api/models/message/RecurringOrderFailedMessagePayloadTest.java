
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderFailedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderFailedMessagePayloadBuilder builder) {
        RecurringOrderFailedMessagePayload recurringOrderFailedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderFailedMessagePayload)
                .isInstanceOf(RecurringOrderFailedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "cartId", RecurringOrderFailedMessagePayload.builder().cartId("cartId") },
                new Object[] { "failedAt",
                        RecurringOrderFailedMessagePayload.builder()
                                .failedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "failureReason",
                        RecurringOrderFailedMessagePayload.builder().failureReason("failureReason") },
                new Object[] { "orderScheduledAt",
                        RecurringOrderFailedMessagePayload.builder()
                                .orderScheduledAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "errors",
                        RecurringOrderFailedMessagePayload.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl())) } };
    }

    @Test
    public void cartId() {
        RecurringOrderFailedMessagePayload value = RecurringOrderFailedMessagePayload.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }

    @Test
    public void failedAt() {
        RecurringOrderFailedMessagePayload value = RecurringOrderFailedMessagePayload.of();
        value.setFailedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getFailedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void failureReason() {
        RecurringOrderFailedMessagePayload value = RecurringOrderFailedMessagePayload.of();
        value.setFailureReason("failureReason");
        Assertions.assertThat(value.getFailureReason()).isEqualTo("failureReason");
    }

    @Test
    public void orderScheduledAt() {
        RecurringOrderFailedMessagePayload value = RecurringOrderFailedMessagePayload.of();
        value.setOrderScheduledAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOrderScheduledAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void errors() {
        RecurringOrderFailedMessagePayload value = RecurringOrderFailedMessagePayload.of();
        value.setErrors(
            Collections.singletonList(new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl()));
    }
}
