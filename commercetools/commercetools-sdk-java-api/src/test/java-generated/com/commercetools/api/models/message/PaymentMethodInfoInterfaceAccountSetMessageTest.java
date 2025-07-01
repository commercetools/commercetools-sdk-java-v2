
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoInterfaceAccountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoInterfaceAccountSetMessageBuilder builder) {
        PaymentMethodInfoInterfaceAccountSetMessage paymentMethodInfoInterfaceAccountSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoInterfaceAccountSetMessage)
                .isInstanceOf(PaymentMethodInfoInterfaceAccountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceAccount",
                        PaymentMethodInfoInterfaceAccountSetMessage.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "oldInterfaceAccount", PaymentMethodInfoInterfaceAccountSetMessage.builder()
                        .oldInterfaceAccount("oldInterfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodInfoInterfaceAccountSetMessage value = PaymentMethodInfoInterfaceAccountSetMessage.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void oldInterfaceAccount() {
        PaymentMethodInfoInterfaceAccountSetMessage value = PaymentMethodInfoInterfaceAccountSetMessage.of();
        value.setOldInterfaceAccount("oldInterfaceAccount");
        Assertions.assertThat(value.getOldInterfaceAccount()).isEqualTo("oldInterfaceAccount");
    }
}
