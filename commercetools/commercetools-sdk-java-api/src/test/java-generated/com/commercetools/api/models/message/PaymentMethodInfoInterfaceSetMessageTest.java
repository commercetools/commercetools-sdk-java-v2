
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoInterfaceSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoInterfaceSetMessageBuilder builder) {
        PaymentMethodInfoInterfaceSetMessage paymentMethodInfoInterfaceSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoInterfaceSetMessage)
                .isInstanceOf(PaymentMethodInfoInterfaceSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interface", PaymentMethodInfoInterfaceSetMessage.builder()._interface("_interface") },
                new Object[] { "oldInterface",
                        PaymentMethodInfoInterfaceSetMessage.builder().oldInterface("oldInterface") } };
    }

    @Test
    public void _interface() {
        PaymentMethodInfoInterfaceSetMessage value = PaymentMethodInfoInterfaceSetMessage.of();
        value.setInterface("interface");
        Assertions.assertThat(value.getInterface()).isEqualTo("interface");
    }

    @Test
    public void oldInterface() {
        PaymentMethodInfoInterfaceSetMessage value = PaymentMethodInfoInterfaceSetMessage.of();
        value.setOldInterface("oldInterface");
        Assertions.assertThat(value.getOldInterface()).isEqualTo("oldInterface");
    }
}
