
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPaymentReturnUrlUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPaymentReturnUrlUpdateActionBuilder builder) {
        SetPaymentReturnUrlUpdateAction setPaymentReturnUrlUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setPaymentReturnUrlUpdateAction).isInstanceOf(SetPaymentReturnUrlUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentReturnUrl",
                SetPaymentReturnUrlUpdateAction.builder().paymentReturnUrl("paymentReturnUrl") } };
    }

    @Test
    public void paymentReturnUrl() {
        SetPaymentReturnUrlUpdateAction value = SetPaymentReturnUrlUpdateAction.of();
        value.setPaymentReturnUrl("paymentReturnUrl");
        Assertions.assertThat(value.getPaymentReturnUrl()).isEqualTo("paymentReturnUrl");
    }
}
