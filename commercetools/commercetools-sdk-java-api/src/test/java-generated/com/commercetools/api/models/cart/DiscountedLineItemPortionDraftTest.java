
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountedLineItemPortionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountedLineItemPortionDraftBuilder builder) {
        DiscountedLineItemPortionDraft discountedLineItemPortionDraft = builder.buildUnchecked();
        Assertions.assertThat(discountedLineItemPortionDraft).isInstanceOf(DiscountedLineItemPortionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discount",
                        DiscountedLineItemPortionDraft.builder()
                                .discount(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "discountedAmount", DiscountedLineItemPortionDraft.builder()
                        .discountedAmount(new com.commercetools.api.models.common.TypedMoneyDraftImpl()) } };
    }

    @Test
    public void discount() {
        DiscountedLineItemPortionDraft value = DiscountedLineItemPortionDraft.of();
        value.setDiscount(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscount()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void discountedAmount() {
        DiscountedLineItemPortionDraft value = DiscountedLineItemPortionDraft.of();
        value.setDiscountedAmount(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
        Assertions.assertThat(value.getDiscountedAmount())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
    }
}
