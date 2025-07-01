
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodNameSetMessageBuilder builder) {
        PaymentMethodNameSetMessage paymentMethodNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodNameSetMessage).isInstanceOf(PaymentMethodNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        PaymentMethodNameSetMessage.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldName", PaymentMethodNameSetMessage.builder()
                        .oldName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        PaymentMethodNameSetMessage value = PaymentMethodNameSetMessage.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldName() {
        PaymentMethodNameSetMessage value = PaymentMethodNameSetMessage.of();
        value.setOldName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
