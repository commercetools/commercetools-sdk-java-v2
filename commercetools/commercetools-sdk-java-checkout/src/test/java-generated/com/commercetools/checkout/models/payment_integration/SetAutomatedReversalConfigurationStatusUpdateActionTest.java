
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAutomatedReversalConfigurationStatusUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAutomatedReversalConfigurationStatusUpdateActionBuilder builder) {
        SetAutomatedReversalConfigurationStatusUpdateAction setAutomatedReversalConfigurationStatusUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(setAutomatedReversalConfigurationStatusUpdateAction)
                .isInstanceOf(SetAutomatedReversalConfigurationStatusUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status",
                SetAutomatedReversalConfigurationStatusUpdateAction.builder().status("status") } };
    }

    @Test
    public void status() {
        SetAutomatedReversalConfigurationStatusUpdateAction value = SetAutomatedReversalConfigurationStatusUpdateAction
                .of();
        value.setStatus("status");
        Assertions.assertThat(value.getStatus()).isEqualTo("status");
    }
}
