
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder builder) {
        PaymentMethodInfoCustomTypeRemovedMessagePayload paymentMethodInfoCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomTypeRemovedMessagePayload)
                .isInstanceOf(PaymentMethodInfoCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldTypeId",
                PaymentMethodInfoCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        PaymentMethodInfoCustomTypeRemovedMessagePayload value = PaymentMethodInfoCustomTypeRemovedMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
