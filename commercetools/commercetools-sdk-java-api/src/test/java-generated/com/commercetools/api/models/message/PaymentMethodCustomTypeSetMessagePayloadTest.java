
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomTypeSetMessagePayloadBuilder builder) {
        PaymentMethodCustomTypeSetMessagePayload paymentMethodCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCustomTypeSetMessagePayload)
                .isInstanceOf(PaymentMethodCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        PaymentMethodCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId",
                        PaymentMethodCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        PaymentMethodCustomTypeSetMessagePayload value = PaymentMethodCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        PaymentMethodCustomTypeSetMessagePayload value = PaymentMethodCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
