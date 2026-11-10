
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardRedeemErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardRedeemErrorBuilder builder) {
        GiftCardRedeemError giftCardRedeemError = builder.buildUnchecked();
        Assertions.assertThat(giftCardRedeemError).isInstanceOf(GiftCardRedeemError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardRedeemError.builder().severity("severity") },
                new Object[] { "message", GiftCardRedeemError.builder().message("message") },
                new Object[] { "correlationId", GiftCardRedeemError.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        GiftCardRedeemError value = GiftCardRedeemError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardRedeemError value = GiftCardRedeemError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardRedeemError value = GiftCardRedeemError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
