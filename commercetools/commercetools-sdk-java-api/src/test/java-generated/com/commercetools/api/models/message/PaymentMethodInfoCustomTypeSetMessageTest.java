
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomTypeSetMessageBuilder builder) {
        PaymentMethodInfoCustomTypeSetMessage paymentMethodInfoCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomTypeSetMessage)
                .isInstanceOf(PaymentMethodInfoCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        PaymentMethodInfoCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId", PaymentMethodInfoCustomTypeSetMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        PaymentMethodInfoCustomTypeSetMessage value = PaymentMethodInfoCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        PaymentMethodInfoCustomTypeSetMessage value = PaymentMethodInfoCustomTypeSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
