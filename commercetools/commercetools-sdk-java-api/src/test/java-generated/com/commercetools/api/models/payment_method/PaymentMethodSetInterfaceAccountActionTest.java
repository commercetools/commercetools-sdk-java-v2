
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetInterfaceAccountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetInterfaceAccountActionBuilder builder) {
        PaymentMethodSetInterfaceAccountAction paymentMethodSetInterfaceAccountAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetInterfaceAccountAction)
                .isInstanceOf(PaymentMethodSetInterfaceAccountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceAccount",
                PaymentMethodSetInterfaceAccountAction.builder().interfaceAccount("interfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodSetInterfaceAccountAction value = PaymentMethodSetInterfaceAccountAction.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }
}
