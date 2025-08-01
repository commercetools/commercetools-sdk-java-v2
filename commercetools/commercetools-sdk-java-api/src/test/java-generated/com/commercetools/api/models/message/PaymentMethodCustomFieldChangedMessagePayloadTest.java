
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldChangedMessagePayloadBuilder builder) {
        PaymentMethodCustomFieldChangedMessagePayload paymentMethodCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldChangedMessagePayload)
                .isInstanceOf(PaymentMethodCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", PaymentMethodCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "oldValue",
                        PaymentMethodCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldChangedMessagePayload value = PaymentMethodCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodCustomFieldChangedMessagePayload value = PaymentMethodCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        PaymentMethodCustomFieldChangedMessagePayload value = PaymentMethodCustomFieldChangedMessagePayload.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
