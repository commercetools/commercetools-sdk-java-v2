
package com.commercetools.history.models.common;

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
                                .value(new com.commercetools.history.models.common.CartDiscountValueImpl()) },
                new Object[] { "target", DirectDiscount.builder()
                        .target(new com.commercetools.history.models.common.CartDiscountTargetImpl()) } };
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
        value.setValue(new com.commercetools.history.models.common.CartDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.history.models.common.CartDiscountValueImpl());
    }

    @Test
    public void target() {
        DirectDiscount value = DirectDiscount.of();
        value.setTarget(new com.commercetools.history.models.common.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.history.models.common.CartDiscountTargetImpl());
    }
}
