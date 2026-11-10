
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodKeySetMessagePayloadBuilder builder) {
        PaymentMethodKeySetMessagePayload paymentMethodKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodKeySetMessagePayload).isInstanceOf(PaymentMethodKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentMethodKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", PaymentMethodKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        PaymentMethodKeySetMessagePayload value = PaymentMethodKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        PaymentMethodKeySetMessagePayload value = PaymentMethodKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
