
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomTypeRemovedMessagePayloadBuilder builder) {
        PaymentMethodCustomTypeRemovedMessagePayload paymentMethodCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodCustomTypeRemovedMessagePayload)
                .isInstanceOf(PaymentMethodCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldTypeId",
                PaymentMethodCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        PaymentMethodCustomTypeRemovedMessagePayload value = PaymentMethodCustomTypeRemovedMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
