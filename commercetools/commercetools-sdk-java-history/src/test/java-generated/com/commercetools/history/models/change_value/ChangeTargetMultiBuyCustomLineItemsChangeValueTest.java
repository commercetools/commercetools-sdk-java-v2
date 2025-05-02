
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTargetMultiBuyCustomLineItemsChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder) {
        ChangeTargetMultiBuyCustomLineItemsChangeValue changeTargetMultiBuyCustomLineItemsChangeValue = builder
                .buildUnchecked();
        Assertions.assertThat(changeTargetMultiBuyCustomLineItemsChangeValue)
                .isInstanceOf(ChangeTargetMultiBuyCustomLineItemsChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate",
                        ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().predicate("predicate") },
                new Object[] { "triggerQuantity",
                        ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().triggerQuantity(8) },
                new Object[] { "discountedQuantity",
                        ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().discountedQuantity(3) },
                new Object[] { "maxOccurrence",
                        ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().maxOccurrence(7) },
                new Object[] { "selectionMode", ChangeTargetMultiBuyCustomLineItemsChangeValue.builder()
                        .selectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setSelectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
    }
}
