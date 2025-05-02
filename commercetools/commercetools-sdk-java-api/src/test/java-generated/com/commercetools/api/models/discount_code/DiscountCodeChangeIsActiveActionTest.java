
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeChangeIsActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeChangeIsActiveActionBuilder builder) {
        DiscountCodeChangeIsActiveAction discountCodeChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeIsActiveAction).isInstanceOf(DiscountCodeChangeIsActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isActive", DiscountCodeChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        DiscountCodeChangeIsActiveAction value = DiscountCodeChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
