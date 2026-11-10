
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDirectDiscountsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDirectDiscountsActionBuilder builder) {
        StagedOrderSetDirectDiscountsAction stagedOrderSetDirectDiscountsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDirectDiscountsAction)
                .isInstanceOf(StagedOrderSetDirectDiscountsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discounts", StagedOrderSetDirectDiscountsAction.builder()
                .discounts(
                    Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl())) } };
    }

    @Test
    public void discounts() {
        StagedOrderSetDirectDiscountsAction value = StagedOrderSetDirectDiscountsAction.of();
        value.setDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
        Assertions.assertThat(value.getDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
    }
}
