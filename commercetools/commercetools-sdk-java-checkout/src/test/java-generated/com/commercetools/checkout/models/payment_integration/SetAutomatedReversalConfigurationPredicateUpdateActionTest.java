
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAutomatedReversalConfigurationPredicateUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAutomatedReversalConfigurationPredicateUpdateActionBuilder builder) {
        SetAutomatedReversalConfigurationPredicateUpdateAction setAutomatedReversalConfigurationPredicateUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(setAutomatedReversalConfigurationPredicateUpdateAction)
                .isInstanceOf(SetAutomatedReversalConfigurationPredicateUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "predicate",
                SetAutomatedReversalConfigurationPredicateUpdateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        SetAutomatedReversalConfigurationPredicateUpdateAction value = SetAutomatedReversalConfigurationPredicateUpdateAction
                .of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
