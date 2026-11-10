
package com.commercetools.importapi.models.orders;

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
                new Object[] { "discount", DiscountedLineItemPortion.builder()
                        .discount(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl()) },
                new Object[] { "discountedAmount", DiscountedLineItemPortion.builder()
                        .discountedAmount(new com.commercetools.importapi.models.common.MoneyImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscount(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl());
        Assertions.assertThat(value.getDiscount())
                .isEqualTo(new com.commercetools.importapi.models.common.CartDiscountKeyReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortion value = DiscountedLineItemPortion.of();
        value.setDiscountedAmount(new com.commercetools.importapi.models.common.MoneyImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.importapi.models.common.MoneyImpl());
    }
}
