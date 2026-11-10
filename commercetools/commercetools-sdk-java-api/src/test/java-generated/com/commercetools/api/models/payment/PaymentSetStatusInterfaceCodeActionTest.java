
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetStatusInterfaceCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetStatusInterfaceCodeActionBuilder builder) {
        PaymentSetStatusInterfaceCodeAction paymentSetStatusInterfaceCodeAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetStatusInterfaceCodeAction)
                .isInstanceOf(PaymentSetStatusInterfaceCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceCode",
                PaymentSetStatusInterfaceCodeAction.builder().interfaceCode("interfaceCode") } };
    }

    @Test
    public void interfaceCode() {
        PaymentSetStatusInterfaceCodeAction value = PaymentSetStatusInterfaceCodeAction.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }
}
