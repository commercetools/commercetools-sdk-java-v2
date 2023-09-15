
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
public class CartChangeTaxModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeTaxModeActionBuilder builder) {
        CartChangeTaxModeAction cartChangeTaxModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeTaxModeAction).isInstanceOf(CartChangeTaxModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartChangeTaxModeAction.builder()
                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void taxMode() {
        CartChangeTaxModeAction value = CartChangeTaxModeAction.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }
}
