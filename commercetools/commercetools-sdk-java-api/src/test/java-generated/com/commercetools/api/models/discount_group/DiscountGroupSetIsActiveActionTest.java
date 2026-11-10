
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSetIsActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSetIsActiveActionBuilder builder) {
        DiscountGroupSetIsActiveAction discountGroupSetIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSetIsActiveAction).isInstanceOf(DiscountGroupSetIsActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "isActive", DiscountGroupSetIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        DiscountGroupSetIsActiveAction value = DiscountGroupSetIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
