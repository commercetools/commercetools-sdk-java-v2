
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentInteractionAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentInteractionAddedMessageBuilder builder) {
        PaymentInteractionAddedMessage paymentInteractionAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentInteractionAddedMessage).isInstanceOf(PaymentInteractionAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interaction", PaymentInteractionAddedMessage.builder()
                .interaction(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void interaction() {
        PaymentInteractionAddedMessage value = PaymentInteractionAddedMessage.of();
        value.setInteraction(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getInteraction())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
