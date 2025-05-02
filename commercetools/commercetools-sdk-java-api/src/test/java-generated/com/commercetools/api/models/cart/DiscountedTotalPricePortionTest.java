
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedTotalPricePortionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedTotalPricePortionBuilder builder) {
        DiscountedTotalPricePortion discountedTotalPricePortion = builder.buildUnchecked();
        Assertions.assertThat(discountedTotalPricePortion).isInstanceOf(DiscountedTotalPricePortion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discount",
                        DiscountedTotalPricePortion.builder()
                                .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "discountedAmount", DiscountedTotalPricePortion.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedTotalPricePortion value = DiscountedTotalPricePortion.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedTotalPricePortion value = DiscountedTotalPricePortion.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
