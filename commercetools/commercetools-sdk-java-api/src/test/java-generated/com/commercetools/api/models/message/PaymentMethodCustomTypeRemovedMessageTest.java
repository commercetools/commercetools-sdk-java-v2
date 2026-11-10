
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomTypeRemovedMessageBuilder builder) {
        PaymentMethodCustomTypeRemovedMessage paymentMethodCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCustomTypeRemovedMessage)
                .isInstanceOf(PaymentMethodCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldTypeId", PaymentMethodCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        PaymentMethodCustomTypeRemovedMessage value = PaymentMethodCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
