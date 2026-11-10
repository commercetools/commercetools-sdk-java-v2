
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentInterfaceIdSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentInterfaceIdSetMessagePayloadBuilder builder) {
        PaymentInterfaceIdSetMessagePayload paymentInterfaceIdSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentInterfaceIdSetMessagePayload)
                .isInstanceOf(PaymentInterfaceIdSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceId",
                        PaymentInterfaceIdSetMessagePayload.builder().interfaceId("interfaceId") },
                new Object[] { "oldInterfaceId",
                        PaymentInterfaceIdSetMessagePayload.builder().oldInterfaceId("oldInterfaceId") } };
    }

    @Test
    public void interfaceId() {
        PaymentInterfaceIdSetMessagePayload value = PaymentInterfaceIdSetMessagePayload.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }

    @Test
    public void oldInterfaceId() {
        PaymentInterfaceIdSetMessagePayload value = PaymentInterfaceIdSetMessagePayload.of();
        value.setOldInterfaceId("oldInterfaceId");
        Assertions.assertThat(value.getOldInterfaceId()).isEqualTo("oldInterfaceId");
    }
}
