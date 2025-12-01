
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountOnTotalPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountOnTotalPriceBuilder builder) {
        DiscountOnTotalPrice discountOnTotalPrice = builder.buildUnchecked();
        Assertions.assertThat(discountOnTotalPrice).isInstanceOf(DiscountOnTotalPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discountedAmount",
                        DiscountOnTotalPrice.builder()
                                .discountedAmount(new com.commercetools.history.models.common.TypedMoneyImpl()) },
                new Object[] { "includedDiscounts",
                        DiscountOnTotalPrice.builder()
                                .includedDiscounts(Collections.singletonList(
                                    new com.commercetools.history.models.common.DiscountedTotalPricePortionImpl())) },
                new Object[] { "discountedNetAmount",
                        DiscountOnTotalPrice.builder()
                                .discountedNetAmount(new com.commercetools.history.models.common.TypedMoneyImpl()) },
                new Object[] { "discountedGrossAmount", DiscountOnTotalPrice.builder()
                        .discountedGrossAmount(new com.commercetools.history.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discountedAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedAmount(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.history.models.common.DiscountedTotalPricePortionImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.DiscountedTotalPricePortionImpl()));
    }

    @Test
    public void discountedNetAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedNetAmount(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedNetAmount())
                .isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }

    @Test
    public void discountedGrossAmount() {
        DiscountOnTotalPrice value = DiscountOnTotalPrice.of();
        value.setDiscountedGrossAmount(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedGrossAmount())
                .isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }
}
