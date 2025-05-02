
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentResourceIdentifierBuilder builder) {
        PaymentResourceIdentifier paymentResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(paymentResourceIdentifier).isInstanceOf(PaymentResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentResourceIdentifier.builder().id("id") },
                new Object[] { "key", PaymentResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        PaymentResourceIdentifier value = PaymentResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        PaymentResourceIdentifier value = PaymentResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
