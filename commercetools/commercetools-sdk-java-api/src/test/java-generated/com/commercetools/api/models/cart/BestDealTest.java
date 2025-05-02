
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BestDealTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BestDealBuilder builder) {
        BestDeal bestDeal = builder.buildUnchecked();
        Assertions.assertThat(bestDeal).isInstanceOf(BestDeal.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "chosenDiscountType", BestDeal.builder().chosenDiscountType("chosenDiscountType") } };
    }

    @Test
    public void chosenDiscountType() {
        BestDeal value = BestDeal.of();
        value.setChosenDiscountType("chosenDiscountType");
        Assertions.assertThat(value.getChosenDiscountType()).isEqualTo("chosenDiscountType");
    }
}
