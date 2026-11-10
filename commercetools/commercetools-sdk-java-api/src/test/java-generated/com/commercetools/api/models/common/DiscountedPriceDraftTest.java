
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedPriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedPriceDraftBuilder builder) {
        DiscountedPriceDraft discountedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedPriceDraft).isInstanceOf(DiscountedPriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        DiscountedPriceDraft.builder().value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "discount", DiscountedPriceDraft.builder()
                        .discount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl()) } };
    }

    @Test
    public void value() {
        DiscountedPriceDraft value = DiscountedPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void discount() {
        DiscountedPriceDraft value = DiscountedPriceDraft.of();
        value.setDiscount(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl());
    }
}
