
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder builder) {
        PaymentMethodInfoCustomFieldChangedMessagePayload paymentMethodInfoCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldChangedMessagePayload)
                .isInstanceOf(PaymentMethodInfoCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", PaymentMethodInfoCustomFieldChangedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldChangedMessagePayload value = PaymentMethodInfoCustomFieldChangedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodInfoCustomFieldChangedMessagePayload value = PaymentMethodInfoCustomFieldChangedMessagePayload
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
