
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodKeySetMessageBuilder builder) {
        PaymentMethodKeySetMessage paymentMethodKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodKeySetMessage).isInstanceOf(PaymentMethodKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentMethodKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", PaymentMethodKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        PaymentMethodKeySetMessage value = PaymentMethodKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        PaymentMethodKeySetMessage value = PaymentMethodKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
