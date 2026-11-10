
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentReferenceBuilder builder) {
        PaymentReference paymentReference = builder.buildUnchecked();
        Assertions.assertThat(paymentReference).isInstanceOf(PaymentReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        PaymentReference.builder().obj(new com.commercetools.api.models.payment.PaymentImpl()) },
                new Object[] { "id", PaymentReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        PaymentReference value = PaymentReference.of();
        value.setObj(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }

    @Test
    public void id() {
        PaymentReference value = PaymentReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
