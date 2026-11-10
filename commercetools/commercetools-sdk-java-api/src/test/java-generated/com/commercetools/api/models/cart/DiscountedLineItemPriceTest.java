
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedLineItemPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedLineItemPriceBuilder builder) {
        DiscountedLineItemPrice discountedLineItemPrice = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPrice).isInstanceOf(DiscountedLineItemPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        DiscountedLineItemPrice.builder()
                                .value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "includedDiscounts",
                        DiscountedLineItemPrice.builder()
                                .includedDiscounts(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl())) } };
    }

    @Test
    public void value() {
        DiscountedLineItemPrice value = DiscountedLineItemPrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountedLineItemPrice value = DiscountedLineItemPrice.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionImpl()));
    }
}
