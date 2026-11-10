
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder builder) {
        PaymentMethodInfoCustomFieldAddedMessagePayload paymentMethodInfoCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldAddedMessagePayload)
                .isInstanceOf(PaymentMethodInfoCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", PaymentMethodInfoCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldAddedMessagePayload value = PaymentMethodInfoCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodInfoCustomFieldAddedMessagePayload value = PaymentMethodInfoCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
