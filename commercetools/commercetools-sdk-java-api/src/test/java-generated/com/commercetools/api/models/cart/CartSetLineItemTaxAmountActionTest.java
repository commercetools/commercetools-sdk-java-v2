
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
public class CartSetLineItemTaxAmountActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemTaxAmountActionBuilder builder) {
        CartSetLineItemTaxAmountAction cartSetLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemTaxAmountAction).isInstanceOf(CartSetLineItemTaxAmountAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetLineItemTaxAmountAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemTaxAmountAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { CartSetLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
