
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInterfaceAccountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInterfaceAccountSetMessageBuilder builder) {
        PaymentMethodInterfaceAccountSetMessage paymentMethodInterfaceAccountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInterfaceAccountSetMessage)
                .isInstanceOf(PaymentMethodInterfaceAccountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceAccount",
                        PaymentMethodInterfaceAccountSetMessage.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "oldInterfaceAccount", PaymentMethodInterfaceAccountSetMessage.builder()
                        .oldInterfaceAccount("oldInterfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodInterfaceAccountSetMessage value = PaymentMethodInterfaceAccountSetMessage.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void oldInterfaceAccount() {
        PaymentMethodInterfaceAccountSetMessage value = PaymentMethodInterfaceAccountSetMessage.of();
        value.setOldInterfaceAccount("oldInterfaceAccount");
        Assertions.assertThat(value.getOldInterfaceAccount()).isEqualTo("oldInterfaceAccount");
    }
}
