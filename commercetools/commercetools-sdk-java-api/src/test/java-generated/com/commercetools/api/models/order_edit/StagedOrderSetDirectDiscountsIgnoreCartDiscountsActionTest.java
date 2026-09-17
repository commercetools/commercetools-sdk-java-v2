
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder) {
        StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction stagedOrderSetDirectDiscountsIgnoreCartDiscountsAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetDirectDiscountsIgnoreCartDiscountsAction)
                .isInstanceOf(StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "directDiscountsIgnoreCartDiscounts",
                StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction.builder()
                        .directDiscountsIgnoreCartDiscounts(true) } };
    }

    @Test
    public void directDiscountsIgnoreCartDiscounts() {
        StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction value = StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
                .of();
        value.setDirectDiscountsIgnoreCartDiscounts(true);
        Assertions.assertThat(value.getDirectDiscountsIgnoreCartDiscounts()).isEqualTo(true);
    }
}
