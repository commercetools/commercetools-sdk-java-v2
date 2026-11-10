
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPaymentsConfigurationUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPaymentsConfigurationUpdateActionBuilder builder) {
        SetPaymentsConfigurationUpdateAction setPaymentsConfigurationUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setPaymentsConfigurationUpdateAction)
                .isInstanceOf(SetPaymentsConfigurationUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentsConfiguration",
                SetPaymentsConfigurationUpdateAction.builder()
                        .paymentsConfiguration(
                            new com.commercetools.checkout.models.application.PaymentsConfigurationImpl()) } };
    }

    @Test
    public void paymentsConfiguration() {
        SetPaymentsConfigurationUpdateAction value = SetPaymentsConfigurationUpdateAction.of();
        value.setPaymentsConfiguration(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
        Assertions.assertThat(value.getPaymentsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.PaymentsConfigurationImpl());
    }
}
