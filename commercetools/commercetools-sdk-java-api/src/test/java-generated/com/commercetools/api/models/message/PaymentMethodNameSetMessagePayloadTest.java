
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodNameSetMessagePayloadBuilder builder) {
        PaymentMethodNameSetMessagePayload paymentMethodNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodNameSetMessagePayload)
                .isInstanceOf(PaymentMethodNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        PaymentMethodNameSetMessagePayload.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldName", PaymentMethodNameSetMessagePayload.builder()
                        .oldName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        PaymentMethodNameSetMessagePayload value = PaymentMethodNameSetMessagePayload.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldName() {
        PaymentMethodNameSetMessagePayload value = PaymentMethodNameSetMessagePayload.of();
        value.setOldName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
