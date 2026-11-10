
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueAbsoluteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueAbsoluteDraftBuilder builder) {
        CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueAbsoluteDraft).isInstanceOf(CartDiscountValueAbsoluteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "money", CartDiscountValueAbsoluteDraft.builder()
                        .money(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl())) },
                new Object[] { "applicationMode",
                        CartDiscountValueAbsoluteDraft.builder()
                                .applicationMode(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                                        .findEnum("ProportionateDistribution")) } };
    }

    @Test
    public void money() {
        CartDiscountValueAbsoluteDraft value = CartDiscountValueAbsoluteDraft.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
    }

    @Test
    public void applicationMode() {
        CartDiscountValueAbsoluteDraft value = CartDiscountValueAbsoluteDraft.of();
        value.setApplicationMode(
            com.commercetools.api.models.cart_discount.DiscountApplicationMode.findEnum("ProportionateDistribution"));
        Assertions.assertThat(value.getApplicationMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                        .findEnum("ProportionateDistribution"));
    }
}
