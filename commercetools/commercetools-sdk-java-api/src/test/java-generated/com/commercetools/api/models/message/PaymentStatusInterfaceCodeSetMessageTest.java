
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusInterfaceCodeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusInterfaceCodeSetMessageBuilder builder) {
        PaymentStatusInterfaceCodeSetMessage paymentStatusInterfaceCodeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusInterfaceCodeSetMessage)
                .isInstanceOf(PaymentStatusInterfaceCodeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceCode",
                PaymentStatusInterfaceCodeSetMessage.builder().interfaceCode("interfaceCode") } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusInterfaceCodeSetMessage value = PaymentStatusInterfaceCodeSetMessage.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }
}
