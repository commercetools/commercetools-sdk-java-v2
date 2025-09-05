
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardRedeemStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardRedeemStartedBuilder builder) {
        GiftCardRedeemStarted giftCardRedeemStarted = builder.buildUnchecked();
        Assertions.assertThat(giftCardRedeemStarted).isInstanceOf(GiftCardRedeemStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardRedeemStarted.builder().severity("severity") },
                new Object[] { "message", GiftCardRedeemStarted.builder().message("message") },
                new Object[] { "correlationId", GiftCardRedeemStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        GiftCardRedeemStarted value = GiftCardRedeemStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardRedeemStarted value = GiftCardRedeemStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardRedeemStarted value = GiftCardRedeemStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
