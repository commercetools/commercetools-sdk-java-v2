
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoInterfaceAccountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoInterfaceAccountActionBuilder builder) {
        PaymentSetMethodInfoInterfaceAccountAction paymentSetMethodInfoInterfaceAccountAction = builder
                .buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoInterfaceAccountAction)
                .isInstanceOf(PaymentSetMethodInfoInterfaceAccountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceAccount",
                PaymentSetMethodInfoInterfaceAccountAction.builder().interfaceAccount("interfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentSetMethodInfoInterfaceAccountAction value = PaymentSetMethodInfoInterfaceAccountAction.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }
}
