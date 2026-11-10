
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeTaxCalculationModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeTaxCalculationModeActionBuilder builder) {
        StagedOrderChangeTaxCalculationModeAction stagedOrderChangeTaxCalculationModeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeTaxCalculationModeAction)
                .isInstanceOf(StagedOrderChangeTaxCalculationModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxCalculationMode", StagedOrderChangeTaxCalculationModeAction.builder()
                .taxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) } };
    }

    @Test
    public void taxCalculationMode() {
        StagedOrderChangeTaxCalculationModeAction value = StagedOrderChangeTaxCalculationModeAction.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }
}
