
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AutomatedReversalConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AutomatedReversalConfigurationBuilder builder) {
        AutomatedReversalConfiguration automatedReversalConfiguration = builder.buildUnchecked();
        Assertions.assertThat(automatedReversalConfiguration).isInstanceOf(AutomatedReversalConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", AutomatedReversalConfiguration.builder().status("status") },
                new Object[] { "predicate", AutomatedReversalConfiguration.builder().predicate("predicate") } };
    }

    @Test
    public void status() {
        AutomatedReversalConfiguration value = AutomatedReversalConfiguration.of();
        value.setStatus("status");
        Assertions.assertThat(value.getStatus()).isEqualTo("status");
    }

    @Test
    public void predicate() {
        AutomatedReversalConfiguration value = AutomatedReversalConfiguration.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
