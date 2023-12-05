
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
public class CartSetShippingMethodTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetShippingMethodTaxRateActionBuilder builder) {
        CartSetShippingMethodTaxRateAction cartSetShippingMethodTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingMethodTaxRateAction)
                .isInstanceOf(CartSetShippingMethodTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetShippingMethodTaxRateAction.builder().shippingKey("shippingKey") },
                new Object[] { CartSetShippingMethodTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingMethodTaxRateAction value = CartSetShippingMethodTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetShippingMethodTaxRateAction value = CartSetShippingMethodTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
