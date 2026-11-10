
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeTaxRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeTaxRoundingModeActionBuilder builder) {
        StagedOrderChangeTaxRoundingModeAction stagedOrderChangeTaxRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeTaxRoundingModeAction)
                .isInstanceOf(StagedOrderChangeTaxRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxRoundingMode", StagedOrderChangeTaxRoundingModeAction.builder()
                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void taxRoundingMode() {
        StagedOrderChangeTaxRoundingModeAction value = StagedOrderChangeTaxRoundingModeAction.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
