
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
public class CartSetCustomLineItemTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetCustomLineItemTaxAmountActionBuilder builder) {
        CartSetCustomLineItemTaxAmountAction cartSetCustomLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemTaxAmountAction)
                .isInstanceOf(CartSetCustomLineItemTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetCustomLineItemTaxAmountAction.builder().customLineItemId("customLineItemId") },
                new Object[] { CartSetCustomLineItemTaxAmountAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartSetCustomLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { CartSetCustomLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
