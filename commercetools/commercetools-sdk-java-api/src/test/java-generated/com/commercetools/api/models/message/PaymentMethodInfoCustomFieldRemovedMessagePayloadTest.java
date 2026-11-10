
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder builder) {
        PaymentMethodInfoCustomFieldRemovedMessagePayload paymentMethodInfoCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldRemovedMessagePayload)
                .isInstanceOf(PaymentMethodInfoCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldRemovedMessagePayload value = PaymentMethodInfoCustomFieldRemovedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
