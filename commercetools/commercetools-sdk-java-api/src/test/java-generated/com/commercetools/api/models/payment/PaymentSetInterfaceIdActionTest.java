
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetInterfaceIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetInterfaceIdActionBuilder builder) {
        PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetInterfaceIdAction).isInstanceOf(PaymentSetInterfaceIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceId", PaymentSetInterfaceIdAction.builder().interfaceId("interfaceId") } };
    }

    @Test
    public void interfaceId() {
        PaymentSetInterfaceIdAction value = PaymentSetInterfaceIdAction.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }
}
