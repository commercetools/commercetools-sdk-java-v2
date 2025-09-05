
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardBalanceSuccessTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardBalanceSuccessBuilder builder) {
        GiftCardBalanceSuccess giftCardBalanceSuccess = builder.buildUnchecked();
        Assertions.assertThat(giftCardBalanceSuccess).isInstanceOf(GiftCardBalanceSuccess.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardBalanceSuccess.builder().severity("severity") },
                new Object[] { "message", GiftCardBalanceSuccess.builder().message("message") },
                new Object[] { "correlationId", GiftCardBalanceSuccess.builder().correlationId("correlationId") },
                new Object[] { "payload", GiftCardBalanceSuccess.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        GiftCardBalanceSuccess value = GiftCardBalanceSuccess.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardBalanceSuccess value = GiftCardBalanceSuccess.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardBalanceSuccess value = GiftCardBalanceSuccess.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        GiftCardBalanceSuccess value = GiftCardBalanceSuccess.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
