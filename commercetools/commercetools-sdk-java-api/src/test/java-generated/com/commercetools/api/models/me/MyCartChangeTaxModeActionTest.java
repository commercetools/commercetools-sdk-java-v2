
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartChangeTaxModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartChangeTaxModeActionBuilder builder) {
        MyCartChangeTaxModeAction myCartChangeTaxModeAction = builder.buildUnchecked();
        Assertions.assertThat(myCartChangeTaxModeAction).isInstanceOf(MyCartChangeTaxModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxMode", MyCartChangeTaxModeAction.builder()
                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void taxMode() {
        MyCartChangeTaxModeAction value = MyCartChangeTaxModeAction.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }
}
