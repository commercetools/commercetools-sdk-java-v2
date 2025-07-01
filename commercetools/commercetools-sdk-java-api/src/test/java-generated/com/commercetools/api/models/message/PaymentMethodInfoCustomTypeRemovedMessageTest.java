
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomTypeRemovedMessageBuilder builder) {
        PaymentMethodInfoCustomTypeRemovedMessage paymentMethodInfoCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomTypeRemovedMessage)
                .isInstanceOf(PaymentMethodInfoCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldTypeId",
                PaymentMethodInfoCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        PaymentMethodInfoCustomTypeRemovedMessage value = PaymentMethodInfoCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
