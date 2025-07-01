
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoInterfaceAccountSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder builder) {
        PaymentMethodInfoInterfaceAccountSetMessagePayload paymentMethodInfoInterfaceAccountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoInterfaceAccountSetMessagePayload)
                .isInstanceOf(PaymentMethodInfoInterfaceAccountSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceAccount",
                        PaymentMethodInfoInterfaceAccountSetMessagePayload.builder()
                                .interfaceAccount("interfaceAccount") },
                new Object[] { "oldInterfaceAccount", PaymentMethodInfoInterfaceAccountSetMessagePayload.builder()
                        .oldInterfaceAccount("oldInterfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodInfoInterfaceAccountSetMessagePayload value = PaymentMethodInfoInterfaceAccountSetMessagePayload
                .of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void oldInterfaceAccount() {
        PaymentMethodInfoInterfaceAccountSetMessagePayload value = PaymentMethodInfoInterfaceAccountSetMessagePayload
                .of();
        value.setOldInterfaceAccount("oldInterfaceAccount");
        Assertions.assertThat(value.getOldInterfaceAccount()).isEqualTo("oldInterfaceAccount");
    }
}
