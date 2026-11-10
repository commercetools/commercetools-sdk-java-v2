
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoInterfaceSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoInterfaceSetMessagePayloadBuilder builder) {
        PaymentMethodInfoInterfaceSetMessagePayload paymentMethodInfoInterfaceSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoInterfaceSetMessagePayload)
                .isInstanceOf(PaymentMethodInfoInterfaceSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interface",
                        PaymentMethodInfoInterfaceSetMessagePayload.builder()._interface("_interface") },
                new Object[] { "oldInterface",
                        PaymentMethodInfoInterfaceSetMessagePayload.builder().oldInterface("oldInterface") } };
    }

    @Test
    public void _interface() {
        PaymentMethodInfoInterfaceSetMessagePayload value = PaymentMethodInfoInterfaceSetMessagePayload.of();
        value.setInterface("interface");
        Assertions.assertThat(value.getInterface()).isEqualTo("interface");
    }

    @Test
    public void oldInterface() {
        PaymentMethodInfoInterfaceSetMessagePayload value = PaymentMethodInfoInterfaceSetMessagePayload.of();
        value.setOldInterface("oldInterface");
        Assertions.assertThat(value.getOldInterface()).isEqualTo("oldInterface");
    }
}
