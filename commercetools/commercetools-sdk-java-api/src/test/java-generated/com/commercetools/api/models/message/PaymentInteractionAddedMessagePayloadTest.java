
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentInteractionAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentInteractionAddedMessagePayloadBuilder builder) {
        PaymentInteractionAddedMessagePayload paymentInteractionAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentInteractionAddedMessagePayload)
                .isInstanceOf(PaymentInteractionAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interaction", PaymentInteractionAddedMessagePayload.builder()
                .interaction(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void interaction() {
        PaymentInteractionAddedMessagePayload value = PaymentInteractionAddedMessagePayload.of();
        value.setInteraction(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getInteraction())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
