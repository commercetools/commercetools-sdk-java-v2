
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetAnonymousIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetAnonymousIdActionBuilder builder) {
        PaymentSetAnonymousIdAction paymentSetAnonymousIdAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetAnonymousIdAction).isInstanceOf(PaymentSetAnonymousIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "anonymousId", PaymentSetAnonymousIdAction.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousId() {
        PaymentSetAnonymousIdAction value = PaymentSetAnonymousIdAction.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
