
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAutomatedReversalConfigurationUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAutomatedReversalConfigurationUpdateActionBuilder builder) {
        SetAutomatedReversalConfigurationUpdateAction setAutomatedReversalConfigurationUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(setAutomatedReversalConfigurationUpdateAction)
                .isInstanceOf(SetAutomatedReversalConfigurationUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "automatedReversalConfiguration",
                SetAutomatedReversalConfigurationUpdateAction.builder()
                        .automatedReversalConfiguration(
                            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl()) } };
    }

    @Test
    public void automatedReversalConfiguration() {
        SetAutomatedReversalConfigurationUpdateAction value = SetAutomatedReversalConfigurationUpdateAction.of();
        value.setAutomatedReversalConfiguration(
            new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
        Assertions.assertThat(value.getAutomatedReversalConfiguration())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.AutomatedReversalConfigurationImpl());
    }
}
