
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
public class CartSetCustomLineItemTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetCustomLineItemTaxRateActionBuilder builder) {
        CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemTaxRateAction)
                .isInstanceOf(CartSetCustomLineItemTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetCustomLineItemTaxRateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { CartSetCustomLineItemTaxRateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartSetCustomLineItemTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { CartSetCustomLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
