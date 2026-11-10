
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTargetCustomLineItemsChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTargetCustomLineItemsChangeValueBuilder builder) {
        ChangeTargetCustomLineItemsChangeValue changeTargetCustomLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetCustomLineItemsChangeValue)
                .isInstanceOf(ChangeTargetCustomLineItemsChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ChangeTargetCustomLineItemsChangeValue.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ChangeTargetCustomLineItemsChangeValue value = ChangeTargetCustomLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
