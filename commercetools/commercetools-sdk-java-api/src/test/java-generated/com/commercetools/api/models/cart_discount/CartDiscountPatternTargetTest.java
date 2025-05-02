
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountPatternTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountPatternTargetBuilder builder) {
        CartDiscountPatternTarget cartDiscountPatternTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountPatternTarget).isInstanceOf(CartDiscountPatternTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "triggerPattern",
                        CartDiscountPatternTarget.builder()
                                .triggerPattern(Collections.singletonList(
                                    new com.commercetools.api.models.cart_discount.PatternComponentImpl())) },
                new Object[] { "targetPattern",
                        CartDiscountPatternTarget.builder()
                                .targetPattern(Collections.singletonList(
                                    new com.commercetools.api.models.cart_discount.PatternComponentImpl())) },
                new Object[] { "maxOccurrence", CartDiscountPatternTarget.builder().maxOccurrence(7) },
                new Object[] { "selectionMode",
                        CartDiscountPatternTarget.builder()
                                .selectionMode(
                                    com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void triggerPattern() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setTriggerPattern(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTriggerPattern())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void targetPattern() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setTargetPattern(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTargetPattern())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void maxOccurrence() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
