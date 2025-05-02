
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoInterfaceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoInterfaceActionBuilder builder) {
        PaymentSetMethodInfoInterfaceAction paymentSetMethodInfoInterfaceAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoInterfaceAction)
                .isInstanceOf(PaymentSetMethodInfoInterfaceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interface", PaymentSetMethodInfoInterfaceAction.builder()._interface("_interface") } };
    }

    @Test
    public void _interface() {
        PaymentSetMethodInfoInterfaceAction value = PaymentSetMethodInfoInterfaceAction.of();
        value.setInterface("interface");
        Assertions.assertThat(value.getInterface()).isEqualTo("interface");
    }
}
