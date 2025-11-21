
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPredicateUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPredicateUpdateActionBuilder builder) {
        SetPredicateUpdateAction setPredicateUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setPredicateUpdateAction).isInstanceOf(SetPredicateUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", SetPredicateUpdateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        SetPredicateUpdateAction value = SetPredicateUpdateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
