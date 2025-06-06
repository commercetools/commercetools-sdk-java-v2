
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedPriceBuilder builder) {
        DiscountedPrice discountedPrice = builder.buildUnchecked();
        Assertions.assertThat(discountedPrice).isInstanceOf(DiscountedPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        DiscountedPrice.builder().value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "discount", DiscountedPrice.builder()
                        .discount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl()) } };
    }

    @Test
    public void value() {
        DiscountedPrice value = DiscountedPrice.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void discount() {
        DiscountedPrice value = DiscountedPrice.of();
        value.setDiscount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
    }
}
