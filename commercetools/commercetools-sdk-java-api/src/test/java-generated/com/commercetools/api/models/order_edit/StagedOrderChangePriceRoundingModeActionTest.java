
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangePriceRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangePriceRoundingModeActionBuilder builder) {
        StagedOrderChangePriceRoundingModeAction stagedOrderChangePriceRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangePriceRoundingModeAction)
                .isInstanceOf(StagedOrderChangePriceRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceRoundingMode", StagedOrderChangePriceRoundingModeAction.builder()
                .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void priceRoundingMode() {
        StagedOrderChangePriceRoundingModeAction value = StagedOrderChangePriceRoundingModeAction.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
