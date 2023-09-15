
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
public class CartSetLineItemTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemTaxRateActionBuilder builder) {
        CartSetLineItemTaxRateAction cartSetLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemTaxRateAction).isInstanceOf(CartSetLineItemTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetLineItemTaxRateAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemTaxRateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { CartSetLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
