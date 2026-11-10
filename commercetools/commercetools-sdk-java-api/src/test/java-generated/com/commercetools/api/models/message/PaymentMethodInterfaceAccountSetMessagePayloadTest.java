
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInterfaceAccountSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInterfaceAccountSetMessagePayloadBuilder builder) {
        PaymentMethodInterfaceAccountSetMessagePayload paymentMethodInterfaceAccountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInterfaceAccountSetMessagePayload)
                .isInstanceOf(PaymentMethodInterfaceAccountSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceAccount",
                        PaymentMethodInterfaceAccountSetMessagePayload.builder().interfaceAccount("interfaceAccount") },
                new Object[] { "oldInterfaceAccount", PaymentMethodInterfaceAccountSetMessagePayload.builder()
                        .oldInterfaceAccount("oldInterfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        PaymentMethodInterfaceAccountSetMessagePayload value = PaymentMethodInterfaceAccountSetMessagePayload.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }

    @Test
    public void oldInterfaceAccount() {
        PaymentMethodInterfaceAccountSetMessagePayload value = PaymentMethodInterfaceAccountSetMessagePayload.of();
        value.setOldInterfaceAccount("oldInterfaceAccount");
        Assertions.assertThat(value.getOldInterfaceAccount()).isEqualTo("oldInterfaceAccount");
    }
}
