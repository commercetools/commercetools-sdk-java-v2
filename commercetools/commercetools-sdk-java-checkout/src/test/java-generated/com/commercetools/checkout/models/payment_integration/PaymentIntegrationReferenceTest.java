
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationReferenceBuilder builder) {
        PaymentIntegrationReference paymentIntegrationReference = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationReference).isInstanceOf(PaymentIntegrationReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentIntegrationReference.builder().id("id") } };
    }

    @Test
    public void id() {
        PaymentIntegrationReference value = PaymentIntegrationReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
