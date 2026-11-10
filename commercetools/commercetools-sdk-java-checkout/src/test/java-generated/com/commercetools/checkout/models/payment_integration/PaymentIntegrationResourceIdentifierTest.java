
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationResourceIdentifierBuilder builder) {
        PaymentIntegrationResourceIdentifier paymentIntegrationResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationResourceIdentifier)
                .isInstanceOf(PaymentIntegrationResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentIntegrationResourceIdentifier.builder().id("id") },
                new Object[] { "key", PaymentIntegrationResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        PaymentIntegrationResourceIdentifier value = PaymentIntegrationResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        PaymentIntegrationResourceIdentifier value = PaymentIntegrationResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
