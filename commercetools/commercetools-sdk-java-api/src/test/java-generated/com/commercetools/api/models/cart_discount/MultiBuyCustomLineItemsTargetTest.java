
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultiBuyCustomLineItemsTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MultiBuyCustomLineItemsTargetBuilder builder) {
        MultiBuyCustomLineItemsTarget multiBuyCustomLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(multiBuyCustomLineItemsTarget).isInstanceOf(MultiBuyCustomLineItemsTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", MultiBuyCustomLineItemsTarget.builder().predicate("predicate") },
                new Object[] { "triggerQuantity", MultiBuyCustomLineItemsTarget.builder().triggerQuantity(8) },
                new Object[] { "discountedQuantity", MultiBuyCustomLineItemsTarget.builder().discountedQuantity(3) },
                new Object[] { "maxOccurrence", MultiBuyCustomLineItemsTarget.builder().maxOccurrence(7) },
                new Object[] { "selectionMode",
                        MultiBuyCustomLineItemsTarget.builder()
                                .selectionMode(
                                    com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
