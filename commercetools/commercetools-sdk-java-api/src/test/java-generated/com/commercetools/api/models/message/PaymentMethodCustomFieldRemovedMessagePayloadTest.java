
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldRemovedMessagePayloadBuilder builder) {
        PaymentMethodCustomFieldRemovedMessagePayload paymentMethodCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldRemovedMessagePayload)
                .isInstanceOf(PaymentMethodCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldRemovedMessagePayload value = PaymentMethodCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
