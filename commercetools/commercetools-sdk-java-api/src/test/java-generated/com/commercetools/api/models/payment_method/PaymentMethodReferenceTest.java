
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodReferenceBuilder builder) {
        PaymentMethodReference paymentMethodReference = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodReference).isInstanceOf(PaymentMethodReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        PaymentMethodReference.builder()
                                .obj(new com.commercetools.api.models.payment_method.PaymentMethodImpl()) },
                new Object[] { "id", PaymentMethodReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        PaymentMethodReference value = PaymentMethodReference.of();
        value.setObj(new com.commercetools.api.models.payment_method.PaymentMethodImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodImpl());
    }

    @Test
    public void id() {
        PaymentMethodReference value = PaymentMethodReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
