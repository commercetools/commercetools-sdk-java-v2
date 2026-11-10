
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTargetMultiBuyLineItemsChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTargetMultiBuyLineItemsChangeValueBuilder builder) {
        ChangeTargetMultiBuyLineItemsChangeValue changeTargetMultiBuyLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetMultiBuyLineItemsChangeValue)
                .isInstanceOf(ChangeTargetMultiBuyLineItemsChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ChangeTargetMultiBuyLineItemsChangeValue.builder().predicate("predicate") },
                new Object[] { "triggerQuantity",
                        ChangeTargetMultiBuyLineItemsChangeValue.builder().triggerQuantity(8) },
                new Object[] { "discountedQuantity",
                        ChangeTargetMultiBuyLineItemsChangeValue.builder().discountedQuantity(3) },
                new Object[] { "maxOccurrence", ChangeTargetMultiBuyLineItemsChangeValue.builder().maxOccurrence(7) },
                new Object[] { "selectionMode", ChangeTargetMultiBuyLineItemsChangeValue.builder()
                        .selectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setSelectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
    }
}
