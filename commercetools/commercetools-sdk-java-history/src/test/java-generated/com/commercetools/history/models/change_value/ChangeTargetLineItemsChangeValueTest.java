
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTargetLineItemsChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTargetLineItemsChangeValueBuilder builder) {
        ChangeTargetLineItemsChangeValue changeTargetLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetLineItemsChangeValue).isInstanceOf(ChangeTargetLineItemsChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ChangeTargetLineItemsChangeValue.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ChangeTargetLineItemsChangeValue value = ChangeTargetLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
