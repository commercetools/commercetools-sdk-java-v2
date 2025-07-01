
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldAddedMessagePayloadBuilder builder) {
        PaymentMethodCustomFieldAddedMessagePayload paymentMethodCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldAddedMessagePayload)
                .isInstanceOf(PaymentMethodCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", PaymentMethodCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldAddedMessagePayload value = PaymentMethodCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodCustomFieldAddedMessagePayload value = PaymentMethodCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
