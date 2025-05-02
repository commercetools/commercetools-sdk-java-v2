
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultiBuyLineItemsTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MultiBuyLineItemsTargetBuilder builder) {
        MultiBuyLineItemsTarget multiBuyLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(multiBuyLineItemsTarget).isInstanceOf(MultiBuyLineItemsTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "predicate", MultiBuyLineItemsTarget.builder().predicate("predicate") },
                new Object[] { "triggerQuantity", MultiBuyLineItemsTarget.builder().triggerQuantity(8) },
                new Object[] { "discountedQuantity", MultiBuyLineItemsTarget.builder().discountedQuantity(3) },
                new Object[] { "maxOccurrence", MultiBuyLineItemsTarget.builder().maxOccurrence(7) },
                new Object[] { "selectionMode",
                        MultiBuyLineItemsTarget.builder()
                                .selectionMode(
                                    com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
