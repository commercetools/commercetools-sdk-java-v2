
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentInterfaceIdSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentInterfaceIdSetMessageBuilder builder) {
        PaymentInterfaceIdSetMessage paymentInterfaceIdSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentInterfaceIdSetMessage).isInstanceOf(PaymentInterfaceIdSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceId", PaymentInterfaceIdSetMessage.builder().interfaceId("interfaceId") },
                new Object[] { "oldInterfaceId",
                        PaymentInterfaceIdSetMessage.builder().oldInterfaceId("oldInterfaceId") } };
    }

    @Test
    public void interfaceId() {
        PaymentInterfaceIdSetMessage value = PaymentInterfaceIdSetMessage.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }

    @Test
    public void oldInterfaceId() {
        PaymentInterfaceIdSetMessage value = PaymentInterfaceIdSetMessage.of();
        value.setOldInterfaceId("oldInterfaceId");
        Assertions.assertThat(value.getOldInterfaceId()).isEqualTo("oldInterfaceId");
    }
}
