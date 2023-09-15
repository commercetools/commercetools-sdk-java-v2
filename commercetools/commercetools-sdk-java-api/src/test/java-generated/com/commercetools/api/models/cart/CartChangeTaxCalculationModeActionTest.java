
package com.commercetools.api.models.cart;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CartChangeTaxCalculationModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeTaxCalculationModeActionBuilder builder) {
        CartChangeTaxCalculationModeAction cartChangeTaxCalculationModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeTaxCalculationModeAction)
                .isInstanceOf(CartChangeTaxCalculationModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartChangeTaxCalculationModeAction.builder()
                .taxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) } };
    }

    @Test
    public void taxCalculationMode() {
        CartChangeTaxCalculationModeAction value = CartChangeTaxCalculationModeAction.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }
}
