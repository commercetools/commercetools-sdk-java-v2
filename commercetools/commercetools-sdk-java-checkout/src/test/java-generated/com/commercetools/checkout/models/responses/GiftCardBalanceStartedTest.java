
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardBalanceStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardBalanceStartedBuilder builder) {
        GiftCardBalanceStarted giftCardBalanceStarted = builder.buildUnchecked();
        Assertions.assertThat(giftCardBalanceStarted).isInstanceOf(GiftCardBalanceStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardBalanceStarted.builder().severity("severity") },
                new Object[] { "message", GiftCardBalanceStarted.builder().message("message") },
                new Object[] { "correlationId", GiftCardBalanceStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        GiftCardBalanceStarted value = GiftCardBalanceStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardBalanceStarted value = GiftCardBalanceStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardBalanceStarted value = GiftCardBalanceStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
