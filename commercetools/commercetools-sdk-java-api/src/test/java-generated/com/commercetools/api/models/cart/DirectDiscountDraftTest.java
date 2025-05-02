
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DirectDiscountDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DirectDiscountDraftBuilder builder) {
        DirectDiscountDraft directDiscountDraft = builder.buildUnchecked();
        Assertions.assertThat(directDiscountDraft).isInstanceOf(DirectDiscountDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        DirectDiscountDraft.builder()
                                .value(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl()) },
                new Object[] { "target", DirectDiscountDraft.builder()
                        .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void value() {
        DirectDiscountDraft value = DirectDiscountDraft.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
    }

    @Test
    public void target() {
        DirectDiscountDraft value = DirectDiscountDraft.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
