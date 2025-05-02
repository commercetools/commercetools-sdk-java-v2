
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DirectDiscountTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DirectDiscountBuilder builder) {
        DirectDiscount directDiscount = builder.buildUnchecked();
        Assertions.assertThat(directDiscount).isInstanceOf(DirectDiscount.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DirectDiscount.builder().id("id") },
                new Object[] { "value",
                        DirectDiscount.builder()
                                .value(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl()) },
                new Object[] { "target", DirectDiscount.builder()
                        .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void id() {
        DirectDiscount value = DirectDiscount.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void value() {
        DirectDiscount value = DirectDiscount.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
    }

    @Test
    public void target() {
        DirectDiscount value = DirectDiscount.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
