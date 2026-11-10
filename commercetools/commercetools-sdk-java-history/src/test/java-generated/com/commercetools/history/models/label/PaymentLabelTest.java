
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentLabelBuilder builder) {
        PaymentLabel paymentLabel = builder.buildUnchecked();
        Assertions.assertThat(paymentLabel).isInstanceOf(PaymentLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentLabel.builder().key("key") }, new Object[] {
                "amountPlanned",
                PaymentLabel.builder().amountPlanned(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void key() {
        PaymentLabel value = PaymentLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void amountPlanned() {
        PaymentLabel value = PaymentLabel.of();
        value.setAmountPlanned(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmountPlanned())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
