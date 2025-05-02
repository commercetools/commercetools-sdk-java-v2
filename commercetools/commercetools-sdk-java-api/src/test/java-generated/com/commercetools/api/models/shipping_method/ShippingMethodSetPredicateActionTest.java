
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetPredicateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetPredicateActionBuilder builder) {
        ShippingMethodSetPredicateAction shippingMethodSetPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetPredicateAction).isInstanceOf(ShippingMethodSetPredicateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ShippingMethodSetPredicateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ShippingMethodSetPredicateAction value = ShippingMethodSetPredicateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
