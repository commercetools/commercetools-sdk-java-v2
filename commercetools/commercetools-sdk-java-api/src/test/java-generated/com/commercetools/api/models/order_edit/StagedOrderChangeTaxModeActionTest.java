
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeTaxModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeTaxModeActionBuilder builder) {
        StagedOrderChangeTaxModeAction stagedOrderChangeTaxModeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeTaxModeAction).isInstanceOf(StagedOrderChangeTaxModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxMode", StagedOrderChangeTaxModeAction.builder()
                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void taxMode() {
        StagedOrderChangeTaxModeAction value = StagedOrderChangeTaxModeAction.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }
}
