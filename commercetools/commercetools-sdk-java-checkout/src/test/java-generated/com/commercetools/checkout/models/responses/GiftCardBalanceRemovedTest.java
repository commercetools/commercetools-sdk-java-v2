
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GiftCardBalanceRemovedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GiftCardBalanceRemovedBuilder builder) {
        GiftCardBalanceRemoved giftCardBalanceRemoved = builder.buildUnchecked();
        Assertions.assertThat(giftCardBalanceRemoved).isInstanceOf(GiftCardBalanceRemoved.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", GiftCardBalanceRemoved.builder().severity("severity") },
                new Object[] { "message", GiftCardBalanceRemoved.builder().message("message") },
                new Object[] { "correlationId", GiftCardBalanceRemoved.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        GiftCardBalanceRemoved value = GiftCardBalanceRemoved.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        GiftCardBalanceRemoved value = GiftCardBalanceRemoved.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        GiftCardBalanceRemoved value = GiftCardBalanceRemoved.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
