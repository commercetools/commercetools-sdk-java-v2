
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetCustomFieldActionBuilder builder) {
        PaymentMethodSetCustomFieldAction paymentMethodSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetCustomFieldAction).isInstanceOf(PaymentMethodSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", PaymentMethodSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", PaymentMethodSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodSetCustomFieldAction value = PaymentMethodSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodSetCustomFieldAction value = PaymentMethodSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
