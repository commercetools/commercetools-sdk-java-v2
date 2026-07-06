
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardBalanceErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardBalanceErrorBuilder builder) {
        GiftCardBalanceError giftCardBalanceError = builder.buildUnchecked();
        Assertions.assertThat(giftCardBalanceError).isInstanceOf(GiftCardBalanceError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardBalanceError.builder().severity("severity") },
                new Object[] { "message", GiftCardBalanceError.builder().message("message") },
                new Object[] { "correlationId", GiftCardBalanceError.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        GiftCardBalanceError value = GiftCardBalanceError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardBalanceError value = GiftCardBalanceError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardBalanceError value = GiftCardBalanceError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
