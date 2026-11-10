
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetStatusInterfaceTextActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetStatusInterfaceTextActionBuilder builder) {
        PaymentSetStatusInterfaceTextAction paymentSetStatusInterfaceTextAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetStatusInterfaceTextAction)
                .isInstanceOf(PaymentSetStatusInterfaceTextAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceText",
                PaymentSetStatusInterfaceTextAction.builder().interfaceText("interfaceText") } };
    }

    @Test
    public void interfaceText() {
        PaymentSetStatusInterfaceTextAction value = PaymentSetStatusInterfaceTextAction.of();
        value.setInterfaceText("interfaceText");
        Assertions.assertThat(value.getInterfaceText()).isEqualTo("interfaceText");
    }
}
