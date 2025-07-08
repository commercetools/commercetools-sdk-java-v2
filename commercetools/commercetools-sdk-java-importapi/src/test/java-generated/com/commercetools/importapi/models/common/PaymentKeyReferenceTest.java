
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentKeyReferenceBuilder builder) {
        PaymentKeyReference paymentKeyReference = builder.buildUnchecked();
        Assertions.assertThat(paymentKeyReference).isInstanceOf(PaymentKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        PaymentKeyReference value = PaymentKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
