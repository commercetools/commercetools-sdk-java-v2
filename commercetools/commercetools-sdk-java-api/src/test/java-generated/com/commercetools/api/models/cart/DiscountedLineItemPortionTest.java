
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedLineItemPortionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedLineItemPortionBuilder builder) {
        DiscountedLineItemPortion discountedLineItemPortion = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPortion).isInstanceOf(DiscountedLineItemPortion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discount",
                        DiscountedLineItemPortion.builder()
                                .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "discountedAmount", DiscountedLineItemPortion.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
