
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusInterfaceCodeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder) {
        PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentStatusInterfaceCodeSetMessagePayload)
                .isInstanceOf(PaymentStatusInterfaceCodeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceCode",
                PaymentStatusInterfaceCodeSetMessagePayload.builder().interfaceCode("interfaceCode") } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusInterfaceCodeSetMessagePayload value = PaymentStatusInterfaceCodeSetMessagePayload.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }
}
