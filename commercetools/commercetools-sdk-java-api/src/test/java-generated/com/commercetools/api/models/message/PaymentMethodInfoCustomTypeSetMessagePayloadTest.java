
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomTypeSetMessagePayloadBuilder builder) {
        PaymentMethodInfoCustomTypeSetMessagePayload paymentMethodInfoCustomTypeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomTypeSetMessagePayload)
                .isInstanceOf(PaymentMethodInfoCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        PaymentMethodInfoCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId",
                        PaymentMethodInfoCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        PaymentMethodInfoCustomTypeSetMessagePayload value = PaymentMethodInfoCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        PaymentMethodInfoCustomTypeSetMessagePayload value = PaymentMethodInfoCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
