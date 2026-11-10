
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderFailedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderFailedMessageBuilder builder) {
        RecurringOrderFailedMessage recurringOrderFailedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderFailedMessage).isInstanceOf(RecurringOrderFailedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartId", RecurringOrderFailedMessage.builder().cartId("cartId") },
                new Object[] { "failedAt",
                        RecurringOrderFailedMessage.builder().failedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "failureReason", RecurringOrderFailedMessage.builder().failureReason("failureReason") },
                new Object[] { "orderScheduledAt",
                        RecurringOrderFailedMessage.builder()
                                .orderScheduledAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "errors",
                        RecurringOrderFailedMessage.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl())) } };
    }

    @Test
    public void cartId() {
        RecurringOrderFailedMessage value = RecurringOrderFailedMessage.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }

    @Test
    public void failedAt() {
        RecurringOrderFailedMessage value = RecurringOrderFailedMessage.of();
        value.setFailedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getFailedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void failureReason() {
        RecurringOrderFailedMessage value = RecurringOrderFailedMessage.of();
        value.setFailureReason("failureReason");
        Assertions.assertThat(value.getFailureReason()).isEqualTo("failureReason");
    }

    @Test
    public void orderScheduledAt() {
        RecurringOrderFailedMessage value = RecurringOrderFailedMessage.of();
        value.setOrderScheduledAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOrderScheduledAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void errors() {
        RecurringOrderFailedMessage value = RecurringOrderFailedMessage.of();
        value.setErrors(
            Collections.singletonList(new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.error.RecurringOrderFailureErrorImpl()));
    }
}
