
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedLineItemPriceDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedLineItemPriceDraftBuilder builder) {
        DiscountedLineItemPriceDraft discountedLineItemPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPriceDraft).isInstanceOf(DiscountedLineItemPriceDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        DiscountedLineItemPriceDraft.builder()
                                .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "includedDiscounts",
                        DiscountedLineItemPriceDraft.builder()
                                .includedDiscounts(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPortionDraftImpl())) } };
    }

    @Test
    public void value() {
        DiscountedLineItemPriceDraft value = DiscountedLineItemPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void includedDiscounts() {
        DiscountedLineItemPriceDraft value = DiscountedLineItemPriceDraft.of();
        value.setIncludedDiscounts(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionDraftImpl()));
        Assertions.assertThat(value.getIncludedDiscounts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPortionDraftImpl()));
    }
}
